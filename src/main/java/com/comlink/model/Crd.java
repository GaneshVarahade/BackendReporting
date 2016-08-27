package com.comlink.model;

import java.io.Serializable;

public class Crd implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int cdrId;                  
	private int callerSubId;           
	private int calleeSubId;           
	private int subscriberGroupId;         
	private String callerSubRspId;         
	private String proxyUri;   
	private String sourceAddress;       
	private String calledUri;       
	private long callStart ;
	private long callAnswer;  
	private long callEnd; 
	private String callerUri;   
	private String originCallId;      
	private String terminationCallId;          
	private String sipId;        
	private int sipStatus;
	private String countryCode;       
	private boolean isTerminatedByCaller;   
	
	public Crd(){
	}

	public int getCdrId() {
		return cdrId;
	}

	public void setCdrId(int cdrId) {
		this.cdrId = cdrId;
	}

	public int getCallerSubId() {
		return callerSubId;
	}

	public void setCallerSubId(int callerSubId) {
		this.callerSubId = callerSubId;
	}

	public int getCalleeSubId() {
		return calleeSubId;
	}

	public void setCalleeSubId(int calleeSubId) {
		this.calleeSubId = calleeSubId;
	}

	public int getSubscriberGroupId() {
		return subscriberGroupId;
	}

	public void setSubscriberGroupId(int subscriberGroupId) {
		this.subscriberGroupId = subscriberGroupId;
	}

	public String getCallerSubRspId() {
		return callerSubRspId;
	}

	public void setCallerSubRspId(String callerSubRspId) {
		this.callerSubRspId = callerSubRspId;
	}

	public String getProxyUri() {
		return proxyUri;
	}

	public void setProxyUri(String proxyUri) {
		this.proxyUri = proxyUri;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getCalledUri() {
		return calledUri;
	}

	public void setCalledUri(String calledUri) {
		this.calledUri = calledUri;
	}

	public long getCallStart() {
		return callStart;
	}

	public void setCallStart(long callStart) {
		this.callStart = callStart;
	}

	public long getCallAnswer() {
		return callAnswer;
	}

	public void setCallAnswer(long callAnswer) {
		this.callAnswer = callAnswer;
	}

	public long getCallEnd() {
		return callEnd;
	}

	public void setCallEnd(long callEnd) {
		this.callEnd = callEnd;
	}

	public String getCallerUri() {
		return callerUri;
	}

	public void setCallerUri(String callerUri) {
		this.callerUri = callerUri;
	}

	public String getOriginCallId() {
		return originCallId;
	}

	public void setOriginCallId(String originCallId) {
		this.originCallId = originCallId;
	}

	public String getTerminationCallId() {
		return terminationCallId;
	}

	public void setTerminationCallId(String terminationCallId) {
		this.terminationCallId = terminationCallId;
	}

	public String getSipId() {
		return sipId;
	}

	public void setSipId(String sipId) {
		this.sipId = sipId;
	}

	public int getSipStatus() {
		return sipStatus;
	}

	public void setSipStatus(int sipStatus) {
		this.sipStatus = sipStatus;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isTerminatedByCaller() {
		return isTerminatedByCaller;
	}

	public void setTerminatedByCaller(boolean isTerminatedByCaller) {
		this.isTerminatedByCaller = isTerminatedByCaller;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
