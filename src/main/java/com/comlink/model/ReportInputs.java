package com.comlink.model;

import java.util.Date;

public class ReportInputs {
	private Date fromDate; 
	private Date toDate;
	private int didNumber;
	private String customerName;
	private String serviceError;
	private String networkError;
	
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public int getDidNumber() {
		return didNumber;
	}
	public void setDidNumber(int didNumber) {
		this.didNumber = didNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getServiceError() {
		return serviceError;
	}
	public void setServiceError(String serviceError) {
		this.serviceError = serviceError;
	}
	public String getNetworkError() {
		return networkError;
	}
	public void setNetworkError(String networkError) {
		this.networkError = networkError;
	}
	
	
}
