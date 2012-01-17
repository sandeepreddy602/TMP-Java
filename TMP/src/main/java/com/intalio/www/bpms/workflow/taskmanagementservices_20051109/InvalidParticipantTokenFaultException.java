
/**
 * InvalidParticipantTokenFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package com.intalio.www.bpms.workflow.taskmanagementservices_20051109;

public class InvalidParticipantTokenFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1324650926671L;
    
    private com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault faultMessage;

    
        public InvalidParticipantTokenFaultException() {
            super("InvalidParticipantTokenFaultException");
        }

        public InvalidParticipantTokenFaultException(java.lang.String s) {
           super(s);
        }

        public InvalidParticipantTokenFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidParticipantTokenFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault msg){
       faultMessage = msg;
    }
    
    public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFault getFaultMessage(){
       return faultMessage;
    }
}
    