package com.comlink.model;

public class Network {
	private String TimeFrom;
	private String TimeTo;
	private Long DNIS;
	private String customerName;
	private String NumberOfCalls;
	private String ALegReleaseCauseCode200;
	private String BLegReleaseCauseCode200;
	private String CLegReleaseCauseCode200;
	private String ALegReleaseCauseCode487;
	private String BLegReleaseCauseCode487;
	private String CLegReleaseCauseCode487;
	private String Duration;

	public Long getDNIS() {
		return DNIS;
	}
	public void setDNIS(Long dNIS) {
		DNIS = dNIS;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getNumberOfCalls() {
		return NumberOfCalls;
	}
	public void setNumberOfCalls(String numberOfCalls) {
		NumberOfCalls = numberOfCalls;
	}
	public String getALegReleaseCauseCode200() {
		return ALegReleaseCauseCode200;
	}
	public void setALegReleaseCauseCode200(String aLegReleaseCauseCode200) {
		ALegReleaseCauseCode200 = aLegReleaseCauseCode200;
	}
	public String getBLegReleaseCauseCode200() {
		return BLegReleaseCauseCode200;
	}
	public void setBLegReleaseCauseCode200(String bLegReleaseCauseCode200) {
		BLegReleaseCauseCode200 = bLegReleaseCauseCode200;
	}
	public String getCLegReleaseCauseCode200() {
		return CLegReleaseCauseCode200;
	}
	public void setCLegReleaseCauseCode200(String cLegReleaseCauseCode200) {
		CLegReleaseCauseCode200 = cLegReleaseCauseCode200;
	}
	public String getALegReleaseCauseCode487() {
		return ALegReleaseCauseCode487;
	}
	public void setALegReleaseCauseCode487(String aLegReleaseCauseCode487) {
		ALegReleaseCauseCode487 = aLegReleaseCauseCode487;
	}
	public String getBLegReleaseCauseCode487() {
		return BLegReleaseCauseCode487;
	}
	public void setBLegReleaseCauseCode487(String bLegReleaseCauseCode487) {
		BLegReleaseCauseCode487 = bLegReleaseCauseCode487;
	}
	public String getCLegReleaseCauseCode487() {
		return CLegReleaseCauseCode487;
	}
	public void setCLegReleaseCauseCode487(String cLegReleaseCauseCode487) {
		CLegReleaseCauseCode487 = cLegReleaseCauseCode487;
	}
	public String getTimeFrom() {
		return TimeFrom;
	}
	public void setTimeFrom(String timeFrom) {
		TimeFrom = timeFrom;
	}
	public String getTimeTo() {
		return TimeTo;
	}
	public void setTimeTo(String timeTo) {
		TimeTo = timeTo;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	

}
