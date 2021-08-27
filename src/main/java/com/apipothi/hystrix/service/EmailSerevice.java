package com.apipothi.hystrix.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Web Site  : http://apipothi.com/
 * Play List : MICROSERVICE-SPRINGBOOT
 * JAVA      : 1.8
*/

@Component
@DefaultProperties(defaultFallback = "defaultEmailSerevice")
public class EmailSerevice {

	private final static Logger logger = LoggerFactory.getLogger(EmailSerevice.class);

	// @HystrixCommand(fallbackMethod = "defaultEmailSerevice")
	@HystrixCommand
	public String getFirstName() {
		throw new RuntimeException("getFirstName Exception");
		// return "DEFAULT VALUE";
	}

	// @HystrixCommand(fallbackMethod = "defaultEmailSerevice")
	@HystrixCommand
	public String getMiddleName(String myEmailService) {
		throw new RuntimeException("getMiddleName Exception");
		// return myEmailService;
	}

	// @HystrixCommand(fallbackMethod = "defaultEmailSerevice")
	@HystrixCommand
	public String getLastName(List<String> emailList) {
		throw new RuntimeException("getLastName Exception");
		// return emailList.toString();
	}

	public String defaultEmailSerevice() {
		return "Please Contact System Administrator";
	}

	/*
	 * public String defaultEmailSerevice(String myEmailService) { return
	 * "Please Contact System Administrator"; }
	 * 
	 * public String defaultEmailSerevice(List<String> emailList) { return
	 * "Please Contact System Administrator"; }
	 */
}
