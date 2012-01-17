

/**
 * TaskManagementServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

    package com.intalio.www.bpms.workflow.taskmanagementservices_20051109;

    /*
     *  TaskManagementServices java interface
     */

    public interface TaskManagementServices {
          

        /**
          * Auto generated method signature
          * 
                    * @param getTaskRequest14
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskResponse getTask(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest getTaskRequest14)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getTaskRequest14
            
          */
        public void startgetTask(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskRequest getTaskRequest14,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deletePipaRequest16
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse deletePipa(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest deletePipaRequest16)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deletePipaRequest16
            
          */
        public void startdeletePipa(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeletePipaRequest deletePipaRequest16,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param removeAttachmentRequest18
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse removeAttachment(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest removeAttachmentRequest18)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableAttachmentFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param removeAttachmentRequest18
            
          */
        public void startremoveAttachment(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.RemoveAttachmentRequest removeAttachmentRequest18,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getTaskOwnerAndStateRequest20
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateResponse getTaskOwnerAndState(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest getTaskOwnerAndStateRequest20)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getTaskOwnerAndStateRequest20
            
          */
        public void startgetTaskOwnerAndState(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskOwnerAndStateRequest getTaskOwnerAndStateRequest20,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getCustomColumnsRequest22
                
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsResponse getCustomColumns(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest getCustomColumnsRequest22)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getCustomColumnsRequest22
            
          */
        public void startgetCustomColumns(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetCustomColumnsRequest getCustomColumnsRequest22,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param manageFromInstanceRequest24
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse manageFromInstance(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest manageFromInstanceRequest24)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param manageFromInstanceRequest24
            
          */
        public void startmanageFromInstance(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ManageFromInstanceRequest manageFromInstanceRequest24,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAvailableTasksRequest26
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksResponse getAvailableTasks(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest getAvailableTasksRequest26)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAvailableTasksRequest26
            
          */
        public void startgetAvailableTasks(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAvailableTasksRequest getAvailableTasksRequest26,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param countAvailableTasksRequest28
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksResponse countAvailableTasks(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest countAvailableTasksRequest28)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param countAvailableTasksRequest28
            
          */
        public void startcountAvailableTasks(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CountAvailableTasksRequest countAvailableTasksRequest28,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param skipRequest30
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse skip(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest skipRequest30)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param skipRequest30
            
          */
        public void startskip(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SkipRequest skipRequest30,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createRequest32
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse create(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest createRequest32)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createRequest32
            
          */
        public void startcreate(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CreateRequest createRequest32,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param initRequest34
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitResponse initProcess(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest initRequest34)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param initRequest34
            
          */
        public void startinitProcess(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InitRequest initRequest34,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param reassignRequest36
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse reassign(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest reassignRequest36)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param reassignRequest36
            
          */
        public void startreassign(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ReassignRequest reassignRequest36,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setOutputRequest38
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse setOutput(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest setOutputRequest38)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setOutputRequest38
            
          */
        public void startsetOutput(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputRequest setOutputRequest38,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param completeRequest40
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse complete(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest completeRequest40)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param completeRequest40
            
          */
        public void startcomplete(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.CompleteRequest completeRequest40,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setOutputAndCompleteRequest42
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse setOutputAndComplete(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest setOutputAndCompleteRequest42)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setOutputAndCompleteRequest42
            
          */
        public void startsetOutputAndComplete(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.SetOutputAndCompleteRequest setOutputAndCompleteRequest42,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAttachmentsRequest44
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsResponse getAttachments(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest getAttachmentsRequest44)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAttachmentsRequest44
            
          */
        public void startgetAttachments(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetAttachmentsRequest getAttachmentsRequest44,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateRequest46
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse update(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest updateRequest46)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateRequest46
            
          */
        public void startupdate(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UpdateRequest updateRequest46,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getPipaRequest48
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaResponse getPipa(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest getPipaRequest48)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getPipaRequest48
            
          */
        public void startgetPipa(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetPipaRequest getPipaRequest48,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deleteAllRequest50
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse deleteAll(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest deleteAllRequest50)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteAllRequest50
            
          */
        public void startdeleteAll(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteAllRequest deleteAllRequest50,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addAttachmentRequest52
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse addAttachment(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest addAttachmentRequest52)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addAttachmentRequest52
            
          */
        public void startaddAttachment(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AddAttachmentRequest addAttachmentRequest52,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param storePipaRequest54
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse storePipa(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest storePipaRequest54)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param storePipaRequest54
            
          */
        public void startstorePipa(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.StorePipaRequest storePipaRequest54,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getTaskListRequest56
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListResponse getTaskList(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest getTaskListRequest56)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getTaskListRequest56
            
          */
        public void startgetTaskList(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.GetTaskListRequest getTaskListRequest56,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deleteRequest58
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse delete(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest deleteRequest58)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteRequest58
            
          */
        public void startdelete(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.DeleteRequest deleteRequest58,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param failRequest60
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.OkResponse fail(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest failRequest60)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param failRequest60
            
          */
        public void startfail(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.FailRequest failRequest60,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param listTasksFromInstanceRequest62
                
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException : 
             * @throws com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException : 
         */

         
                     public com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceResponse listTasksFromInstance(

                        com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest listTasksFromInstanceRequest62)
                        throws java.rmi.RemoteException
             
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.AccessDeniedFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidInputMessageFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.UnavailableTaskFaultException
          ,com.intalio.www.bpms.workflow.taskmanagementservices_20051109.InvalidParticipantTokenFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param listTasksFromInstanceRequest62
            
          */
        public void startlistTasksFromInstance(

            com.intalio.www.bpms.workflow.taskmanagementservices_20051109.ListTasksFromInstanceRequest listTasksFromInstanceRequest62,

            final com.intalio.www.bpms.workflow.taskmanagementservices_20051109.TaskManagementServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    