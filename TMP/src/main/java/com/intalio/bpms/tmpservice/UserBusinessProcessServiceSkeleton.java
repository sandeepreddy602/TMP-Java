/**
 * UserBusinessProcessServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package com.intalio.bpms.tmpservice;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.databinding.ADBException;
import org.apache.axis2.databinding.types.Duration;
import org.apache.axis2.util.XMLUtils;
import org.intalio.tempo.workflow.auth.ACL;
import org.intalio.tempo.workflow.auth.AuthIdentifierSet;
import org.intalio.tempo.workflow.task.PATask;
import org.intalio.tempo.workflow.task.Task;
import org.intalio.tempo.workflow.task.TaskState;
import org.intalio.tempo.workflow.tms.TMSException;
import org.intalio.tempo.workflow.tms.server.ITMSServer;
import org.intalio.tempo.workflow.tms.server.dao.ITaskDAOConnection;
import org.intalio.tempo.workflow.util.xml.InvalidInputFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.intalio.bpms.convertor.Convertor;
import com.intalio.bpms.workflow.ib4p_20051115.ChainedExecution;
import com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest;
import com.intalio.bpms.workflow.ib4p_20051115.Response;
import com.intalio.bpms.workflow.ib4p_20051115.TaskMetaDataType;
import com.intalio.tempo.workflow.processes.xpath.UID;

/**
 * UserBusinessProcessServiceSkeleton java skeleton for the axisService
 */
public class UserBusinessProcessServiceSkeleton implements TaskTimerListener{
	private Logger _log = LoggerFactory.getLogger(UserBusinessProcessServiceSkeleton.class);
	TaskManagerProcess _taskManagerProcess;
    private boolean notified = false;
    

    /**
     * Auto generated method signature
     * 
     * @param escalateTaskRequest
     * @return escalateTaskResponse
     */

    public com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse escalateTask(
            com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest escalateTaskRequest) {
        try {
			return _taskManagerProcess.escalateTask(escalateTaskRequest);
		} catch (TMSException e) {
			_log.error(e.getMessage(), e);
		}
        return null;
    }

    /**
     * Auto generated method signature
     * 
     * @param createTaskRequest
     * @return response37
     * @throws InterruptedException 
     * @throws ADBException 
     */

    public com.intalio.bpms.workflow.ib4p_20051115.Response createTask(
            com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest createTaskRequest) throws InterruptedException, ADBException {
        
        return _taskManagerProcess.createTask(createTaskRequest);
    }
  

    /**
     * Auto generated method signature
     * 
     * @param skipTaskRequest38
     * @return response39
     */

    public com.intalio.bpms.workflow.ib4p_20051115.Response skipTask(
            com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest skipTaskRequest38) {
        // TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement "
                + this.getClass().getName() + "#skipTask");
    }

    @Override
    public void notifyWithResponse(String response) {
        System.out.println(response);
        notified = true;
        
    }

}
