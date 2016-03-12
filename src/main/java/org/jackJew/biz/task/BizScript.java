package org.jackJew.biz.task;

public class BizScript {
	
	private String bizType;
	private String script;
	private boolean deleted;
	
	public BizScript(String bizType) {
		this.bizType = bizType;
	}
	
	public BizScript(String bizType, String script, boolean deleted) {
		this.bizType = bizType;
		this.script = script;
		this.deleted = deleted;
	}
	
	public String getBizType() {
		return bizType;
	}
	
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	
	public String getScript() {
		return script;
	}
	
	public void setScript(String script) {
		this.script = script;
	}
	
	public boolean isDeleted() {
		return deleted;
	}
	
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
