package com.comlink.jobs;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.comlink.dao.ReportDAO;
import com.comlink.model.ConcurrentCalls;
import com.comlink.model.ReportInputs;
import com.comlink.util.WriteUtils;

public class ConcurrentCallsJob {
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
    		List<ConcurrentCalls> concurrentCallslst = crdDao.getConcurrentCallsReport();
			WriteUtils.writeConcurrentCallsReport(concurrentCallslst);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }    
}
