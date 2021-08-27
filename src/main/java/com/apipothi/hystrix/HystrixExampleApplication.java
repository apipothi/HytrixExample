package com.apipothi.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Web Site  : http://apipothi.com/
 * Play List : MICROSERVICE-SPRINGBOOT
 * JAVA      : 1.8
*/

////http://localhost:9091/swagger-ui.html
@SpringBootApplication
@EnableHystrix
public class HystrixExampleApplication {
	private final static Logger logger = LoggerFactory.getLogger(HystrixExampleApplication.class);

	public static void main(String[] args) {
		logger.info("***HytrixExampleApplication-App-STARTING***");
		SpringApplication.run(HystrixExampleApplication.class, args);
		logger.info("***HytrixExampleApplication-App-STARTING***");
	}

}
