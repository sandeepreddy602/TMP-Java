
/**
 * TaskManagementServicesStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
        package com.intalio.www.bpms.workflow.taskmanagementservices_20051109;

        

        /*
        *  TaskManagementServicesStub java implementation
        */

        
        public class TaskManagementServicesStub extends org.apache.axis2.client.Stub
        implements TaskManagementServices{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("TaskManagementServices" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[25];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getTask"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "deletePipa"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "removeAttachment"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getTaskOwnerAndState"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getCustomColumns"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "manageFromInstance"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getAvailableTasks"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "countAvailableTasks"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "skip"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "create"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "initProcess"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "reassign"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "setOutput"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "complete"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "setOutputAndComplete"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getAttachments"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "update"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getPipa"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "deleteAll"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "addAttachment"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "storePipa"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "getTaskList"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "delete"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "fail"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/", "listTasksFromInstance"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTask"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "deletePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableAttachmentFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableAttachmentFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableAttachmentFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "removeAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTaskOwnerAndState"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "manageFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "countAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "countAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "countAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "countAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "countAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "countAvailableTasks"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "skip"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "create"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "initProcess"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "reassign"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "setOutput"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "complete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "setOutputAndComplete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getAttachments"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "update"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getPipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "deleteAll"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "addAttachment"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "storePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "storePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "storePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "storePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "storePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "storePipa"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTaskList"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTaskList"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "getTaskList"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTaskList"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTaskList"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "getTaskList"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "delete"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "fail"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","accessDeniedFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidInputMessageFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","unavailableTaskFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","invalidParticipantTokenFault"), "listTasksFromInstance"),"com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public TaskManagementServicesStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public TaskManagementServicesStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public TaskManagementServicesStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://localhost:11080/axis2/services/TaskManagementServices.TaskManagementServicesSOAP/" );
                
    }

    /**
     * Default Constructor
     */
    public TaskManagementServicesStub() throws org.apache.axis2.AxisFault {
        
                    this("http://localhost:11080/axis2/services/TaskManagementServices.TaskManagementServicesSOAP/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public TaskManagementServicesStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#getTask
                     * @param getTaskRequest64
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse getTask(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest getTaskRequest64)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getTask");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTaskRequest64,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTask")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTask"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTask"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTask"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTask"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startgetTask
                    * @param getTaskRequest64
                
                */
                public  void startgetTask(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest getTaskRequest64,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getTask");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTaskRequest64,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTask")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTask"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTask(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTask(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTask"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTask"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTask"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorgetTask((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorgetTask((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorgetTask((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTask(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTask(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTask(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTask(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTask(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTask(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTask(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTask(f);
                                            }
									    } else {
										    callback.receiveErrorgetTask(f);
									    }
									} else {
									    callback.receiveErrorgetTask(f);
									}
								} else {
								    callback.receiveErrorgetTask(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetTask(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#deletePipa
                     * @param deletePipaRequest66
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse deletePipa(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest deletePipaRequest66)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/deletePipa");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deletePipaRequest66,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "deletePipa")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "deletePipa"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deletePipa"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deletePipa"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deletePipa"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startdeletePipa
                    * @param deletePipaRequest66
                
                */
                public  void startdeletePipa(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest deletePipaRequest66,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/deletePipa");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deletePipaRequest66,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "deletePipa")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "deletePipa"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultdeletePipa(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrordeletePipa(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deletePipa"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deletePipa"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deletePipa"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrordeletePipa((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrordeletePipa((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrordeletePipa((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrordeletePipa(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeletePipa(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeletePipa(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeletePipa(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeletePipa(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeletePipa(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeletePipa(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeletePipa(f);
                                            }
									    } else {
										    callback.receiveErrordeletePipa(f);
									    }
									} else {
									    callback.receiveErrordeletePipa(f);
									}
								} else {
								    callback.receiveErrordeletePipa(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrordeletePipa(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#removeAttachment
                     * @param removeAttachmentRequest68
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse removeAttachment(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest removeAttachmentRequest68)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/removeAttachment");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeAttachmentRequest68,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "removeAttachment")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "removeAttachment"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeAttachment"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeAttachment"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeAttachment"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startremoveAttachment
                    * @param removeAttachmentRequest68
                
                */
                public  void startremoveAttachment(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest removeAttachmentRequest68,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/removeAttachment");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeAttachmentRequest68,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "removeAttachment")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "removeAttachment"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultremoveAttachment(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorremoveAttachment(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeAttachment"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeAttachment"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeAttachment"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorremoveAttachment((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException){
														callback.receiveErrorremoveAttachment((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorremoveAttachment((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorremoveAttachment((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorremoveAttachment(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveAttachment(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveAttachment(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveAttachment(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveAttachment(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveAttachment(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveAttachment(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveAttachment(f);
                                            }
									    } else {
										    callback.receiveErrorremoveAttachment(f);
									    }
									} else {
									    callback.receiveErrorremoveAttachment(f);
									}
								} else {
								    callback.receiveErrorremoveAttachment(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorremoveAttachment(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#getTaskOwnerAndState
                     * @param getTaskOwnerAndStateRequest70
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse getTaskOwnerAndState(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest getTaskOwnerAndStateRequest70)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getTaskOwnerAndState");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTaskOwnerAndStateRequest70,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTaskOwnerAndState")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTaskOwnerAndState"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskOwnerAndState"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskOwnerAndState"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskOwnerAndState"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startgetTaskOwnerAndState
                    * @param getTaskOwnerAndStateRequest70
                
                */
                public  void startgetTaskOwnerAndState(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest getTaskOwnerAndStateRequest70,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getTaskOwnerAndState");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTaskOwnerAndStateRequest70,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTaskOwnerAndState")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTaskOwnerAndState"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTaskOwnerAndState(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTaskOwnerAndState(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskOwnerAndState"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskOwnerAndState"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskOwnerAndState"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorgetTaskOwnerAndState((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorgetTaskOwnerAndState((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorgetTaskOwnerAndState((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTaskOwnerAndState(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskOwnerAndState(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskOwnerAndState(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskOwnerAndState(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskOwnerAndState(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskOwnerAndState(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskOwnerAndState(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskOwnerAndState(f);
                                            }
									    } else {
										    callback.receiveErrorgetTaskOwnerAndState(f);
									    }
									} else {
									    callback.receiveErrorgetTaskOwnerAndState(f);
									}
								} else {
								    callback.receiveErrorgetTaskOwnerAndState(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetTaskOwnerAndState(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#getCustomColumns
                     * @param getCustomColumnsRequest72
                    
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse getCustomColumns(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest getCustomColumnsRequest72)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getCustomColumns");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getCustomColumnsRequest72,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getCustomColumns")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getCustomColumns"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getCustomColumns"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getCustomColumns"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getCustomColumns"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startgetCustomColumns
                    * @param getCustomColumnsRequest72
                
                */
                public  void startgetCustomColumns(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest getCustomColumnsRequest72,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getCustomColumns");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getCustomColumnsRequest72,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getCustomColumns")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getCustomColumns"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetCustomColumns(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetCustomColumns(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getCustomColumns"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getCustomColumns"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getCustomColumns"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetCustomColumns(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCustomColumns(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCustomColumns(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCustomColumns(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCustomColumns(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCustomColumns(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCustomColumns(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCustomColumns(f);
                                            }
									    } else {
										    callback.receiveErrorgetCustomColumns(f);
									    }
									} else {
									    callback.receiveErrorgetCustomColumns(f);
									}
								} else {
								    callback.receiveErrorgetCustomColumns(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetCustomColumns(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#manageFromInstance
                     * @param manageFromInstanceRequest74
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse manageFromInstance(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest manageFromInstanceRequest74)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/manageFromInstance");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    manageFromInstanceRequest74,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "manageFromInstance")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "manageFromInstance"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"manageFromInstance"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"manageFromInstance"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"manageFromInstance"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startmanageFromInstance
                    * @param manageFromInstanceRequest74
                
                */
                public  void startmanageFromInstance(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest manageFromInstanceRequest74,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/manageFromInstance");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    manageFromInstanceRequest74,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "manageFromInstance")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "manageFromInstance"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultmanageFromInstance(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrormanageFromInstance(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"manageFromInstance"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"manageFromInstance"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"manageFromInstance"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
														callback.receiveErrormanageFromInstance((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrormanageFromInstance((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrormanageFromInstance((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrormanageFromInstance((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrormanageFromInstance(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrormanageFromInstance(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrormanageFromInstance(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrormanageFromInstance(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrormanageFromInstance(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrormanageFromInstance(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrormanageFromInstance(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrormanageFromInstance(f);
                                            }
									    } else {
										    callback.receiveErrormanageFromInstance(f);
									    }
									} else {
									    callback.receiveErrormanageFromInstance(f);
									}
								} else {
								    callback.receiveErrormanageFromInstance(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrormanageFromInstance(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#getAvailableTasks
                     * @param getAvailableTasksRequest76
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse getAvailableTasks(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest getAvailableTasksRequest76)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getAvailableTasks");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getAvailableTasksRequest76,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getAvailableTasks")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getAvailableTasks"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAvailableTasks"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAvailableTasks"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAvailableTasks"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startgetAvailableTasks
                    * @param getAvailableTasksRequest76
                
                */
                public  void startgetAvailableTasks(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest getAvailableTasksRequest76,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getAvailableTasks");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getAvailableTasksRequest76,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getAvailableTasks")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getAvailableTasks"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetAvailableTasks(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetAvailableTasks(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAvailableTasks"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAvailableTasks"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAvailableTasks"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorgetAvailableTasks((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorgetAvailableTasks((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetAvailableTasks(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAvailableTasks(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAvailableTasks(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAvailableTasks(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAvailableTasks(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAvailableTasks(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAvailableTasks(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAvailableTasks(f);
                                            }
									    } else {
										    callback.receiveErrorgetAvailableTasks(f);
									    }
									} else {
									    callback.receiveErrorgetAvailableTasks(f);
									}
								} else {
								    callback.receiveErrorgetAvailableTasks(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetAvailableTasks(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#countAvailableTasks
                     * @param countAvailableTasksRequest78
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse countAvailableTasks(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest countAvailableTasksRequest78)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/countAvailableTasks");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    countAvailableTasksRequest78,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "countAvailableTasks")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "countAvailableTasks"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"countAvailableTasks"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"countAvailableTasks"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"countAvailableTasks"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startcountAvailableTasks
                    * @param countAvailableTasksRequest78
                
                */
                public  void startcountAvailableTasks(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest countAvailableTasksRequest78,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/countAvailableTasks");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    countAvailableTasksRequest78,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "countAvailableTasks")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "countAvailableTasks"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcountAvailableTasks(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcountAvailableTasks(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"countAvailableTasks"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"countAvailableTasks"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"countAvailableTasks"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorcountAvailableTasks((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorcountAvailableTasks((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcountAvailableTasks(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcountAvailableTasks(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcountAvailableTasks(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcountAvailableTasks(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcountAvailableTasks(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcountAvailableTasks(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcountAvailableTasks(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcountAvailableTasks(f);
                                            }
									    } else {
										    callback.receiveErrorcountAvailableTasks(f);
									    }
									} else {
									    callback.receiveErrorcountAvailableTasks(f);
									}
								} else {
								    callback.receiveErrorcountAvailableTasks(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcountAvailableTasks(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#skip
                     * @param skipRequest80
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse skip(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest skipRequest80)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/skip");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    skipRequest80,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "skip")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "skip"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"skip"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"skip"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"skip"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startskip
                    * @param skipRequest80
                
                */
                public  void startskip(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest skipRequest80,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/skip");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    skipRequest80,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "skip")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "skip"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultskip(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorskip(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"skip"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"skip"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"skip"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorskip((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorskip((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorskip((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorskip(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorskip(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorskip(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorskip(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorskip(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorskip(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorskip(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorskip(f);
                                            }
									    } else {
										    callback.receiveErrorskip(f);
									    }
									} else {
									    callback.receiveErrorskip(f);
									}
								} else {
								    callback.receiveErrorskip(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorskip(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#create
                     * @param createRequest82
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse create(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest createRequest82)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/create");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createRequest82,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "create")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "create"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"create"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"create"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"create"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startcreate
                    * @param createRequest82
                
                */
                public  void startcreate(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest createRequest82,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/create");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createRequest82,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "create")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "create"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcreate(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcreate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"create"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"create"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"create"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
														callback.receiveErrorcreate((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorcreate((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorcreate((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcreate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            }
									    } else {
										    callback.receiveErrorcreate(f);
									    }
									} else {
									    callback.receiveErrorcreate(f);
									}
								} else {
								    callback.receiveErrorcreate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcreate(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#initProcess
                     * @param initRequest84
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse initProcess(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest initRequest84)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/init");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    initRequest84,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "initProcess")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "initProcess"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"initProcess"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"initProcess"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"initProcess"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startinitProcess
                    * @param initRequest84
                
                */
                public  void startinitProcess(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest initRequest84,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/init");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    initRequest84,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "initProcess")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "initProcess"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultinitProcess(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorinitProcess(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"initProcess"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"initProcess"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"initProcess"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorinitProcess((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorinitProcess((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorinitProcess((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorinitProcess(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinitProcess(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinitProcess(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinitProcess(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinitProcess(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinitProcess(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinitProcess(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinitProcess(f);
                                            }
									    } else {
										    callback.receiveErrorinitProcess(f);
									    }
									} else {
									    callback.receiveErrorinitProcess(f);
									}
								} else {
								    callback.receiveErrorinitProcess(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorinitProcess(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#reassign
                     * @param reassignRequest86
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse reassign(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest reassignRequest86)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/reassign");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    reassignRequest86,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "reassign")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "reassign"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"reassign"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"reassign"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"reassign"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startreassign
                    * @param reassignRequest86
                
                */
                public  void startreassign(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest reassignRequest86,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/reassign");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    reassignRequest86,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "reassign")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "reassign"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultreassign(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorreassign(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"reassign"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"reassign"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"reassign"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorreassign((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorreassign((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorreassign((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorreassign(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorreassign(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorreassign(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorreassign(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorreassign(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorreassign(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorreassign(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorreassign(f);
                                            }
									    } else {
										    callback.receiveErrorreassign(f);
									    }
									} else {
									    callback.receiveErrorreassign(f);
									}
								} else {
								    callback.receiveErrorreassign(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorreassign(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#setOutput
                     * @param setOutputRequest88
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse setOutput(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest setOutputRequest88)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/setOutput");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    setOutputRequest88,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "setOutput")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "setOutput"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutput"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutput"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutput"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startsetOutput
                    * @param setOutputRequest88
                
                */
                public  void startsetOutput(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest setOutputRequest88,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/setOutput");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    setOutputRequest88,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "setOutput")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "setOutput"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultsetOutput(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorsetOutput(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutput"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutput"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutput"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorsetOutput((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorsetOutput((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorsetOutput((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorsetOutput(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutput(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutput(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutput(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutput(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutput(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutput(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutput(f);
                                            }
									    } else {
										    callback.receiveErrorsetOutput(f);
									    }
									} else {
									    callback.receiveErrorsetOutput(f);
									}
								} else {
								    callback.receiveErrorsetOutput(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorsetOutput(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[12].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#complete
                     * @param completeRequest90
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse complete(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest completeRequest90)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/complete");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    completeRequest90,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "complete")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "complete"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"complete"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"complete"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"complete"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startcomplete
                    * @param completeRequest90
                
                */
                public  void startcomplete(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest completeRequest90,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/complete");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    completeRequest90,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "complete")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "complete"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcomplete(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcomplete(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"complete"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"complete"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"complete"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorcomplete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorcomplete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorcomplete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcomplete(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcomplete(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcomplete(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcomplete(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcomplete(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcomplete(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcomplete(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcomplete(f);
                                            }
									    } else {
										    callback.receiveErrorcomplete(f);
									    }
									} else {
									    callback.receiveErrorcomplete(f);
									}
								} else {
								    callback.receiveErrorcomplete(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcomplete(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[13].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[13].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#setOutputAndComplete
                     * @param setOutputAndCompleteRequest92
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse setOutputAndComplete(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest setOutputAndCompleteRequest92)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/setOutputAndComplete");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    setOutputAndCompleteRequest92,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "setOutputAndComplete")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "setOutputAndComplete"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutputAndComplete"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutputAndComplete"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutputAndComplete"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startsetOutputAndComplete
                    * @param setOutputAndCompleteRequest92
                
                */
                public  void startsetOutputAndComplete(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest setOutputAndCompleteRequest92,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/setOutputAndComplete");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    setOutputAndCompleteRequest92,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "setOutputAndComplete")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "setOutputAndComplete"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultsetOutputAndComplete(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorsetOutputAndComplete(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutputAndComplete"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutputAndComplete"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"setOutputAndComplete"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorsetOutputAndComplete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorsetOutputAndComplete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorsetOutputAndComplete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorsetOutputAndComplete(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutputAndComplete(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutputAndComplete(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutputAndComplete(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutputAndComplete(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutputAndComplete(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutputAndComplete(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsetOutputAndComplete(f);
                                            }
									    } else {
										    callback.receiveErrorsetOutputAndComplete(f);
									    }
									} else {
									    callback.receiveErrorsetOutputAndComplete(f);
									}
								} else {
								    callback.receiveErrorsetOutputAndComplete(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorsetOutputAndComplete(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[14].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[14].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#getAttachments
                     * @param getAttachmentsRequest94
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse getAttachments(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest getAttachmentsRequest94)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getAttachments");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getAttachmentsRequest94,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getAttachments")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getAttachments"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAttachments"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAttachments"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAttachments"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startgetAttachments
                    * @param getAttachmentsRequest94
                
                */
                public  void startgetAttachments(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest getAttachmentsRequest94,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getAttachments");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getAttachmentsRequest94,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getAttachments")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getAttachments"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetAttachments(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetAttachments(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAttachments"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAttachments"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAttachments"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorgetAttachments((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorgetAttachments((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorgetAttachments((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetAttachments(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAttachments(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAttachments(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAttachments(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAttachments(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAttachments(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAttachments(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAttachments(f);
                                            }
									    } else {
										    callback.receiveErrorgetAttachments(f);
									    }
									} else {
									    callback.receiveErrorgetAttachments(f);
									}
								} else {
								    callback.receiveErrorgetAttachments(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetAttachments(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[15].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[15].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#update
                     * @param updateRequest96
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse update(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest updateRequest96)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/update");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateRequest96,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "update")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "update"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"update"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"update"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"update"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startupdate
                    * @param updateRequest96
                
                */
                public  void startupdate(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest updateRequest96,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/update");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateRequest96,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "update")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "update"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultupdate(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorupdate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"update"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"update"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"update"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
														callback.receiveErrorupdate((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorupdate((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorupdate((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorupdate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            }
									    } else {
										    callback.receiveErrorupdate(f);
									    }
									} else {
									    callback.receiveErrorupdate(f);
									}
								} else {
								    callback.receiveErrorupdate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorupdate(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[16].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[16].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#getPipa
                     * @param getPipaRequest98
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse getPipa(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest getPipaRequest98)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getPipa");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getPipaRequest98,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getPipa")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getPipa"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPipa"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPipa"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPipa"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startgetPipa
                    * @param getPipaRequest98
                
                */
                public  void startgetPipa(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest getPipaRequest98,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getPipa");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getPipaRequest98,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getPipa")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getPipa"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetPipa(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetPipa(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPipa"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPipa"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getPipa"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorgetPipa((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorgetPipa((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorgetPipa((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetPipa(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPipa(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPipa(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPipa(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPipa(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPipa(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPipa(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPipa(f);
                                            }
									    } else {
										    callback.receiveErrorgetPipa(f);
									    }
									} else {
									    callback.receiveErrorgetPipa(f);
									}
								} else {
								    callback.receiveErrorgetPipa(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetPipa(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[17].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[17].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#deleteAll
                     * @param deleteAllRequest100
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse deleteAll(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest deleteAllRequest100)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/deleteAll");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteAllRequest100,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "deleteAll")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "deleteAll"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteAll"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteAll"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteAll"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startdeleteAll
                    * @param deleteAllRequest100
                
                */
                public  void startdeleteAll(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest deleteAllRequest100,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/deleteAll");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteAllRequest100,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "deleteAll")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "deleteAll"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultdeleteAll(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrordeleteAll(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteAll"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteAll"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteAll"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
														callback.receiveErrordeleteAll((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrordeleteAll((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrordeleteAll((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrordeleteAll((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrordeleteAll(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeleteAll(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeleteAll(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeleteAll(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeleteAll(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeleteAll(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeleteAll(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordeleteAll(f);
                                            }
									    } else {
										    callback.receiveErrordeleteAll(f);
									    }
									} else {
									    callback.receiveErrordeleteAll(f);
									}
								} else {
								    callback.receiveErrordeleteAll(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrordeleteAll(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[18].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[18].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#addAttachment
                     * @param addAttachmentRequest102
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse addAttachment(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest addAttachmentRequest102)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/addAttachment");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addAttachmentRequest102,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "addAttachment")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "addAttachment"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addAttachment"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addAttachment"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addAttachment"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startaddAttachment
                    * @param addAttachmentRequest102
                
                */
                public  void startaddAttachment(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest addAttachmentRequest102,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/addAttachment");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addAttachmentRequest102,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "addAttachment")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "addAttachment"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddAttachment(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddAttachment(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addAttachment"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addAttachment"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addAttachment"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErroraddAttachment((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErroraddAttachment((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErroraddAttachment((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddAttachment(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddAttachment(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddAttachment(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddAttachment(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddAttachment(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddAttachment(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddAttachment(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddAttachment(f);
                                            }
									    } else {
										    callback.receiveErroraddAttachment(f);
									    }
									} else {
									    callback.receiveErroraddAttachment(f);
									}
								} else {
								    callback.receiveErroraddAttachment(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErroraddAttachment(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[19].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[19].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#storePipa
                     * @param storePipaRequest104
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse storePipa(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest storePipaRequest104)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/storePipa");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    storePipaRequest104,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "storePipa")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "storePipa"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"storePipa"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"storePipa"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"storePipa"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startstorePipa
                    * @param storePipaRequest104
                
                */
                public  void startstorePipa(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest storePipaRequest104,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/storePipa");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    storePipaRequest104,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "storePipa")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "storePipa"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultstorePipa(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorstorePipa(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"storePipa"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"storePipa"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"storePipa"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorstorePipa((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorstorePipa((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorstorePipa(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstorePipa(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstorePipa(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstorePipa(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstorePipa(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstorePipa(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstorePipa(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorstorePipa(f);
                                            }
									    } else {
										    callback.receiveErrorstorePipa(f);
									    }
									} else {
									    callback.receiveErrorstorePipa(f);
									}
								} else {
								    callback.receiveErrorstorePipa(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorstorePipa(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[20].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[20].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#getTaskList
                     * @param getTaskListRequest106
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse getTaskList(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest getTaskListRequest106)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getTaskList");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTaskListRequest106,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTaskList")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTaskList"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskList"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskList"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskList"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startgetTaskList
                    * @param getTaskListRequest106
                
                */
                public  void startgetTaskList(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest getTaskListRequest106,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/getTaskList");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTaskListRequest106,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTaskList")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "getTaskList"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTaskList(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTaskList(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskList"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskList"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getTaskList"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorgetTaskList((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorgetTaskList((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTaskList(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskList(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskList(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskList(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskList(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskList(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskList(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskList(f);
                                            }
									    } else {
										    callback.receiveErrorgetTaskList(f);
									    }
									} else {
									    callback.receiveErrorgetTaskList(f);
									}
								} else {
								    callback.receiveErrorgetTaskList(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetTaskList(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[21].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[21].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#delete
                     * @param deleteRequest108
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse delete(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest deleteRequest108)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/delete");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteRequest108,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "delete")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "delete"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"delete"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"delete"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"delete"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startdelete
                    * @param deleteRequest108
                
                */
                public  void startdelete(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest deleteRequest108,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/delete");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteRequest108,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "delete")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "delete"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultdelete(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrordelete(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"delete"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"delete"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"delete"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
														callback.receiveErrordelete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrordelete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrordelete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrordelete((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrordelete(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordelete(f);
                                            }
									    } else {
										    callback.receiveErrordelete(f);
									    }
									} else {
									    callback.receiveErrordelete(f);
									}
								} else {
								    callback.receiveErrordelete(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrordelete(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[22].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[22].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#fail
                     * @param failRequest110
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse fail(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest failRequest110)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/fail");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    failRequest110,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "fail")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "fail"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fail"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fail"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fail"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startfail
                    * @param failRequest110
                
                */
                public  void startfail(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest failRequest110,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/fail");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    failRequest110,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "fail")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "fail"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultfail(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorfail(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fail"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fail"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fail"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
														callback.receiveErrorfail((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorfail((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorfail((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorfail((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorfail(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfail(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfail(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfail(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfail(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfail(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfail(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorfail(f);
                                            }
									    } else {
										    callback.receiveErrorfail(f);
									    }
									} else {
									    callback.receiveErrorfail(f);
									}
								} else {
								    callback.receiveErrorfail(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorfail(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[23].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[23].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#listTasksFromInstance
                     * @param listTasksFromInstanceRequest112
                    
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
                     * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
                     */

                    

                            public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse listTasksFromInstance(

                            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest listTasksFromInstanceRequest112)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
                        ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/listTasksFromInstance");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listTasksFromInstanceRequest112,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "listTasksFromInstance")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "listTasksFromInstance"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listTasksFromInstance"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listTasksFromInstance"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listTasksFromInstance"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex;
                        }
                        
                        if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
                          throw (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServices#startlistTasksFromInstance
                    * @param listTasksFromInstanceRequest112
                
                */
                public  void startlistTasksFromInstance(

                 com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest listTasksFromInstanceRequest112,

                  final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
             _operationClient.getOptions().setAction("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/listTasksFromInstance");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listTasksFromInstanceRequest112,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "listTasksFromInstance")), new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                    "listTasksFromInstance"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultlistTasksFromInstance(
                                        (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorlistTasksFromInstance(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listTasksFromInstance"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listTasksFromInstance"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listTasksFromInstance"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException){
														callback.receiveErrorlistTasksFromInstance((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException){
														callback.receiveErrorlistTasksFromInstance((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException){
														callback.receiveErrorlistTasksFromInstance((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException)ex);
											            return;
										            }
										            
													if (ex instanceof com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException){
														callback.receiveErrorlistTasksFromInstance((com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorlistTasksFromInstance(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlistTasksFromInstance(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlistTasksFromInstance(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlistTasksFromInstance(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlistTasksFromInstance(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlistTasksFromInstance(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlistTasksFromInstance(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlistTasksFromInstance(f);
                                            }
									    } else {
										    callback.receiveErrorlistTasksFromInstance(f);
									    }
									} else {
									    callback.receiveErrorlistTasksFromInstance(f);
									}
								} else {
								    callback.receiveErrorlistTasksFromInstance(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorlistTasksFromInstance(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[24].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[24].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://localhost:11080/axis2/services/TaskManagementServices.TaskManagementServicesSOAP/
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.class.equals(type)){
                
                           return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   