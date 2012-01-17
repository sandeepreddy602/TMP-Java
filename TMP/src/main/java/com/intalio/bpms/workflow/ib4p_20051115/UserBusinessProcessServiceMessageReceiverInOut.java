
/**
 * UserBusinessProcessServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
        package com.intalio.bpms.workflow.ib4p_20051115;

import com.intalio.bpms.tmpservice.UserBusinessProcessServiceSkeleton;

        /**
        *  UserBusinessProcessServiceMessageReceiverInOut message receiver
        */

        public class UserBusinessProcessServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        UserBusinessProcessServiceSkeleton skel = (UserBusinessProcessServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("escalateTask".equals(methodName)){
                
                com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse escalateTaskResponse41 = null;
	                        com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest wrappedParam =
                                                             (com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               escalateTaskResponse41 =
                                                   
                                                   
                                                         skel.escalateTask(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), escalateTaskResponse41, false, new javax.xml.namespace.QName("http://www.intalio.com/bpms/workflow/ib4p_20051115",
                                                    "escalateTask"));
                                    } else 

            if("createTask".equals(methodName)){
                
                com.intalio.bpms.workflow.ib4p_20051115.Response response43 = null;
	                        com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest wrappedParam =
                                                             (com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               response43 =
                                                   
                                                   
                                                         skel.createTask(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), response43, false, new javax.xml.namespace.QName("http://www.intalio.com/bpms/workflow/ib4p_20051115",
                                                    "createTask"));
                                    } else 

            if("skipTask".equals(methodName)){
                
                com.intalio.bpms.workflow.ib4p_20051115.Response response45 = null;
	                        com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest wrappedParam =
                                                             (com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               response45 =
                                                   
                                                   
                                                         skel.skipTask(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), response45, false, new javax.xml.namespace.QName("http://www.intalio.com/bpms/workflow/ib4p_20051115",
                                                    "skipTask"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.bpms.workflow.ib4p_20051115.Response param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.bpms.workflow.ib4p_20051115.Response.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse wrapescalateTask(){
                                com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse wrappedElement = new com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.intalio.bpms.workflow.ib4p_20051115.Response param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.intalio.bpms.workflow.ib4p_20051115.Response.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.intalio.bpms.workflow.ib4p_20051115.Response wrapcreateTask(){
                                com.intalio.bpms.workflow.ib4p_20051115.Response wrappedElement = new com.intalio.bpms.workflow.ib4p_20051115.Response();
                                return wrappedElement;
                         }
                    
                         private com.intalio.bpms.workflow.ib4p_20051115.Response wrapskipTask(){
                                com.intalio.bpms.workflow.ib4p_20051115.Response wrappedElement = new com.intalio.bpms.workflow.ib4p_20051115.Response();
                                return wrappedElement;
                         }
                    


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
        
                if (com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest.class.equals(type)){
                
                           return com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse.class.equals(type)){
                
                           return com.intalio.bpms.workflow.ib4p_20051115.EscalateTaskResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest.class.equals(type)){
                
                           return com.intalio.bpms.workflow.ib4p_20051115.CreateTaskRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.bpms.workflow.ib4p_20051115.Response.class.equals(type)){
                
                           return com.intalio.bpms.workflow.ib4p_20051115.Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest.class.equals(type)){
                
                           return com.intalio.bpms.workflow.ib4p_20051115.SkipTaskRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.intalio.bpms.workflow.ib4p_20051115.Response.class.equals(type)){
                
                           return com.intalio.bpms.workflow.ib4p_20051115.Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
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

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    