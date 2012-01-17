
/**
 * UserBusinessProcessesServicesCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

    package com.intalio.bpms.fdsclient;

    /**
     *  UserBusinessProcessesServicesCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class UserBusinessProcessesServicesCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public UserBusinessProcessesServicesCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public UserBusinessProcessesServicesCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for notifyTaskCompletion method
            * override this method for handling normal response from notifyTaskCompletion operation
            */
           public void receiveResultnotifyTaskCompletion(
                    com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from notifyTaskCompletion operation
           */
            public void receiveErrornotifyTaskCompletion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createTask method
            * override this method for handling normal response from createTask operation
            */
           public void receiveResultcreateTask(
                    com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createTask operation
           */
            public void receiveErrorcreateTask(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for escalateTask method
            * override this method for handling normal response from escalateTask operation
            */
           public void receiveResultescalateTask(
                    com.intalio.bpms.fdsclient.UserBusinessProcessesServicesStub.EscalateTaskResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from escalateTask operation
           */
            public void receiveErrorescalateTask(java.lang.Exception e) {
            }
                


    }
    