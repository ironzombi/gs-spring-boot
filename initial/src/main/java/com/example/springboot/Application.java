package com.example.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {
    private static final Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("Log4Shell Vulnerable Server");
        logger.info("a Maven Spring boot app(?)");
        logger.warn("listens on port 8080");
		logger.warn("CVE-2021-44228 Log4j Remote Code Execution");
		logger.info("pass X-Api-Version");
    }
}