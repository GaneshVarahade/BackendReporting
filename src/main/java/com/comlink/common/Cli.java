package com.comlink.common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.PatternLayout;

import com.comlink.model.CommandService;
import com.comlink.model.DatabasePropeties;

public class Cli {
	public static CommandService commandService = new CommandService();
	public static DatabasePropeties databaseProperties = new DatabasePropeties();

	public Cli(String[] args) {
	}

	public void parse() throws Exception {
		try {
			String configpath = "config.properties";
			Properties prop = new Properties();
			InputStream inputStream = new FileInputStream(configpath);
			prop.load(inputStream);
			databaseProperties.setDrivers(String.valueOf(prop.get("jdbc.driverClassName")));
			databaseProperties.setUrl(String.valueOf(prop.get("jdbc.url")));
			databaseProperties.setUsername(String.valueOf(prop.get("jdbc.username")));
			databaseProperties.setPassword(String.valueOf(prop.get("jdbc.password")));
			databaseProperties.setReportDir(String.valueOf(prop.get("reports.dir")));
			databaseProperties.setReportASRCDR(String.valueOf(prop.get("reports.asracd")));
			databaseProperties.setReportConcurrentCalls(String.valueOf(prop.get("reports.concurrent")));
			databaseProperties.setReportNetwork(String.valueOf(prop.get("reports.network")));
			databaseProperties.setLogFile(String.valueOf(prop.get("log.file")));

			// creates pattern layout
			PatternLayout layout = new PatternLayout();
			String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
			layout.setConversionPattern(conversionPattern);

			// creates console appender
			ConsoleAppender consoleAppender = new ConsoleAppender();
			consoleAppender.setLayout(layout);
			consoleAppender.activateOptions();

			// creates file appender
			FileAppender fileAppender = new FileAppender();
			fileAppender.setFile(databaseProperties.getLogFile());
			fileAppender.setLayout(layout);
			fileAppender.activateOptions();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}