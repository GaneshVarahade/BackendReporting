package com.comlink.dao.impl;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.comlink.common.Cli;
import com.comlink.dao.ReportDAO;
import com.comlink.model.ASRACD;
import com.comlink.model.ConcurrentCalls;
import com.comlink.model.Network;
import com.mysql.jdbc.Connection;

public class ReportDaoImpl implements ReportDAO {

	public List<Network> getNetworkReport() throws SQLException, ClassNotFoundException {
		List<Network> networkLst = new ArrayList<Network>();
		Class.forName(Cli.databaseProperties.getDrivers());
		Connection connection = (Connection) DriverManager.getConnection(Cli.databaseProperties.getUrl(),Cli.databaseProperties.getUsername(), Cli.databaseProperties.getPassword());
		String query = "Call NetWork ()";
		CallableStatement stmt = connection.prepareCall(query);
		boolean result = stmt.execute();
		if (result == true) {
			ResultSet resultset = stmt.executeQuery();
			while (resultset.next()) {
				Network network = new Network();
				network.setTimeFrom(resultset.getString("TimeFrom"));
				network.setTimeTo(resultset.getString("TimeTo"));
				network.setDuration(resultset.getString("Duration"));
				network.setDNIS(Long.valueOf(resultset.getString("DNIS")));
				network.setCustomerName(resultset.getString("CustomerName"));
				network.setNumberOfCalls(resultset.getString("NumberOfCalls"));
				network.setALegReleaseCauseCode200(resultset.getString("ALegReleaseCauseCode200"));
				network.setBLegReleaseCauseCode200(resultset.getString("BLegReleaseCauseCode200"));
				network.setCLegReleaseCauseCode200(resultset.getString("CLegReleaseCauseCode200"));
				network.setALegReleaseCauseCode487(resultset.getString("ALegReleaseCauseCode487"));
				network.setBLegReleaseCauseCode487(resultset.getString("BLegReleaseCauseCode487"));
				network.setCLegReleaseCauseCode487(resultset.getString("CLegReleaseCauseCode487"));
				networkLst.add(network);
			}
		}
		String updatequery = "CALL update_NetWork();";
		CallableStatement updatestmt = connection.prepareCall(updatequery);
		updatestmt.execute();
		connection.close();
		return networkLst;
	}

	public List<ASRACD> getASRACDReport() throws SQLException, ClassNotFoundException {
		List<ASRACD> asracdLst = new ArrayList<ASRACD>();
		Class.forName(Cli.databaseProperties.getDrivers());
		Connection connection = (Connection) DriverManager.getConnection(Cli.databaseProperties.getUrl(),Cli.databaseProperties.getUsername(), Cli.databaseProperties.getPassword());
		String query = "Call ASRACD ()";
		CallableStatement stmt = connection.prepareCall(query);
		boolean result = stmt.execute();
		if (result == true) {
			ResultSet resultset = stmt.executeQuery();
			while (resultset.next()) {
				ASRACD asracd = new ASRACD();
				asracd.setTimeFrom(resultset.getString("TimeFrom"));
				asracd.setTimeTo(resultset.getString("TimeTo"));
				asracd.setDuration(resultset.getString("Duration"));
				asracd.setDNIS(Long.valueOf(resultset.getString("DNIS")));
				asracd.setCustomerName(resultset.getString("CustomerName"));
				asracd.setMappedInternationalNumber(resultset.getString("MappedInternationalNumber"));
				asracd.setTotalCallAttemptsALeg(resultset.getString("TotalCallAttemptsALeg"));
				asracd.setTotalCallCompletedAllLegB(resultset.getString("TotalCallCompletedAllLegB"));
				asracd.setTotalCallCompletedAllLegC(resultset.getString("TotalCallCompletedAllLegC"));
				asracd.setTotalAllCompletedCall(resultset.getString("TotalAllCompletedCall"));
				asracd.setASR(resultset.getString("ASR"));
				asracd.setACD(resultset.getString("ACD"));
				asracdLst.add(asracd);
			}
		}
		String updatequery = "CALL update_ASRACD();";
		CallableStatement updatestmt = connection.prepareCall(updatequery);
		updatestmt.execute();
		connection.close();
		return asracdLst;
	}

	public List<ConcurrentCalls> getConcurrentCallsReport() throws SQLException, ClassNotFoundException {
		List<ConcurrentCalls> concurrentLst = new ArrayList<ConcurrentCalls>();
		Class.forName(Cli.databaseProperties.getDrivers());
		Connection connection = (Connection) DriverManager.getConnection(Cli.databaseProperties.getUrl(),Cli.databaseProperties.getUsername(), Cli.databaseProperties.getPassword());
		String query = "Call ConcurrentCalls ()";
		CallableStatement stmt = connection.prepareCall(query);
		boolean result = stmt.execute();
		if (result == true) {
			ResultSet resultset = stmt.executeQuery();
			while (resultset.next()) {
				ConcurrentCalls Concurrent = new ConcurrentCalls();
				Concurrent.setTimeFrom(resultset.getString("TimeFrom"));
				Concurrent.setTimeTo(resultset.getString("TimeTo"));
				Concurrent.setDuration(resultset.getString("Duration"));
				Concurrent.setDNIS(Long.valueOf(resultset.getString("DNIS")));
				Concurrent.setCustomerName(resultset.getString("CustomerName"));
				Concurrent.setConcurrentCalls(resultset.getString("ConcurrentCalls"));
				Concurrent.setCPS(resultset.getString("CPS"));
				concurrentLst.add(Concurrent);
			}
		}
		String updatequery = "CALL update_ConcurrentCalls();";
		CallableStatement updatestmt = connection.prepareCall(updatequery);
		updatestmt.execute();
		connection.close();
		return concurrentLst;
	}

}
