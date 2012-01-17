/**
 * UIFWServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package com.intalio.bpms.tmpservice;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.AxisFault;
import org.intalio.tempo.workflow.auth.AuthException;
import org.intalio.tempo.workflow.tms.AccessDeniedException;
import org.intalio.tempo.workflow.tms.TMSException;
import org.intalio.tempo.workflow.tms.UnavailableAttachmentException;
import org.intalio.tempo.workflow.tms.UnavailableTaskException;
import org.intalio.tempo.workflow.tms.server.TMSConstants;
import org.intalio.tempo.workflow.util.xml.InvalidInputFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * UIFWServiceSkeleton java skeleton for the axisService
 */
public class UIFWServiceSkeleton {
    private Logger _log = LoggerFactory.getLogger(UIFWServiceSkeleton.class);
    private static final OMFactory OM_FACTORY = OMAbstractFactory.getOMFactory();
    TaskManagerProcess _taskManagerProcess;

    /**
     * Auto generated method signature
     * 
     * @param revokeTaskRequest
     * @return revokeTaskResponse
     */

    public com.intalio.bpms.workflow.ib4p_20051115.RevokeTaskResponse revokeTask(
            com.intalio.bpms.workflow.ib4p_20051115.RevokeTaskRequest revokeTaskRequest) {
        
        try {
			return _taskManagerProcess.revokeTask(revokeTaskRequest);
		} catch (TMSException e) {
			_log.error(e.getMessage(), e);
		}
		return null;
    }

    /**
     * Auto generated method signature
     * 
     * @param claimTaskRequest
     * @return claimTaskResponse
     * @throws TMSException 
     */

    public com.intalio.bpms.workflow.ib4p_20051115.ClaimTaskResponse claimTask(
            com.intalio.bpms.workflow.ib4p_20051115.ClaimTaskRequest claimTaskRequest) throws TMSException {
        
        return _taskManagerProcess.claimTask(claimTaskRequest);
    }

    /**
     * Auto generated method signature
     * 
     * @param completeTaskRequest
     * @return response
     * @throws AxisFault 
     */

    public com.intalio.bpms.workflow.ib4p_20051115.Response completeTask(
            com.intalio.bpms.workflow.ib4p_20051115.CompleteTaskRequest completeTaskRequest) {
        //TODO get this instance from the database probabaly using taskId
        
        try {
            return _taskManagerProcess.completeTask(completeTaskRequest);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * Auto generated method signature
     * 
     * @param skipTaskRequest
     * @return response0
     */

    public com.intalio.bpms.workflow.ib4p_20051115.Response skipTask(
            com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest skipTaskRequest) {
        
        try {
			return _taskManagerProcess.skipTask(skipTaskRequest);
		} catch (TMSException e) {
			
			_log.error(e.getMessage(), e);
		}
		return null;
    }

}
