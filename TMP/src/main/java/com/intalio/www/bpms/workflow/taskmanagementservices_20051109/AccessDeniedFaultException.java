
/**
 * AccessDeniedFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package com.intalio.www.bpms.workflow.taskmanagementservices_20051109;

public class AccessDeniedFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1324650926656L;
    
    private com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault faultMessage;

    
        public AccessDeniedFaultException() {
            super("AccessDeniedFaultException");
        }

        public AccessDeniedFaultException(java.lang.String s) {
           super(s);
        }

        public AccessDeniedFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AccessDeniedFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault msg){
       faultMessage = msg;
    }
    
    public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFault getFaultMessage(){
       return faultMessage;
    }
}
    