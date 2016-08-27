package com.comlink.model;

public class DatabasePropeties {
	private String drivers;
	private String url;
	private String username;
	private String password;
	private String reportDir;
	private String reportASRCDR;
	private String reportConcurrentCalls;
	private String reportNetwork;
	private String logFile;
	
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReportDir() {
		return reportDir;
	}
	public void setReportDir(String reportDir) {
		this.reportDir = reportDir;
	}
	public String getReportASRCDR() {
		return reportASRCDR;
	}
	public void setReportASRCDR(String reportASRCDR) {
		this.reportASRCDR = reportASRCDR;
	}
	public String getReportConcurrentCalls() {
		return reportConcurrentCalls;
	}
	public void setReportConcurrentCalls(String reportConcurrentCalls) {
		this.reportConcurrentCalls = reportConcurrentCalls;
	}
	public String getReportNetwork() {
		return reportNetwork;
	}
	public void setReportNetwork(String reportNetwork) {
		this.reportNetwork = reportNetwork;
	}
	public String getLogFile() {
		return logFile;
	}
	public void setLogFile(String logFile) {
		this.logFile = logFile;
	}
}
