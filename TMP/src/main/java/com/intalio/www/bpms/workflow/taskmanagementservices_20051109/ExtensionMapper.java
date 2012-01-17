
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

        
            package com.intalio.www.bpms.workflow.taskmanagementservices_20051109;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "userProcessResponse_type0".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UserProcessResponse_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "task".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Task.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "taskOwnerAndState".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskOwnerAndState.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "taskData".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "taskMetadata".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskMetadata.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "attachment".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Attachment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "taskOwnerAndStateMetadata".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskOwnerAndStateMetadata.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "attachmentMetadata".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AttachmentMetadata.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "data_type0".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Data_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "data_type1".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Data_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "customMetadataType".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CustomMetadataType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "accessControlType".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "customMetadataKeyValueType".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CustomMetadataKeyValueType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/".equals(namespaceURI) &&
                  "attachments".equals(typeName)){
                   
                            return  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Attachments.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    