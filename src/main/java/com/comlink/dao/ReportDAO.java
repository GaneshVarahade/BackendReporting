package com.comlink.dao;

import java.sql.SQLException;
import java.util.List;

import com.comlink.model.ASRACD;
import com.comlink.model.ConcurrentCalls;
import com.comlink.model.Network;

public interface ReportDAO 
{
	
	public List<Network> getNetworkReport() throws SQLException, ClassNotFoundException;
	
	public List<ASRACD> getASRACDReport() throws SQLException, ClassNotFoundException;
	
	public List<ConcurrentCalls> getConcurrentCallsReport() throws SQLException, ClassNotFoundException;
}




