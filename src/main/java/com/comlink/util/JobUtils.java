package com.comlink.util;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.CronTriggerBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;

import com.comlink.common.Cli;
import com.comlink.jobs.ASRACDRJob;
import com.comlink.jobs.ConcurrentCallsJob;
import com.comlink.jobs.NetworkJob;

public class JobUtils {

	public static void startJobs( ) throws Exception {

		
		ClassPathResource res = new ClassPathResource("resources/jobs.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);

		// get the quartzFactory bean
		Scheduler scheduler = (Scheduler) factory.getBean("scheduler");

		// get the task bean
		NetworkJob networkJob = (NetworkJob) factory.getBean("networkJob");
		ConcurrentCallsJob concurrentJob = (ConcurrentCallsJob) factory.getBean("concurrentCallsJob");
		ASRACDRJob ASRACDRJob = (ASRACDRJob) factory.getBean("ASRACDRJob");

			// create JOB for networkJob reports
			MethodInvokingJobDetailFactoryBean networkJobDetail = new MethodInvokingJobDetailFactoryBean();
			networkJobDetail.setTargetObject(networkJob);
			networkJobDetail.setTargetMethod("performAction");
			networkJobDetail.setName("networkJob");
			networkJobDetail.setConcurrent(false);
			networkJobDetail.afterPropertiesSet();

			CronTriggerBean networkcronTrigger = new CronTriggerBean();
			networkcronTrigger.setBeanName("networkJobCron");


			String networkexpression = Cli.databaseProperties.getReportNetwork();
			networkcronTrigger.setCronExpression(networkexpression);
			networkcronTrigger.afterPropertiesSet();
			
			scheduler.scheduleJob((JobDetail) networkJobDetail.getObject(), networkcronTrigger);

			// create JOB for concurrentJob reports
			MethodInvokingJobDetailFactoryBean concurrentJobDetail = new MethodInvokingJobDetailFactoryBean();
			concurrentJobDetail.setTargetObject(concurrentJob);
			concurrentJobDetail.setTargetMethod("performAction");
			concurrentJobDetail.setName("concurrentCallsJob");
			concurrentJobDetail.setConcurrent(false);
			concurrentJobDetail.afterPropertiesSet();

			CronTriggerBean concurrentcronTrigger = new CronTriggerBean();
			concurrentcronTrigger.setBeanName("concurrentCallsJobCron");


			String concurrentexpression = Cli.databaseProperties.getReportConcurrentCalls();
			concurrentcronTrigger.setCronExpression(concurrentexpression);
			concurrentcronTrigger.afterPropertiesSet();

			scheduler.scheduleJob((JobDetail) concurrentJobDetail.getObject(), concurrentcronTrigger);

			// create JOB for ASRACDRJob reports
			MethodInvokingJobDetailFactoryBean ASRACDRJobDetail = new MethodInvokingJobDetailFactoryBean();
			ASRACDRJobDetail.setTargetObject(ASRACDRJob);
			ASRACDRJobDetail.setTargetMethod("performAction");
			ASRACDRJobDetail.setName("ASRACDRJob");
			ASRACDRJobDetail.setConcurrent(false);
			ASRACDRJobDetail.afterPropertiesSet();

			CronTriggerBean ASRACDRcronTrigger = new CronTriggerBean();
			ASRACDRcronTrigger.setBeanName("ASRACDRJobCron");

			String ASRACDRexpression = Cli.databaseProperties.getReportASRCDR();
			ASRACDRcronTrigger.setCronExpression(ASRACDRexpression);
			ASRACDRcronTrigger.afterPropertiesSet();

			scheduler.scheduleJob((JobDetail) ASRACDRJobDetail.getObject(), ASRACDRcronTrigger);

			// Start Scheduler
			scheduler.start();


	}
}
