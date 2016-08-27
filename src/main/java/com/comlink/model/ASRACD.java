package com.comlink.model;

public class ASRACD {
	private String TimeFrom;
	private String TimeTo;
	private String Duration;
	private Long DNIS;
	private String CustomerName;
	private String MappedInternationalNumber;
	private String TotalCallAttemptsALeg;
	private String TotalCallCompletedAllLegB;
	private String TotalCallCompletedAllLegC;
	private String TotalAllCompletedCall;
	private String ASR;
	private String ACD;
	
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
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getMappedInternationalNumber() {
		return MappedInternationalNumber;
	}
	public void setMappedInternationalNumber(String mappedInternationalNumber) {
		MappedInternationalNumber = mappedInternationalNumber;
	}
	public String getTotalCallAttemptsALeg() {
		return TotalCallAttemptsALeg;
	}
	public void setTotalCallAttemptsALeg(String totalCallAttemptsALeg) {
		TotalCallAttemptsALeg = totalCallAttemptsALeg;
	}
	public String getTotalCallCompletedAllLegB() {
		return TotalCallCompletedAllLegB;
	}
	public void setTotalCallCompletedAllLegB(String totalCallCompletedAllLegB) {
		TotalCallCompletedAllLegB = totalCallCompletedAllLegB;
	}
	public String getTotalCallCompletedAllLegC() {
		return TotalCallCompletedAllLegC;
	}
	public void setTotalCallCompletedAllLegC(String totalCallCompletedAllLegC) {
		TotalCallCompletedAllLegC = totalCallCompletedAllLegC;
	}
	public String getTotalAllCompletedCall() {
		return TotalAllCompletedCall;
	}
	public void setTotalAllCompletedCall(String totalAllCompletedCall) {
		TotalAllCompletedCall = totalAllCompletedCall;
	}
	public String getASR() {
		return ASR;
	}
	public void setASR(String aSR) {
		ASR = aSR;
	}
	public String getACD() {
		return ACD;
	}
	public void setACD(String aCD) {
		ACD = aCD;
	}
	public Long getDNIS() {
		return DNIS;
	}
	public void setDNIS(Long dNIS) {
		DNIS = dNIS;
	}
	
}
