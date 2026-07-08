package com.cognizant.spring_learn;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		logger.info("Inside Main");
		SpringApplication.run(SpringLearnApplication.class, args);
	}

}
