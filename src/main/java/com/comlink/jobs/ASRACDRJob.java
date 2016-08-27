package com.comlink.jobs;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.comlink.dao.ReportDAO;
import com.comlink.model.ASRACD;
import com.comlink.model.ReportInputs;
import com.comlink.util.WriteUtils;

public class ASRACDRJob {
	
	private ReportInputs reportInputs;
	
    public ReportInputs getReportInputs() {
		return reportInputs;
	}
	public void setReportInputs(ReportInputs reportInputs) {
		this.reportInputs = reportInputs;
	}
	
	public void performAction() {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/Module.xml");
    	ReportDAO crdDao = (ReportDAO) context.getBean("reportDAO");
    	try {
			List<ASRACD> ASRACDlst = crdDao.getASRACDReport();
			WriteUtils.writeASRACDRReport(ASRACDlst);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }   
}
