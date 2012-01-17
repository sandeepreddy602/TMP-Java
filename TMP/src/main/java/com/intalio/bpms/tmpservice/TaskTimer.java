package com.intalio.bpms.tmpservice;

import java.util.TimerTask;

public class TaskTimer extends TimerTask{

    private TaskTimerListener listener;
    
    public TaskTimer(TaskTimerListener taskTimerListener){
        listener = taskTimerListener;
    }
    
    @Override
    public void run() {  
        listener.notifyWithResponse("response");
        
    }
    

}
