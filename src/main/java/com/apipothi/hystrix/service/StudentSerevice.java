package com.apipothi.hystrix.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Web Site  : http://apipothi.com/
 * Play List : MICROSERVICE-SPRINGBOOT
 * JAVA      : 1.8
*/

@Component
public class StudentSerevice {

	private final static Logger logger = LoggerFactory.getLogger(StudentSerevice.class);

	/*START - 1 Way to write FALL BACK Method */  
	
		/*@HystrixCommand(fallbackMethod = "defaultgetName")
		public String getStudentName() {
			logger.info("***START-:::::-getName-:::::");
			String myName = "API POTHI ";
			throw new RuntimeException("getName Exception");
			// logger.info("***END-:::::-getName-:::::"); //return myName;
		}
	
		private String defaultgetName() {
			logger.info("***START-:::::-defaultgetName-:::::");
			String myName = "MOCK-API POTHI ";
			logger.info("***END-:::::-defaultgetName-:::::");
			return myName;
		}*/
	 
	/*END - 1 Way to write FALL BACK Method */
	
	/*START - 2 Way to write FALL BACK Method */ 
		
	 /*@HystrixCommand(fallbackMethod = "defaultgetName")
		public String getStudentName() {
			logger.info("***START-:::::-getName-:::::");
			String myName = "API POTHI ";
			throw new RuntimeException("getName Exception");
			//logger.info("***END-:::::-getName-:::::");
			//return myName;
		}
	
		@HystrixCommand
		private String defaultgetName() {
			logger.info("***START-:::::-defaultgetName-:::::");
			String myName = "MOCK-API POTHI ";
			logger.info("***END-:::::-defaultgetName-:::::");
			return myName;
		}*/
		
	/*END - 2 Way to write FALL BACK Method */
		
	/*START - 3 Way to write FALL BACK Method */ 
		
		/*@HystrixCommand(fallbackMethod = "defaultgetUserName")
		public String getStudentName() {
			logger.info("***START-:::::-getName-:::::");
			String myName = "API POTHI ";
			throw new RuntimeException("getName Exception");
			// logger.info("***END-:::::-getName-:::::");
			// return myName;
		}
	
		@HystrixCommand(fallbackMethod = "defaultgetUserNameSecond")
		private String defaultgetUserName() {
			logger.info("***START-:::::-defaultgetName-:::::");
			String myName = "MOCK-API POTHI ";
			//throw new RuntimeException("getName Exception");
			logger.info("***END-:::::-defaultgetName-:::::");
			return myName;
		}
		
		@HystrixCommand()
		private String defaultgetUserNameSecond() {
			logger.info("***START-:::::-defaultgetUserNameSecond-:::::");
			String myName = "SECOND-MOCK-API POTHI ";
			logger.info("***END-:::::-defaultgetUserNameSecond-:::::");
			return myName;
		}*/
	
	/*END - 3 Way to write FALL BACK Method */
		
		
	/*START - 4 Way to write FALL BACK Method */ 
		
		@HystrixCommand(fallbackMethod = "defaultgetUserName")
		public String getStudentName() {
			logger.info("***START-:::::-getName-:::::");
			String myName = "API POTHI ";
			throw new RuntimeException("getName Exception");
			// logger.info("***END-:::::-getName-:::::");
			// return myName;
		}
	
		@HystrixCommand(fallbackMethod = "defaultgetUserNameSecond")
		private String defaultgetUserName() {
			logger.info("***START-:::::-defaultgetName-:::::");
			String myName = "MOCK-API POTHI ";
			throw new RuntimeException("getName Exception");
			//logger.info("***END-:::::-defaultgetName-:::::");
			//return myName;
		}
		
		@HystrixCommand(fallbackMethod = "defaultgetUserNameThird")
		private String defaultgetUserNameSecond() {
			logger.info("***START-:::::-defaultgetUserNameSecond-:::::");
			String myName = "SECOND-MOCK-API POTHI ";
			throw new RuntimeException("getName Exception");
			//logger.info("***END-:::::-defaultgetUserNameSecond-:::::");
			//return myName;
		}
	
		@HystrixCommand()
		private String defaultgetUserNameThird() {
			logger.info("***START-:::::-defaultgetUserNameThird-:::::");
			String myName = "THIRD-MOCK-API POTHI ";
			logger.info("***END-:::::-defaultgetUserNameThird-:::::");
			return myName;
		}

	/*END - 4 Way to write FALL BACK Method */
		
		
}
