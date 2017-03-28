package com.eteration.elk.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogGenerator {
	
	private static Logger logger = LoggerFactory.getLogger(LogGenerator.class);
	
	public static void main(String[] args) throws InterruptedException {
		logger.info("HELLO WORLD ELK");
		Thread.sleep(10000);//wait for logstash
	}

}
