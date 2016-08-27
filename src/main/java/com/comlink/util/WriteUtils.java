package com.comlink.util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.comlink.common.Cli;
import com.comlink.model.ASRACD;
import com.comlink.model.ConcurrentCalls;
import com.comlink.model.Network;
 

public class WriteUtils {
	
	static XSSFWorkbook NetworkReportworkbook;
	static XSSFWorkbook ASRACDReportworkbook;
	static XSSFWorkbook ConcurrentCallsReportworkbook;
	private static final Logger log = Logger.getLogger(Cli.class.getName());
 
    public static void writeNetworkReport(List<Network> networklst) throws IOException {
    	log.error("writeNetworkReport");
    	System.out.println("writeNetworkReport");
    	String fileName = new SimpleDateFormat("yyyyMMdd").format(new Date());
    	File reportfile=new File(Cli.databaseProperties.getReportDir()+"/Network Report"+fileName+".xlsx");
    	XSSFSheet sheet =null;
    	int rowIndex=0;
		if(reportfile.exists()){
    		sheet=NetworkReportworkbook.getSheetAt(0);
    		rowIndex = sheet.getPhysicalNumberOfRows();
    		reportfile.delete();
    	}else{
    		NetworkReportworkbook = new XSSFWorkbook();
    		sheet = NetworkReportworkbook.createSheet("NetworkReport");
    		rowIndex = 0;
            
            Row rowheader = sheet.createRow(rowIndex++);

            rowheader.createCell(0).setCellValue("TimeFrom");
            rowheader.createCell(1).setCellValue("TimeTo");
            rowheader.createCell(2).setCellValue("Duration");
            rowheader.createCell(3).setCellValue("DNIS");
            rowheader.createCell(4).setCellValue("CustomerName");
            rowheader.createCell(5).setCellValue("NumberOfCalls");
            rowheader.createCell(6).setCellValue("ALegReleaseCauseCode200");
            rowheader.createCell(7).setCellValue("BLegReleaseCauseCode200");
            rowheader.createCell(8).setCellValue("CLegReleaseCauseCode200");
            rowheader.createCell(9).setCellValue("ALegReleaseCauseCode487");
            rowheader.createCell(10).setCellValue("BLegReleaseCauseCode487");
            rowheader.createCell(11).setCellValue("CLegReleaseCauseCode487");
    	}

        
        for (Network network : networklst) {
        	Row row = sheet.createRow(rowIndex++);
        	row.createCell(0).setCellValue(network.getTimeFrom());
        	row.createCell(1).setCellValue(network.getTimeTo());
        	row.createCell(2).setCellValue(network.getDuration());
        	row.createCell(3).setCellValue(network.getDNIS());
            row.createCell(4).setCellValue(network.getCustomerName());
            row.createCell(5).setCellValue(network.getNumberOfCalls());
            row.createCell(6).setCellValue(network.getALegReleaseCauseCode200());
            row.createCell(7).setCellValue(network.getBLegReleaseCauseCode200());
            row.createCell(8).setCellValue(network.getCLegReleaseCauseCode200());
            row.createCell(9).setCellValue(network.getALegReleaseCauseCode487());
            row.createCell(10).setCellValue(network.getBLegReleaseCauseCode487());
            row.createCell(11).setCellValue(network.getCLegReleaseCauseCode487());
		}

        FileOutputStream outputStream = new FileOutputStream(new File(Cli.databaseProperties.getReportDir()+"/Network Report"+fileName+".xlsx"),true);
        NetworkReportworkbook.write(outputStream);
    }
    
    public static void writeASRACDRReport(List<ASRACD> asracdlst) throws IOException {
    	log.error("writeASRACDRReport");
    	System.out.println("writeASRACDRReport");
    	String fileName = new SimpleDateFormat("yyyyMMdd").format(new Date());
    	File reportfile=new File(Cli.databaseProperties.getReportDir()+"/ASRACDR Report"+fileName+".xlsx");
    	XSSFSheet sheet =null;
    	int rowIndex=0;
		if(reportfile.exists()){
    		sheet=ASRACDReportworkbook.getSheetAt(0);
    		rowIndex = sheet.getPhysicalNumberOfRows();
    		reportfile.delete();
    	}else{
    		ASRACDReportworkbook = new XSSFWorkbook();
    		sheet = ASRACDReportworkbook.createSheet("ASRACDRReport");
    		rowIndex = 0;
            Row rowheader = sheet.createRow(rowIndex++);

            rowheader.createCell(0).setCellValue("TimeFrom");
            rowheader.createCell(1).setCellValue("TimeTo");
            rowheader.createCell(2).setCellValue("Duration");
            rowheader.createCell(3).setCellValue("DNIS");
            rowheader.createCell(4).setCellValue("CustomerName");
            rowheader.createCell(5).setCellValue("MappedInternationalNumber");
            rowheader.createCell(6).setCellValue("TotalCallAttemptsALeg");
            rowheader.createCell(7).setCellValue("TotalCallCompletedAllLegB");
            rowheader.createCell(8).setCellValue("TotalCallCompletedAllLegC");
            rowheader.createCell(9).setCellValue("TotalAllCompletedCall");
            rowheader.createCell(10).setCellValue("ASR");
            rowheader.createCell(11).setCellValue("ACD");
    	}
        


        for (ASRACD asracd : asracdlst) {
        	Row row = sheet.createRow(rowIndex++);
        	row.createCell(0).setCellValue(asracd.getTimeFrom());
        	row.createCell(1).setCellValue(asracd.getTimeTo());
        	row.createCell(2).setCellValue(asracd.getDuration());
        	row.createCell(3).setCellValue(asracd.getDNIS());
            row.createCell(4).setCellValue(asracd.getCustomerName());
        	row.createCell(5).setCellValue(asracd.getMappedInternationalNumber());
        	row.createCell(6).setCellValue(asracd.getTotalCallAttemptsALeg());
        	row.createCell(7).setCellValue(asracd.getTotalCallCompletedAllLegB());
        	row.createCell(8).setCellValue(asracd.getTotalCallCompletedAllLegC());
        	row.createCell(9).setCellValue(asracd.getTotalAllCompletedCall());
        	row.createCell(10).setCellValue(asracd.getASR());
        	row.createCell(11).setCellValue(asracd.getACD());
		}

        
        FileOutputStream outputStream = new FileOutputStream(new File(Cli.databaseProperties.getReportDir()+"/ASRACDR Report"+fileName+".xlsx"),true);
        ASRACDReportworkbook.write(outputStream);
    }
    
    public static void writeConcurrentCallsReport(List<ConcurrentCalls> concurrentCallslst) throws IOException {
    	log.error("writeConcurrentCallsReport");
    	System.out.println("writeConcurrentCallsReport");
    	String fileName = new SimpleDateFormat("yyyyMMdd").format(new Date());
    	File reportfile=new File(Cli.databaseProperties.getReportDir()+"/ConcurrentCalls Report"+fileName+".xlsx");
    	XSSFSheet sheet =null;
    	int rowIndex=0;
		if(reportfile.exists()){
    		sheet=ConcurrentCallsReportworkbook.getSheetAt(0);
    		rowIndex = sheet.getPhysicalNumberOfRows();
    		reportfile.delete();
    	}else{
    		ConcurrentCallsReportworkbook = new XSSFWorkbook();
    		sheet = ConcurrentCallsReportworkbook.createSheet("NetworkReport");
    		rowIndex = 0;
            Row rowheader = sheet.createRow(rowIndex++);

            rowheader.createCell(0).setCellValue("TimeFrom");
            rowheader.createCell(1).setCellValue("TimeTo");
            rowheader.createCell(2).setCellValue("Duration");
            rowheader.createCell(3).setCellValue("DNIS");
            rowheader.createCell(4).setCellValue("CustomerName");
            rowheader.createCell(5).setCellValue("ConcurrentCalls");
            rowheader.createCell(6).setCellValue("CPS");
    	}



        for (ConcurrentCalls concurrentCalls : concurrentCallslst) {
        	Row row = sheet.createRow(rowIndex++);
        	row.createCell(0).setCellValue(concurrentCalls.getTimeFrom());
        	row.createCell(1).setCellValue(concurrentCalls.getTimeTo());
        	row.createCell(2).setCellValue(concurrentCalls.getDuration());
        	row.createCell(3).setCellValue(concurrentCalls.getDNIS());
            row.createCell(4).setCellValue(concurrentCalls.getCustomerName());
        	row.createCell(5).setCellValue(concurrentCalls.getConcurrentCalls());
        	row.createCell(6).setCellValue(concurrentCalls.getCPS());
		}

        FileOutputStream outputStream = new FileOutputStream(new File(Cli.databaseProperties.getReportDir()+"/ConcurrentCalls Report"+fileName+".xlsx"),true);
        ConcurrentCallsReportworkbook.write(outputStream);
    }
 
}