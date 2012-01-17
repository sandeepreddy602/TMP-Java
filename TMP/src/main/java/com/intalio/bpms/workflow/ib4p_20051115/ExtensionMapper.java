
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

        
            package com.intalio.bpms.workflow.ib4p_20051115;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.intalio.com/bpms/workflow/ib4p_20051115".equals(namespaceURI) &&
                  "attachment".equals(typeName)){
                   
                            return  com.intalio.bpms.workflow.ib4p_20051115.Attachment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/bpms/workflow/ib4p_20051115".equals(namespaceURI) &&
                  "scheduledActions_type0".equals(typeName)){
                   
                            return  com.intalio.bpms.workflow.ib4p_20051115.ScheduledActions_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/bpms/workflow/ib4p_20051115".equals(namespaceURI) &&
                  "accessControlType".equals(typeName)){
                   
                            return  com.intalio.bpms.workflow.ib4p_20051115.AccessControlType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/bpms/workflow/ib4p_20051115".equals(namespaceURI) &&
                  "taskMetaDataType".equals(typeName)){
                   
                            return  com.intalio.bpms.workflow.ib4p_20051115.TaskMetaDataType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/bpms/workflow/ib4p_20051115".equals(namespaceURI) &&
                  "scheduledActionsDetails".equals(typeName)){
                   
                            return  com.intalio.bpms.workflow.ib4p_20051115.ScheduledActionsDetails.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/bpms/workflow/ib4p_20051115".equals(namespaceURI) &&
                  "attachments_type0".equals(typeName)){
                   
                            return  com.intalio.bpms.workflow.ib4p_20051115.Attachments_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/bpms/workflow/ib4p_20051115".equals(namespaceURI) &&
                  "attachmentMetadata".equals(typeName)){
                   
                            return  com.intalio.bpms.workflow.ib4p_20051115.AttachmentMetadata.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    