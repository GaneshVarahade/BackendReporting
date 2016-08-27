package com.comlink.common;

import com.comlink.util.JobUtils;

public class App {
	public static void main(String[] args) throws Exception {
		
		Cli cli=new Cli(args);
		cli.parse();
		JobUtils.startJobs();
	}
}
