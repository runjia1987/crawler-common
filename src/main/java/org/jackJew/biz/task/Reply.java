package org.jackJew.biz.task;

public class Reply {
	
	/**
	 * incremental id
	 */
	private String taskId;
	private String bizType;
	private String result;	// expected format: {rs: [], status: []}
	
	public Reply(String taskId, String bizType, String result) {
		this.taskId = taskId;
		this.bizType = bizType;
		this.result = result;
	}
	
	public String getTaskId() {
		return taskId;
	}
	
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}

	public String getBizType() {
		return bizType;
	}
	
}