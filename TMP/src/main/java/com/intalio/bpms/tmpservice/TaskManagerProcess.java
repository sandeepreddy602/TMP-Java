package com.intalio.bpms.tmpservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.ADBException;
import org.apache.axis2.databinding.types.Duration;
import org.intalio.tempo.workflow.auth.AuthIdentifierSet;
import org.intalio.tempo.workflow.task.PATask;
import org.intalio.tempo.workflow.task.Task;
import org.intalio.tempo.workflow.task.TaskState;
import org.intalio.tempo.workflow.task.attachments.Attachment;
import org.intalio.tempo.workflow.task.attachments.AttachmentMetadata;
import org.intalio.tempo.workflow.task.xml.TaskUnmarshaller;
import org.intalio.tempo.workflow.tms.TMSException;
import org.intalio.tempo.workflow.tms.server.ITMSServer;
import org.intalio.tempo.workflow.tms.server.dao.ITaskDAOConnection;
import org.intalio.tempo.workflow.util.xml.InvalidInputFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import com.intalio.bpms.convertor.Convertor;
import com.intalio.bpms.dao.BpelDao;
import com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub;
import com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.Attachments_type0;
import com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.NotifyTaskCompletionRequest;
import com.intalio.bpms.workflow.ib4p_20051115.ChainedExecution;
import com.intalio.bpms.workflow.ib4p_20051115.ClaimTaskRequest;
import com.intalio.bpms.workflow.ib4p_20051115.ClaimTaskResponse;
import com.intalio.bpms.workflow.ib4p_20051115.CompleteTaskRequest;
import com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest;
import com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest;
import com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse;
import com.intalio.bpms.workflow.ib4p_20051115.Response;
import com.intalio.bpms.workflow.ib4p_20051115.RevokeTaskRequest;
import com.intalio.bpms.workflow.ib4p_20051115.RevokeTaskResponse;
import com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest;
import com.intalio.bpms.workflow.ib4p_20051115.TaskMetaDataType;
import com.intalio.tempo.workflow.processes.xpath.UID;

public class TaskManagerProcess {
    
    public ITMSServer getTmsServer() {
		return _tmsServer;
	}

	public void setTmsServer(ITMSServer tmsServer) {
		this._tmsServer = tmsServer;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public ITaskDAOConnection getDao() {
		return dao;
	}

	public void setDao(ITaskDAOConnection dao) {
		this.dao = dao;
	}

	public Response getCreateTaskResponse() {
		return _createTaskResponse;
	}

	public void setCreateTaskResponse(Response createTaskResponse) {
		this._createTaskResponse = createTaskResponse;
	}

	public CreateTaskRequest get_createTaskRequest() {
		return _createTaskRequest;
	}

	public void setCreateTaskRequest(CreateTaskRequest createTaskRequest) {
		this._createTaskRequest = createTaskRequest;
	}

	public ChainedExecution get_nextTaskReadyRequest() {
		return _nextTaskReadyRequest;
	}

	public void setNextTaskReadyRequest(ChainedExecution nextTaskReadyRequest) {
		this._nextTaskReadyRequest = nextTaskReadyRequest;
	}

	public boolean isTaskCompleted() {
		return _taskCompleted;
	}

	public void setTaskCompleted(boolean taskCompleted) {
		this._taskCompleted = taskCompleted;
	}

	public boolean isTaskClaimed() {
		return _taskClaimed;
	}

	public void setTaskClaimed(boolean taskClaimed) {
		this._taskClaimed = taskClaimed;
	}

	public boolean isTaskEscalated() {
		return _taskEscalated;
	}

	public void setTaskEscalated(boolean taskEscalated) {
		this._taskEscalated = taskEscalated;
	}

	public Owners getInitialOwners() {
		return _initialOwners;
	}

	public void setInitialOwners(Owners initialOwners) {
		this._initialOwners = initialOwners;
	}

	public EscalateTaskRequest get_escalateTaskRequest() {
		return _escalateTaskRequest;
	}

	public void setEscalateTaskRequest(EscalateTaskRequest escalateTaskRequest) {
		this._escalateTaskRequest = escalateTaskRequest;
	}

	private ITMSServer _tmsServer;
    private String processId;
    private ITaskDAOConnection dao;
    private Logger _log = LoggerFactory.getLogger(UserBusinessProcessServiceSkeleton.class);
    private Response _createTaskResponse;
    private CreateTaskRequest _createTaskRequest;
    private ChainedExecution _nextTaskReadyRequest;
    private boolean _taskCompleted;
    private boolean _taskClaimed;
    private boolean _taskEscalated;
    private Owners _initialOwners;
    private EscalateTaskRequest _escalateTaskRequest;
    
    public TaskManagerProcess(){
    	// TODO write the timer functionality here
    }
    
    public  com.intalio.bpms.workflow.ib4p_20051115.Response createTask(
            final com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest createTaskRequest) throws ADBException, InterruptedException { 
        _createTaskRequest = createTaskRequest;
        TaskMetaDataType taskMetaDataType = createTaskRequest.getTaskMetaData();
        com.intalio.bpms.workflow.ib4p_20051115.Response createTaskResponse = new Response();
        Calendar creationDate =null;
        
        
        
        TaskMetaDataType taskMetaDataType2 = new TaskMetaDataType();
        String taskId = UID.create()+processId;
        taskMetaDataType2.setTaskId(taskId);
        taskMetaDataType2.setProcessId(taskMetaDataType.getProcessId());
        taskMetaDataType2.setFormUrl(taskMetaDataType.getFormUrl());
        createTaskResponse.setTaskMetaData(taskMetaDataType2);
        
        
        if(taskMetaDataType.getScheduledActions()!= null){
            if(taskMetaDataType.getScheduledActions().getDeferActivation()!= null){
                if(taskMetaDataType.getScheduledActions().getDeferActivation().getUntil()!=null){
                    Timer timer = new Timer();
                    final Calendar tillDate = taskMetaDataType.getScheduledActions().getDeferActivation().getUntil();
                    Date untilDate = new Date(tillDate.getTimeInMillis());
                    creationDate = tillDate;
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                                try {
                                    createTMSTask(createTaskRequest, tillDate);
                                } catch (ADBException e) {   
                                    _log.error(e.getMessage());
                                } catch (InterruptedException e) {  
                                    _log.error(e.getMessage());
                                }
                        }
                    }, untilDate);
        //            while(!notified){
        //                Thread.sleep(1);
        //            }
                }else if(taskMetaDataType.getScheduledActions().getDeferActivation().get_for()!=null){
                    Timer timer = new Timer();
                    Duration forDuration = taskMetaDataType.getScheduledActions().getDeferActivation().get_for();
                    final Calendar tillDate = forDuration.getAsCalendar();
                    Date untilDate = new Date(tillDate.getTimeInMillis());
                    creationDate = tillDate;
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            try {
                                createTMSTask(createTaskRequest, tillDate);
                            } catch (ADBException e) {                      
                                _log.error(e.getMessage());
                            } catch (InterruptedException e) {                        
                                _log.error(e.getMessage());
                            }
                    }
                    }, untilDate);
        //            while(!notified){
        //                Thread.sleep(1);
        //            }
                 }
             }       
        }else{       
            creationDate = Calendar.getInstance();
            createTMSTask(createTaskRequest, creationDate);
        }

        
        taskMetaDataType2.setCreationDate(creationDate);
        _createTaskResponse = createTaskResponse;
        BpelDao.persistTMP(this);
        return createTaskResponse;

    }
    
    public void createTMSTask(CreateTaskRequest createTaskRequest, Calendar creationDate) throws ADBException, InterruptedException {

        createTaskRequest.getTaskMetaData().setCreationDate(creationDate);
        createTaskRequest.getOMElement(com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        String participantToken = createTaskRequest.getParticipantToken();
        TaskMetaDataType taskMetaDataType = createTaskRequest.getTaskMetaData();
        OMElement taskInputElement = createTaskRequest.getTaskInput();
        
        PATask task = new Convertor().convertToTask(taskMetaDataType, taskInputElement);

        Document inputDocument = null;
        
        try {
            _tmsServer.create(dao, task, participantToken);
        } catch (TMSException e) {
            
            _log.error(e.getMessage(), e);
        }
        
        if(createTaskRequest.getTaskMetaData().getIsChainedBefore()){
            
            TMPServiceSkeleton tmpServiceSkeleton = new TMPServiceSkeleton();
            ChainedExecution chainedExecution = new ChainedExecution();
            chainedExecution.setNextTaskId(_createTaskResponse.getTaskMetaData().getTaskId());
            chainedExecution.setNextTaskURL(createTaskRequest.getTaskMetaData().getFormUrl().toString());
            chainedExecution.setPreviousTaskId(createTaskRequest.getTaskMetaData().getPreviousTaskId());
            tmpServiceSkeleton.nextTaskReady(chainedExecution);
        }
        
    }

    public Response completeTask(CompleteTaskRequest completeTaskRequest) throws TMSException, RemoteException{
        Response completeTaskResponse = new Response();
        String participantToken = completeTaskRequest.getParticipantToken();
        TaskMetaDataType taskMetaDataType = completeTaskRequest.getTaskMetaData();
        String taskId = taskMetaDataType.getTaskId();
        throwExceptionIfNull(taskId, "taskId");
        String requestedUser = completeTaskRequest.getUser();
        
        Task task = _tmsServer.getTaskOwnerAndState(dao, taskId, participantToken);
        TaskState taskState = null;
        String[] userOwners = null;
        if(task instanceof PATask){
            taskState = ((PATask)task).getState();
            userOwners = (String[]) ((PATask)task).getUserOwners().toArray();
        }
        if(TaskState.COMPLETED.equals(taskState)){
            completeTaskResponse.setErrorCode("ERROR");
            completeTaskResponse.setErrorReason("The task has been completed already");
            _taskCompleted = true;
            BpelDao.persistTMP(this);
            return completeTaskResponse;
        }else if(TaskState.CLAIMED.equals(taskState) && !userOwners[0].equals(requestedUser)){
            completeTaskResponse.setErrorCode("ERROR");
            completeTaskResponse.setErrorReason("The task has been claimed by "+userOwners[0]);
            BpelDao.persistTMP(this);
            return completeTaskResponse;
        }else{
            OMElement outputElement = completeTaskRequest.getTaskOutput();
            throwExceptionIfNull(outputElement, "taskOutput");
            Document output = null;
            if (outputElement.getFirstElement() != null) {
                output = new Convertor().unmarshalTaskOutput(outputElement);
            }
            _tmsServer.setOutputAndComplete(dao, taskId, output, participantToken);
            
            Attachment[] attachments  = _tmsServer.getAttachments(dao, taskId, participantToken);
            if(_createTaskRequest.getTaskMetaData().getUserProcessEndpoint() != null){
               completeTaskResponse.setStatus("OK");
               BpelDao.persistTMP(this);
               return completeTaskResponse;
            }else{
                UserBusinessProcessesServicesStub ubpStub = new UserBusinessProcessesServicesStub();
                NotifyTaskCompletionRequest notifyTaskCompletionRequest1 = new NotifyTaskCompletionRequest();
                notifyTaskCompletionRequest1.setTaskOutput(outputElement);
                notifyTaskCompletionRequest1.setStatus("OK");
                notifyTaskCompletionRequest1.setUser(requestedUser);
                com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.TaskMetaDataType taskMetaDataType2 =
                    new com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.TaskMetaDataType();
                taskMetaDataType2.setTaskId(taskId);
                if(_createTaskRequest.getTaskMetaData() !=null){
                    taskMetaDataType2.setProcessId(_createTaskRequest.getTaskMetaData().getProcessId());
                    taskMetaDataType2.setUserProcessEndpoint(_createTaskRequest.getTaskMetaData().getUserProcessEndpoint());
                    taskMetaDataType2.setUserProcessNamespaceURI(_createTaskRequest.getTaskMetaData().getUserProcessNamespaceURI());
                    taskMetaDataType2.setUserProcessCompleteSOAPAction(_createTaskRequest.getTaskMetaData().getUserProcessCompleteSOAPAction());
                    taskMetaDataType2.setSession(_createTaskRequest.getTaskMetaData().getSession());
                    taskMetaDataType2.setAttachments(marshallAttachments(attachments));
                }
                notifyTaskCompletionRequest1.setTaskMetaData(taskMetaDataType2);
                com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.Response notifyTaskCompletionResponse = 
                    ubpStub.notifyTaskCompletion(notifyTaskCompletionRequest1);
                if(notifyTaskCompletionResponse.getIsChainedAfter()){
                    //TODO nextTaskReady is invoked by the next TaskManager. Implemented in ode
                    TaskMetaDataType taskMetaDataType3 = new TaskMetaDataType();
                    taskMetaDataType3.setNextTaskId(_nextTaskReadyRequest.getNextTaskId());
                    taskMetaDataType3.setNextTaskURL(_nextTaskReadyRequest.getNextTaskURL());
                    completeTaskResponse.setTaskMetaData(taskMetaDataType3);
                    completeTaskResponse.setStatus("OK");
                    
                }
                completeTaskResponse.setStatus(notifyTaskCompletionResponse.getStatus());
                completeTaskResponse.setErrorCode(notifyTaskCompletionResponse.getErrorCode());
                completeTaskResponse.setErrorReason(notifyTaskCompletionResponse.getErrorReason());
                _taskCompleted = true;
                BpelDao.persistTMP(this);
                return completeTaskResponse;
                
            }
            
        }
    }

    private Attachments_type0 marshallAttachments(Attachment[] attachments) {
        Attachments_type0 attachments2 = new Attachments_type0();
        for (int i = 0; i < attachments.length; i++) {
            Attachment attachment = attachments[i];
            AttachmentMetadata attachmentMetadata = attachment.getMetadata();
            URL payloadUrl = attachment.getPayloadURL();
            
            com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.AttachmentMetadata attachmentMetadata2 = 
                                            new com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.AttachmentMetadata();
            
            if(attachmentMetadata != null){
                Calendar creationDate = Calendar.getInstance();
                creationDate.setTimeInMillis(attachmentMetadata.getCreationDate().getTime());
                attachmentMetadata2.setCreationDate(creationDate);
                attachmentMetadata2.setDescription(attachmentMetadata.getDescription());
                attachmentMetadata2.setFileName(attachmentMetadata.getFileName());
                attachmentMetadata2.setMimeType(attachmentMetadata.getMimeType());
                attachmentMetadata2.setTitle(attachmentMetadata.getTitle());
            }
            com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.Attachment attachment2 = 
                            new com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.Attachment();
            attachment2.setAttachmentMetadata(attachmentMetadata2);
            attachment2.setPayloadUrl(payloadUrl.toString());
            attachments2.addAttachment(attachment2);
        }

        return attachments2;
    }

    public RevokeTaskResponse revokeTask(RevokeTaskRequest revokeTaskRequest) throws TMSException {
        RevokeTaskResponse revokeTaskResponse = new RevokeTaskResponse();
    	if(_taskClaimed)
        	return revokeTaskResponse;
    	else{
    		String taskId = revokeTaskRequest.getTaskId();
    		String participantToken = revokeTaskRequest.getParticipantToken();
    		TaskState taskState = TaskState.valueOf("READY");
    		List<String> userOwners = _initialOwners.getUserOwners();
    		List<String> roleOwners = _initialOwners.getRoleOwners();
    		AuthIdentifierSet users = new AuthIdentifierSet();
    		AuthIdentifierSet roles = new AuthIdentifierSet();
    		for (String user : userOwners) {
				users.add(user);
			}
    		for(String role : roleOwners){
    			roles.add(role);
    		}
    		_tmsServer.reassign(dao, taskId, users, roles, taskState, participantToken, null);
    	}
    	BpelDao.persistTMP(this);
        return revokeTaskResponse;
    }

    public ClaimTaskResponse claimTask(ClaimTaskRequest claimTaskRequest) throws TMSException {
        ClaimTaskResponse claimTaskResponse = new ClaimTaskResponse();
        String participantToken = claimTaskRequest.getParticipantToken();
        String taskId = claimTaskRequest.getTaskId(); 
        throwExceptionIfNull(taskId, "taskId");
        String requestedUser = claimTaskRequest.getClaimerUser();
        
        Task task = _tmsServer.getTaskOwnerAndState(dao, taskId, participantToken);
        TaskState taskState = null;
        String[] userOwners = null;
        if(task instanceof PATask){
            taskState = ((PATask)task).getState();
            userOwners = (String[]) ((PATask)task).getUserOwners().toArray();
        }
        if(TaskState.COMPLETED.equals(taskState)){
            claimTaskResponse.setStatus("The task has been completed already");
            _taskClaimed = true;
            BpelDao.persistTMP(this);
            return claimTaskResponse;
        }else if(TaskState.CLAIMED.equals(taskState) && !userOwners[0].equals(requestedUser)){
            claimTaskResponse.setStatus("The task has been claimed by "+userOwners[0]);
            _taskClaimed = true;
            BpelDao.persistTMP(this);
            return claimTaskResponse;
        }else{
        	
            if (TaskState.CLAIMED.equals(taskState)){
                _taskClaimed = true;
                BpelDao.persistTMP(this);
                return claimTaskResponse;
            }else if(_taskEscalated){
                if(_escalateTaskRequest != null){
                    List<String> userOwners2 = new ArrayList<String>();
                    List<String> roleOwners2 = new ArrayList<String>();
                    roleOwners2.add(_escalateTaskRequest.getRoleOwner());
                    userOwners2.add(_escalateTaskRequest.getUserOwner());
                    _initialOwners = new Owners();
                    _initialOwners.setRoleOwners(roleOwners2);
                    _initialOwners.setUserOwners(userOwners2);
                }    
            }else{
                if(_createTaskRequest !=null){
                    TaskMetaDataType taskMetaDataType = _createTaskRequest.getTaskMetaData();
                    String[] userOwners2 = null;
                    String[] roleOwners2 = null;
                    if(taskMetaDataType != null){
                        userOwners2 = taskMetaDataType.getUserOwner();
                        roleOwners2 = taskMetaDataType.getRoleOwner();
                    }
                    List<String> userOwnersList = new ArrayList<String>();
                    List<String> roleOwnersList = new ArrayList<String>();
                    for (String userOwner:userOwners2) {
                        userOwnersList.add(userOwner);
                    }
                    for (String roleOwner:roleOwners2) {
                        userOwnersList.add(roleOwner);
                    }
                    _initialOwners = new Owners();
                    _initialOwners.setRoleOwners(roleOwnersList);
                    _initialOwners.setUserOwners(userOwnersList);
                }
            }
            AuthIdentifierSet users = new AuthIdentifierSet();
            users.add(requestedUser);
            TaskState taskState2 = TaskState.valueOf("CLAIMED");
            _tmsServer.reassign(dao, taskId, users , null, taskState2, participantToken, null);
            
            
        }
        _taskClaimed = true;
        BpelDao.persistTMP(this);
        return claimTaskResponse;
        
    }

    public Response skipTask(SkipTaskRequest skipTaskRequest) throws TMSException {       
        Response skipTaskResponse = new Response();
        String participantToken = skipTaskRequest.getParticipantToken();
        String taskId = skipTaskRequest.getTaskId();
        _tmsServer.skip(dao, taskId, participantToken);
        _taskCompleted = true;
        BpelDao.persistTMP(this);
        return skipTaskResponse;
    }
    
    public void throwExceptionIfNull(Object parameter, String name)
                                    throws InvalidInputFormatException {
        if (parameter == null) {
            throw new InvalidInputFormatException(
                    "Required parameter was not specified: " + name);
        }
    }

	public EscalateTaskResponse escalateTask(
			EscalateTaskRequest escalateTaskRequest) throws TMSException {
		EscalateTaskResponse escalateTaskResponse = new EscalateTaskResponse();
		String taskId = escalateTaskRequest.getTaskId();
		TaskState taskState = TaskState.valueOf("READY");
		AuthIdentifierSet users = new AuthIdentifierSet();
		AuthIdentifierSet roles = new AuthIdentifierSet();
		String role = escalateTaskRequest.getRoleOwner();
		String user = escalateTaskRequest.getUserOwner();
		roles.add(role);
		users.add(user);
		_tmsServer.reassign(dao, taskId, users, roles, taskState, "", "ESCALATE");
		BpelDao.persistTMP(this);
		return escalateTaskResponse;
	}

}
