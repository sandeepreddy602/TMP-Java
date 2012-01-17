package com.intalio.bpms.taskmanager;


import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.commons.httpclient.HttpClient;
import org.intalio.tempo.workflow.util.xml.OMElementQueue;
import org.intalio.tempo.workflow.util.xml.OMUnmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.intalio.tempo.workflow.processes.xpath.UID;

public class TaskManager extends OMUnmarshaller{
    
    private static final Logger _log = LoggerFactory.getLogger(OMUnmarshaller.class);
    private EndpointReference _endpoint;
    private long _httpTimeOut;
    private String httpChunking;
    
    public boolean isChunking() {
        return Boolean.parseBoolean(httpChunking);
    }
    
    protected TaskManager(String namespaceURI, String namespacePrefix) {
        super(namespaceURI, namespacePrefix);
        // TODO Auto-generated constructor stub
    }

    private static String processId;
    
    
    public OMElement createTask(OMElement request){
        OMElementQueue rootQueue = new OMElementQueue(request);
        OMElement metadataElement = requireElement(rootQueue, "metadata");
        OMElement tokenElement = requireElement(rootQueue, "participantToken");
        String participantToken = tokenElement.getText();
        OMElement taskItputElement = requireElement(rootQueue, "taskInput" );
        String taskId = UID.create()+processId;
        
        return null;
    }


    public OMElement completeTask(OMElement request){
        return null;
    }
    
    public OMElement claimTask(OMElement request){
        return null;
    }
    
    public OMElement revokeTask(OMElement request){
        return null;
    }
    
    public OMElement skipTask(OMElement request){
        return null;
    }
    
    public OMElement escalateTask(OMElement request){
        return null;
    }
    
    private OMElement sendRequest(OMElement request, String soapAction) throws Exception {
        if (_log.isDebugEnabled())
            _log.debug(request.toString());

        Thread currentThread = Thread.currentThread();
        ClassLoader cl = currentThread.getContextClassLoader();
 
        try {
            HttpClient httpClient = new HttpClient(MultiThreadedHttpConnectionManagerFactory.getInstance()); 

            Options options = new Options();
            options.setTo(_endpoint);
            options.setAction(soapAction);
            options.setTimeOutInMilliSeconds( _httpTimeOut );

            ServiceClient serviceClient = new ServiceClient();
            try {
                serviceClient.setOptions(options);
                serviceClient.getOptions().setProperty(HTTPConstants.REUSE_HTTP_CLIENT, Constants.VALUE_TRUE);
                serviceClient.getOptions().setProperty(HTTPConstants.CACHED_HTTP_CLIENT, httpClient);
                _log.debug("serviceClient.getOptions().getTimeOutInMilliSeconds() = "+serviceClient.getOptions().getTimeOutInMilliSeconds() + " ms");
                // Disabling chunking as lighthttpd doesnt support it
                if (this.isChunking()) {
                    serviceClient
                            .getOptions()
                            .setProperty(
                                    org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
                                    Boolean.TRUE);
                } else {

                    serviceClient
                            .getOptions()
                            .setProperty(
                                    org.apache.axis2.transport.http.HTTPConstants.CHUNKED,
                                    Boolean.FALSE);
                }
                OMElement response = serviceClient.sendReceive(request);
                response.build();
                return response;
            } finally {
                serviceClient.cleanupTransport();
            }
        } catch (AxisFault f) {
            throw new Exception(f);
        } finally {
            currentThread.setContextClassLoader(cl);
        }
    }
}
