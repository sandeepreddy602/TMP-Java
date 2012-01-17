
/**
 * TaskManagementServicesCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

    package com.intalio.www.bpms.workflow.taskmanagementservices_20051109;

    /**
     *  TaskManagementServicesCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TaskManagementServicesCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TaskManagementServicesCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TaskManagementServicesCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getTask method
            * override this method for handling normal response from getTask operation
            */
           public void receiveResultgetTask(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTask operation
           */
            public void receiveErrorgetTask(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePipa method
            * override this method for handling normal response from deletePipa operation
            */
           public void receiveResultdeletePipa(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePipa operation
           */
            public void receiveErrordeletePipa(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeAttachment method
            * override this method for handling normal response from removeAttachment operation
            */
           public void receiveResultremoveAttachment(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeAttachment operation
           */
            public void receiveErrorremoveAttachment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTaskOwnerAndState method
            * override this method for handling normal response from getTaskOwnerAndState operation
            */
           public void receiveResultgetTaskOwnerAndState(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTaskOwnerAndState operation
           */
            public void receiveErrorgetTaskOwnerAndState(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCustomColumns method
            * override this method for handling normal response from getCustomColumns operation
            */
           public void receiveResultgetCustomColumns(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCustomColumns operation
           */
            public void receiveErrorgetCustomColumns(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for manageFromInstance method
            * override this method for handling normal response from manageFromInstance operation
            */
           public void receiveResultmanageFromInstance(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from manageFromInstance operation
           */
            public void receiveErrormanageFromInstance(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvailableTasks method
            * override this method for handling normal response from getAvailableTasks operation
            */
           public void receiveResultgetAvailableTasks(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvailableTasks operation
           */
            public void receiveErrorgetAvailableTasks(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for countAvailableTasks method
            * override this method for handling normal response from countAvailableTasks operation
            */
           public void receiveResultcountAvailableTasks(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from countAvailableTasks operation
           */
            public void receiveErrorcountAvailableTasks(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for skip method
            * override this method for handling normal response from skip operation
            */
           public void receiveResultskip(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from skip operation
           */
            public void receiveErrorskip(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for create method
            * override this method for handling normal response from create operation
            */
           public void receiveResultcreate(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from create operation
           */
            public void receiveErrorcreate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initProcess method
            * override this method for handling normal response from initProcess operation
            */
           public void receiveResultinitProcess(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initProcess operation
           */
            public void receiveErrorinitProcess(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for reassign method
            * override this method for handling normal response from reassign operation
            */
           public void receiveResultreassign(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reassign operation
           */
            public void receiveErrorreassign(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setOutput method
            * override this method for handling normal response from setOutput operation
            */
           public void receiveResultsetOutput(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setOutput operation
           */
            public void receiveErrorsetOutput(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for complete method
            * override this method for handling normal response from complete operation
            */
           public void receiveResultcomplete(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from complete operation
           */
            public void receiveErrorcomplete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setOutputAndComplete method
            * override this method for handling normal response from setOutputAndComplete operation
            */
           public void receiveResultsetOutputAndComplete(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setOutputAndComplete operation
           */
            public void receiveErrorsetOutputAndComplete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAttachments method
            * override this method for handling normal response from getAttachments operation
            */
           public void receiveResultgetAttachments(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAttachments operation
           */
            public void receiveErrorgetAttachments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for update method
            * override this method for handling normal response from update operation
            */
           public void receiveResultupdate(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from update operation
           */
            public void receiveErrorupdate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPipa method
            * override this method for handling normal response from getPipa operation
            */
           public void receiveResultgetPipa(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPipa operation
           */
            public void receiveErrorgetPipa(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteAll method
            * override this method for handling normal response from deleteAll operation
            */
           public void receiveResultdeleteAll(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteAll operation
           */
            public void receiveErrordeleteAll(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addAttachment method
            * override this method for handling normal response from addAttachment operation
            */
           public void receiveResultaddAttachment(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addAttachment operation
           */
            public void receiveErroraddAttachment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for storePipa method
            * override this method for handling normal response from storePipa operation
            */
           public void receiveResultstorePipa(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from storePipa operation
           */
            public void receiveErrorstorePipa(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTaskList method
            * override this method for handling normal response from getTaskList operation
            */
           public void receiveResultgetTaskList(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTaskList operation
           */
            public void receiveErrorgetTaskList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delete method
            * override this method for handling normal response from delete operation
            */
           public void receiveResultdelete(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delete operation
           */
            public void receiveErrordelete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fail method
            * override this method for handling normal response from fail operation
            */
           public void receiveResultfail(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fail operation
           */
            public void receiveErrorfail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for listTasksFromInstance method
            * override this method for handling normal response from listTasksFromInstance operation
            */
           public void receiveResultlistTasksFromInstance(
                    com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from listTasksFromInstance operation
           */
            public void receiveErrorlistTasksFromInstance(java.lang.Exception e) {
            }
                


    }
    