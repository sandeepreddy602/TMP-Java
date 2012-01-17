package com.intalio.bpms.dao;

import com.intalio.bpms.tmpservice.TaskManagerProcess;

public class BpelDao {
	//TODO using the taskId get the UBP_instance_Id and using this id get the tmp_instance_id
	//currently this is how it is retrieved. Provided by Tammo
//	SELECT distinct s1.piid AS UBP_Instance_id, s2.piid AS TMP_Instance_id
//	FROM bpel_plink_val p1,bpel_plink_val p2, bpel_scope s1, bpel_scope s2, bpel_instance bi
//	WHERE p1.mysessionid = p2.partnersessionid 
//	AND s1.id = p1.scope 
//	AND s2.id = p2.scope
//	AND s1.piid = 93

	public static TaskManagerProcess  getTMP(String taskId){
		
		return new TaskManagerProcess();
	}
	
	public static void persistTMP(TaskManagerProcess tmp){
		
	}
}
