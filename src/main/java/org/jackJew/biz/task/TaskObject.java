package org.jackJew.biz.task;

import java.util.Map;

public class TaskObject {
	
	/**
	 * incremental id
	 */
	private String taskId;
	
	private String bizType;
	private Map<String, String> args;
	
	public TaskObject(String taskId) {
		this.taskId = taskId;
	}
	
	public TaskObject(String taskId, String bizType) {
		this.taskId = taskId;
		this.bizType = bizType;
	}
	
	public String getTaskId() {
		return taskId;
	}
	
	public String getBizType() {
		return bizType;
	}
	
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	
	public Map<String, String> getArgs() {
		return args;
	}
	
	public void setArgs(Map<String, String> args) {
		this.args = args;
	}
	
}