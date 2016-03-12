package org.jackJew.biz.proxy.model;

import java.util.Date;

public class NewProxy implements java.io.Serializable {
	
	private static final long serialVersionUID = 4594050065192424681L;

	private Long id;
	private String hash;
	private String address;
	private String port;
	private Integer succCount;
	private Integer failCount;
	private Double succPercent;
	private Double totalTime;
	private Double avgTime;
	private Integer status;
	private Date createDate;
	private Date updateDate;
	private Date nextValidateTime;
	private Integer intervalMinutes = 0;

	public NewProxy() {
	}

	public NewProxy(String address, String port) {
		this.address = address;
		this.port = port;
	}

	public String toString() {
		return address + "-" + port;
	}

	public String getIpAndPort() {
		return address + ":" + port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Integer getSuccCount() {
		return succCount;
	}

	public void setSuccCount(Integer succCount) {
		this.succCount = succCount;
	}

	public Integer getFailCount() {
		return failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public Double getSuccPercent() {
		return succPercent;
	}

	public void setSuccPercent(Double succPercent) {
		this.succPercent = succPercent;
	}

	public Double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(Double totalTime) {
		this.totalTime = totalTime;
	}

	public Double getAvgTime() {
		return avgTime;
	}

	public void setAvgTime(Double avgTime) {
		this.avgTime = avgTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getNextValidateTime() {
		return nextValidateTime;
	}

	public void setNextValidateTime(Date nextValidateTime) {
		this.nextValidateTime = nextValidateTime;
	}

	public Integer getIntervalMinutes() {
		return intervalMinutes;
	}

	public void setIntervalMinutes(Integer intervalMinutes) {
		this.intervalMinutes = intervalMinutes;
	}
}