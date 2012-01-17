
/**
 * TaskMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package com.intalio.www.bpms.workflow.taskmanagementservices_20051109;
            

            /**
            *  TaskMetadata bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TaskMetadata
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = taskMetadata
                Namespace URI = http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for TaskId
                        */

                        
                                    protected java.lang.String localTaskId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaskId(){
                               return localTaskId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaskId
                               */
                               public void setTaskId(java.lang.String param){
                            
                                            this.localTaskId=param;
                                    

                               }
                            

                        /**
                        * field for TaskState
                        */

                        
                                    protected org.apache.axis2.databinding.types.Token localTaskState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaskStateTracker = false ;

                           public boolean isTaskStateSpecified(){
                               return localTaskStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Token
                           */
                           public  org.apache.axis2.databinding.types.Token getTaskState(){
                               return localTaskState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaskState
                               */
                               public void setTaskState(org.apache.axis2.databinding.types.Token param){
                            localTaskStateTracker = param != null;
                                   
                                            this.localTaskState=param;
                                    

                               }
                            

                        /**
                        * field for TaskType
                        */

                        
                                    protected org.apache.axis2.databinding.types.Token localTaskType ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Token
                           */
                           public  org.apache.axis2.databinding.types.Token getTaskType(){
                               return localTaskType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaskType
                               */
                               public void setTaskType(org.apache.axis2.databinding.types.Token param){
                            
                                            this.localTaskType=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            localDescriptionTracker = param != null;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for ProcessId
                        */

                        
                                    protected java.lang.String localProcessId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessIdTracker = false ;

                           public boolean isProcessIdSpecified(){
                               return localProcessIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProcessId(){
                               return localProcessId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessId
                               */
                               public void setProcessId(java.lang.String param){
                            localProcessIdTracker = param != null;
                                   
                                            this.localProcessId=param;
                                    

                               }
                            

                        /**
                        * field for InstanceId
                        */

                        
                                    protected java.lang.String localInstanceId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInstanceIdTracker = false ;

                           public boolean isInstanceIdSpecified(){
                               return localInstanceIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInstanceId(){
                               return localInstanceId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InstanceId
                               */
                               public void setInstanceId(java.lang.String param){
                            localInstanceIdTracker = param != null;
                                   
                                            this.localInstanceId=param;
                                    

                               }
                            

                        /**
                        * field for CreationDate
                        */

                        
                                    protected java.util.Calendar localCreationDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreationDateTracker = false ;

                           public boolean isCreationDateSpecified(){
                               return localCreationDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreationDate(){
                               return localCreationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreationDate
                               */
                               public void setCreationDate(java.util.Calendar param){
                            localCreationDateTracker = param != null;
                                   
                                            this.localCreationDate=param;
                                    

                               }
                            

                        /**
                        * field for Deadline
                        */

                        
                                    protected java.util.Calendar localDeadline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeadlineTracker = false ;

                           public boolean isDeadlineSpecified(){
                               return localDeadlineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getDeadline(){
                               return localDeadline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Deadline
                               */
                               public void setDeadline(java.util.Calendar param){
                            localDeadlineTracker = param != null;
                                   
                                            this.localDeadline=param;
                                    

                               }
                            

                        /**
                        * field for Priority
                        */

                        
                                    protected int localPriority ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPriorityTracker = false ;

                           public boolean isPrioritySpecified(){
                               return localPriorityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPriority(){
                               return localPriority;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Priority
                               */
                               public void setPriority(int param){
                            localPriorityTracker = true;
                                   
                                            this.localPriority=param;
                                    

                               }
                            

                        /**
                        * field for UserOwner
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localUserOwner ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserOwnerTracker = false ;

                           public boolean isUserOwnerSpecified(){
                               return localUserOwnerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getUserOwner(){
                               return localUserOwner;
                           }

                           
                        


                               
                              /**
                               * validate the array for UserOwner
                               */
                              protected void validateUserOwner(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param UserOwner
                              */
                              public void setUserOwner(java.lang.String[] param){
                              
                                   validateUserOwner(param);

                               localUserOwnerTracker = param != null;
                                      
                                      this.localUserOwner=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addUserOwner(java.lang.String param){
                                   if (localUserOwner == null){
                                   localUserOwner = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localUserOwnerTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localUserOwner);
                               list.add(param);
                               this.localUserOwner =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for RoleOwner
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRoleOwner ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoleOwnerTracker = false ;

                           public boolean isRoleOwnerSpecified(){
                               return localRoleOwnerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRoleOwner(){
                               return localRoleOwner;
                           }

                           
                        


                               
                              /**
                               * validate the array for RoleOwner
                               */
                              protected void validateRoleOwner(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RoleOwner
                              */
                              public void setRoleOwner(java.lang.String[] param){
                              
                                   validateRoleOwner(param);

                               localRoleOwnerTracker = param != null;
                                      
                                      this.localRoleOwner=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRoleOwner(java.lang.String param){
                                   if (localRoleOwner == null){
                                   localRoleOwner = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRoleOwnerTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRoleOwner);
                               list.add(param);
                               this.localRoleOwner =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for FormUrl
                        */

                        
                                    protected org.apache.axis2.databinding.types.URI localFormUrl ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.URI
                           */
                           public  org.apache.axis2.databinding.types.URI getFormUrl(){
                               return localFormUrl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FormUrl
                               */
                               public void setFormUrl(org.apache.axis2.databinding.types.URI param){
                            
                                            this.localFormUrl=param;
                                    

                               }
                            

                        /**
                        * field for FailureCode
                        */

                        
                                    protected java.lang.String localFailureCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFailureCodeTracker = false ;

                           public boolean isFailureCodeSpecified(){
                               return localFailureCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFailureCode(){
                               return localFailureCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FailureCode
                               */
                               public void setFailureCode(java.lang.String param){
                            localFailureCodeTracker = param != null;
                                   
                                            this.localFailureCode=param;
                                    

                               }
                            

                        /**
                        * field for FailureReason
                        */

                        
                                    protected java.lang.String localFailureReason ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFailureReasonTracker = false ;

                           public boolean isFailureReasonSpecified(){
                               return localFailureReasonTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFailureReason(){
                               return localFailureReason;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FailureReason
                               */
                               public void setFailureReason(java.lang.String param){
                            localFailureReasonTracker = param != null;
                                   
                                            this.localFailureReason=param;
                                    

                               }
                            

                        /**
                        * field for UserProcessCompleteSOAPAction
                        */

                        
                                    protected java.lang.String localUserProcessCompleteSOAPAction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserProcessCompleteSOAPActionTracker = false ;

                           public boolean isUserProcessCompleteSOAPActionSpecified(){
                               return localUserProcessCompleteSOAPActionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserProcessCompleteSOAPAction(){
                               return localUserProcessCompleteSOAPAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserProcessCompleteSOAPAction
                               */
                               public void setUserProcessCompleteSOAPAction(java.lang.String param){
                            localUserProcessCompleteSOAPActionTracker = param != null;
                                   
                                            this.localUserProcessCompleteSOAPAction=param;
                                    

                               }
                            

                        /**
                        * field for ProcessEndpoint
                        */

                        
                                    protected org.apache.axis2.databinding.types.URI localProcessEndpoint ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessEndpointTracker = false ;

                           public boolean isProcessEndpointSpecified(){
                               return localProcessEndpointTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.URI
                           */
                           public  org.apache.axis2.databinding.types.URI getProcessEndpoint(){
                               return localProcessEndpoint;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessEndpoint
                               */
                               public void setProcessEndpoint(org.apache.axis2.databinding.types.URI param){
                            localProcessEndpointTracker = param != null;
                                   
                                            this.localProcessEndpoint=param;
                                    

                               }
                            

                        /**
                        * field for InitMessageNamespaceURI
                        */

                        
                                    protected org.apache.axis2.databinding.types.URI localInitMessageNamespaceURI ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInitMessageNamespaceURITracker = false ;

                           public boolean isInitMessageNamespaceURISpecified(){
                               return localInitMessageNamespaceURITracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.URI
                           */
                           public  org.apache.axis2.databinding.types.URI getInitMessageNamespaceURI(){
                               return localInitMessageNamespaceURI;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InitMessageNamespaceURI
                               */
                               public void setInitMessageNamespaceURI(org.apache.axis2.databinding.types.URI param){
                            localInitMessageNamespaceURITracker = param != null;
                                   
                                            this.localInitMessageNamespaceURI=param;
                                    

                               }
                            

                        /**
                        * field for InitOperationSOAPAction
                        */

                        
                                    protected java.lang.String localInitOperationSOAPAction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInitOperationSOAPActionTracker = false ;

                           public boolean isInitOperationSOAPActionSpecified(){
                               return localInitOperationSOAPActionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInitOperationSOAPAction(){
                               return localInitOperationSOAPAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InitOperationSOAPAction
                               */
                               public void setInitOperationSOAPAction(java.lang.String param){
                            localInitOperationSOAPActionTracker = param != null;
                                   
                                            this.localInitOperationSOAPAction=param;
                                    

                               }
                            

                        /**
                        * field for IsChainedBefore
                        */

                        
                                    protected java.lang.String localIsChainedBefore ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsChainedBeforeTracker = false ;

                           public boolean isIsChainedBeforeSpecified(){
                               return localIsChainedBeforeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIsChainedBefore(){
                               return localIsChainedBefore;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsChainedBefore
                               */
                               public void setIsChainedBefore(java.lang.String param){
                            localIsChainedBeforeTracker = param != null;
                                   
                                            this.localIsChainedBefore=param;
                                    

                               }
                            

                        /**
                        * field for PreviousTaskId
                        */

                        
                                    protected java.lang.String localPreviousTaskId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPreviousTaskIdTracker = false ;

                           public boolean isPreviousTaskIdSpecified(){
                               return localPreviousTaskIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPreviousTaskId(){
                               return localPreviousTaskId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PreviousTaskId
                               */
                               public void setPreviousTaskId(java.lang.String param){
                            localPreviousTaskIdTracker = param != null;
                                   
                                            this.localPreviousTaskId=param;
                                    

                               }
                            

                        /**
                        * field for ClaimAction
                        */

                        
                                    protected com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType localClaimAction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimActionTracker = false ;

                           public boolean isClaimActionSpecified(){
                               return localClaimActionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType
                           */
                           public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType getClaimAction(){
                               return localClaimAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimAction
                               */
                               public void setClaimAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType param){
                            localClaimActionTracker = param != null;
                                   
                                            this.localClaimAction=param;
                                    

                               }
                            

                        /**
                        * field for RevokeAction
                        */

                        
                                    protected com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType localRevokeAction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRevokeActionTracker = false ;

                           public boolean isRevokeActionSpecified(){
                               return localRevokeActionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType
                           */
                           public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType getRevokeAction(){
                               return localRevokeAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RevokeAction
                               */
                               public void setRevokeAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType param){
                            localRevokeActionTracker = param != null;
                                   
                                            this.localRevokeAction=param;
                                    

                               }
                            

                        /**
                        * field for SaveAction
                        */

                        
                                    protected com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType localSaveAction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSaveActionTracker = false ;

                           public boolean isSaveActionSpecified(){
                               return localSaveActionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType
                           */
                           public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType getSaveAction(){
                               return localSaveAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SaveAction
                               */
                               public void setSaveAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType param){
                            localSaveActionTracker = param != null;
                                   
                                            this.localSaveAction=param;
                                    

                               }
                            

                        /**
                        * field for DismissAction
                        */

                        
                                    protected com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType localDismissAction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDismissActionTracker = false ;

                           public boolean isDismissActionSpecified(){
                               return localDismissActionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType
                           */
                           public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType getDismissAction(){
                               return localDismissAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DismissAction
                               */
                               public void setDismissAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType param){
                            localDismissActionTracker = param != null;
                                   
                                            this.localDismissAction=param;
                                    

                               }
                            

                        /**
                        * field for CompleteAction
                        */

                        
                                    protected com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType localCompleteAction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompleteActionTracker = false ;

                           public boolean isCompleteActionSpecified(){
                               return localCompleteActionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType
                           */
                           public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType getCompleteAction(){
                               return localCompleteAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompleteAction
                               */
                               public void setCompleteAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType param){
                            localCompleteActionTracker = param != null;
                                   
                                            this.localCompleteAction=param;
                                    

                               }
                            

                        /**
                        * field for Attachments
                        */

                        
                                    protected com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Attachments localAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttachmentsTracker = false ;

                           public boolean isAttachmentsSpecified(){
                               return localAttachmentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Attachments
                           */
                           public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Attachments getAttachments(){
                               return localAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attachments
                               */
                               public void setAttachments(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Attachments param){
                            localAttachmentsTracker = param != null;
                                   
                                            this.localAttachments=param;
                                    

                               }
                            

                        /**
                        * field for CustomMetadata
                        */

                        
                                    protected com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CustomMetadataType localCustomMetadata ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomMetadataTracker = false ;

                           public boolean isCustomMetadataSpecified(){
                               return localCustomMetadataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CustomMetadataType
                           */
                           public  com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CustomMetadataType getCustomMetadata(){
                               return localCustomMetadata;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomMetadata
                               */
                               public void setCustomMetadata(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CustomMetadataType param){
                            localCustomMetadataTracker = param != null;
                                   
                                            this.localCustomMetadata=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":taskMetadata",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "taskMetadata",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "taskId", xmlWriter);
                             

                                          if (localTaskId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("taskId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaskId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localTaskStateTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "taskState", xmlWriter);
                             

                                          if (localTaskState==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("taskState cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaskState));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "taskType", xmlWriter);
                             

                                          if (localTaskType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("taskType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaskType));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localDescriptionTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessIdTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "processId", xmlWriter);
                             

                                          if (localProcessId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("processId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProcessId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInstanceIdTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "instanceId", xmlWriter);
                             

                                          if (localInstanceId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("instanceId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInstanceId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreationDateTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "creationDate", xmlWriter);
                             

                                          if (localCreationDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("creationDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreationDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeadlineTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "deadline", xmlWriter);
                             

                                          if (localDeadline==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("deadline cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeadline));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPriorityTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "priority", xmlWriter);
                             
                                               if (localPriority==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriority));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserOwnerTracker){
                             if (localUserOwner!=null) {
                                   namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                   for (int i = 0;i < localUserOwner.length;i++){
                                        
                                            if (localUserOwner[i] != null){
                                        
                                                writeStartElement(null, namespace, "userOwner", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserOwner[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("userOwner cannot be null!!");
                                    
                             }

                        } if (localRoleOwnerTracker){
                             if (localRoleOwner!=null) {
                                   namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                   for (int i = 0;i < localRoleOwner.length;i++){
                                        
                                            if (localRoleOwner[i] != null){
                                        
                                                writeStartElement(null, namespace, "roleOwner", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoleOwner[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("roleOwner cannot be null!!");
                                    
                             }

                        }
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "formUrl", xmlWriter);
                             

                                          if (localFormUrl==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("formUrl cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormUrl));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localFailureCodeTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "failureCode", xmlWriter);
                             

                                          if (localFailureCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("failureCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFailureCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFailureReasonTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "failureReason", xmlWriter);
                             

                                          if (localFailureReason==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("failureReason cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFailureReason);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserProcessCompleteSOAPActionTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "userProcessCompleteSOAPAction", xmlWriter);
                             

                                          if (localUserProcessCompleteSOAPAction==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("userProcessCompleteSOAPAction cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserProcessCompleteSOAPAction);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessEndpointTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "processEndpoint", xmlWriter);
                             

                                          if (localProcessEndpoint==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("processEndpoint cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessEndpoint));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInitMessageNamespaceURITracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "initMessageNamespaceURI", xmlWriter);
                             

                                          if (localInitMessageNamespaceURI==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("initMessageNamespaceURI cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitMessageNamespaceURI));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInitOperationSOAPActionTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "initOperationSOAPAction", xmlWriter);
                             

                                          if (localInitOperationSOAPAction==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("initOperationSOAPAction cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInitOperationSOAPAction);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIsChainedBeforeTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "isChainedBefore", xmlWriter);
                             

                                          if (localIsChainedBefore==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("isChainedBefore cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIsChainedBefore);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPreviousTaskIdTracker){
                                    namespace = "http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/";
                                    writeStartElement(null, namespace, "previousTaskId", xmlWriter);
                             

                                          if (localPreviousTaskId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("previousTaskId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPreviousTaskId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClaimActionTracker){
                                            if (localClaimAction==null){
                                                 throw new org.apache.axis2.databinding.ADBException("claimAction cannot be null!!");
                                            }
                                           localClaimAction.serialize(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","claimAction"),
                                               xmlWriter);
                                        } if (localRevokeActionTracker){
                                            if (localRevokeAction==null){
                                                 throw new org.apache.axis2.databinding.ADBException("revokeAction cannot be null!!");
                                            }
                                           localRevokeAction.serialize(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","revokeAction"),
                                               xmlWriter);
                                        } if (localSaveActionTracker){
                                            if (localSaveAction==null){
                                                 throw new org.apache.axis2.databinding.ADBException("saveAction cannot be null!!");
                                            }
                                           localSaveAction.serialize(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","saveAction"),
                                               xmlWriter);
                                        } if (localDismissActionTracker){
                                            if (localDismissAction==null){
                                                 throw new org.apache.axis2.databinding.ADBException("dismissAction cannot be null!!");
                                            }
                                           localDismissAction.serialize(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","dismissAction"),
                                               xmlWriter);
                                        } if (localCompleteActionTracker){
                                            if (localCompleteAction==null){
                                                 throw new org.apache.axis2.databinding.ADBException("completeAction cannot be null!!");
                                            }
                                           localCompleteAction.serialize(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","completeAction"),
                                               xmlWriter);
                                        } if (localAttachmentsTracker){
                                            if (localAttachments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("attachments cannot be null!!");
                                            }
                                           localAttachments.serialize(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","attachments"),
                                               xmlWriter);
                                        } if (localCustomMetadataTracker){
                                            if (localCustomMetadata==null){
                                                 throw new org.apache.axis2.databinding.ADBException("customMetadata cannot be null!!");
                                            }
                                           localCustomMetadata.serialize(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","customMetadata"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "taskId"));
                                 
                                        if (localTaskId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaskId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("taskId cannot be null!!");
                                        }
                                     if (localTaskStateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "taskState"));
                                 
                                        if (localTaskState != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaskState));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("taskState cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "taskType"));
                                 
                                        if (localTaskType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaskType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("taskType cannot be null!!");
                                        }
                                     if (localDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "description"));
                                 
                                        if (localDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
                                        }
                                    } if (localProcessIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "processId"));
                                 
                                        if (localProcessId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("processId cannot be null!!");
                                        }
                                    } if (localInstanceIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "instanceId"));
                                 
                                        if (localInstanceId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInstanceId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("instanceId cannot be null!!");
                                        }
                                    } if (localCreationDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "creationDate"));
                                 
                                        if (localCreationDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreationDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("creationDate cannot be null!!");
                                        }
                                    } if (localDeadlineTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "deadline"));
                                 
                                        if (localDeadline != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeadline));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("deadline cannot be null!!");
                                        }
                                    } if (localPriorityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "priority"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriority));
                            } if (localUserOwnerTracker){
                            if (localUserOwner!=null){
                                  for (int i = 0;i < localUserOwner.length;i++){
                                      
                                         if (localUserOwner[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                              "userOwner"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserOwner[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("userOwner cannot be null!!");
                                
                            }

                        } if (localRoleOwnerTracker){
                            if (localRoleOwner!=null){
                                  for (int i = 0;i < localRoleOwner.length;i++){
                                      
                                         if (localRoleOwner[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                              "roleOwner"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoleOwner[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("roleOwner cannot be null!!");
                                
                            }

                        }
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "formUrl"));
                                 
                                        if (localFormUrl != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormUrl));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("formUrl cannot be null!!");
                                        }
                                     if (localFailureCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "failureCode"));
                                 
                                        if (localFailureCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFailureCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("failureCode cannot be null!!");
                                        }
                                    } if (localFailureReasonTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "failureReason"));
                                 
                                        if (localFailureReason != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFailureReason));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("failureReason cannot be null!!");
                                        }
                                    } if (localUserProcessCompleteSOAPActionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "userProcessCompleteSOAPAction"));
                                 
                                        if (localUserProcessCompleteSOAPAction != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserProcessCompleteSOAPAction));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("userProcessCompleteSOAPAction cannot be null!!");
                                        }
                                    } if (localProcessEndpointTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "processEndpoint"));
                                 
                                        if (localProcessEndpoint != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessEndpoint));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("processEndpoint cannot be null!!");
                                        }
                                    } if (localInitMessageNamespaceURITracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "initMessageNamespaceURI"));
                                 
                                        if (localInitMessageNamespaceURI != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitMessageNamespaceURI));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("initMessageNamespaceURI cannot be null!!");
                                        }
                                    } if (localInitOperationSOAPActionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "initOperationSOAPAction"));
                                 
                                        if (localInitOperationSOAPAction != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitOperationSOAPAction));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("initOperationSOAPAction cannot be null!!");
                                        }
                                    } if (localIsChainedBeforeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "isChainedBefore"));
                                 
                                        if (localIsChainedBefore != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsChainedBefore));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("isChainedBefore cannot be null!!");
                                        }
                                    } if (localPreviousTaskIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "previousTaskId"));
                                 
                                        if (localPreviousTaskId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreviousTaskId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("previousTaskId cannot be null!!");
                                        }
                                    } if (localClaimActionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "claimAction"));
                            
                            
                                    if (localClaimAction==null){
                                         throw new org.apache.axis2.databinding.ADBException("claimAction cannot be null!!");
                                    }
                                    elementList.add(localClaimAction);
                                } if (localRevokeActionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "revokeAction"));
                            
                            
                                    if (localRevokeAction==null){
                                         throw new org.apache.axis2.databinding.ADBException("revokeAction cannot be null!!");
                                    }
                                    elementList.add(localRevokeAction);
                                } if (localSaveActionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "saveAction"));
                            
                            
                                    if (localSaveAction==null){
                                         throw new org.apache.axis2.databinding.ADBException("saveAction cannot be null!!");
                                    }
                                    elementList.add(localSaveAction);
                                } if (localDismissActionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "dismissAction"));
                            
                            
                                    if (localDismissAction==null){
                                         throw new org.apache.axis2.databinding.ADBException("dismissAction cannot be null!!");
                                    }
                                    elementList.add(localDismissAction);
                                } if (localCompleteActionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "completeAction"));
                            
                            
                                    if (localCompleteAction==null){
                                         throw new org.apache.axis2.databinding.ADBException("completeAction cannot be null!!");
                                    }
                                    elementList.add(localCompleteAction);
                                } if (localAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "attachments"));
                            
                            
                                    if (localAttachments==null){
                                         throw new org.apache.axis2.databinding.ADBException("attachments cannot be null!!");
                                    }
                                    elementList.add(localAttachments);
                                } if (localCustomMetadataTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/",
                                                                      "customMetadata"));
                            
                            
                                    if (localCustomMetadata==null){
                                         throw new org.apache.axis2.databinding.ADBException("customMetadata cannot be null!!");
                                    }
                                    elementList.add(localCustomMetadata);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static TaskMetadata parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TaskMetadata object =
                new TaskMetadata();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"taskMetadata".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TaskMetadata)com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","taskId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaskId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","taskState").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaskState(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToToken(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","taskType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaskType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToToken(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","description").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","processId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","instanceId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInstanceId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","creationDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","deadline").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeadline(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","priority").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPriority(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setPriority(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPriority(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","userOwner").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list10.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone10 = false;
                                            while(!loopDone10){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone10 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","userOwner").equals(reader.getName())){
                                                         list10.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone10 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setUserOwner((java.lang.String[])
                                                        list10.toArray(new java.lang.String[list10.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","roleOwner").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list11.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone11 = false;
                                            while(!loopDone11){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone11 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","roleOwner").equals(reader.getName())){
                                                         list11.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone11 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRoleOwner((java.lang.String[])
                                                        list11.toArray(new java.lang.String[list11.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","formUrl").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFormUrl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToAnyURI(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","failureCode").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFailureCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","failureReason").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFailureReason(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","userProcessCompleteSOAPAction").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserProcessCompleteSOAPAction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","processEndpoint").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProcessEndpoint(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToAnyURI(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","initMessageNamespaceURI").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInitMessageNamespaceURI(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToAnyURI(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","initOperationSOAPAction").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInitOperationSOAPAction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","isChainedBefore").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsChainedBefore(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","previousTaskId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPreviousTaskId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","claimAction").equals(reader.getName())){
                                
                                                object.setClaimAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","revokeAction").equals(reader.getName())){
                                
                                                object.setRevokeAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","saveAction").equals(reader.getName())){
                                
                                                object.setSaveAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","dismissAction").equals(reader.getName())){
                                
                                                object.setDismissAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","completeAction").equals(reader.getName())){
                                
                                                object.setCompleteAction(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessControlType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","attachments").equals(reader.getName())){
                                
                                                object.setAttachments(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.Attachments.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.intalio.com/BPMS/Workflow/TaskManagementServices-20051109/","customMetadata").equals(reader.getName())){
                                
                                                object.setCustomMetadata(com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CustomMetadataType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    