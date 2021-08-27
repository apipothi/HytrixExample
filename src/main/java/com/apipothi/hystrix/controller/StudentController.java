package com.apipothi.hystrix.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apipothi.hystrix.service.EmailSerevice;
import com.apipothi.hystrix.service.StudentSerevice;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Web Site  : http://apipothi.com/
 * Play List : MICROSERVICE-SPRINGBOOT
 * JAVA      : 1.8
*/

@RestController
public class StudentController {

	@Autowired
	StudentSerevice studentService;

	@Autowired
	EmailSerevice emailSerevice;

	@GetMapping("/getStudentName")
	public String getStudentName() {
		return studentService.getStudentName();
	}

	@GetMapping("/getFirstName")
	public String getFirstEmail() {
		//No Argument
		return emailSerevice.getFirstName();
	}

	@GetMapping("/getMiddleName")
	public String getMiddleEmail() {
		// String as Argument
		String myEmailService = "My Email Service ";
		return emailSerevice.getMiddleName(myEmailService);
	}

	@GetMapping("/getLastName")
	public String getLastEmail() {
		// Object as Argument
		List<String> emailList= new ArrayList<String>();
		emailList.add("A");
		emailList.add("B");
		emailList.add("C");
		emailList.add("D");
		return emailSerevice.getLastName(emailList);
	}
}
//https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-javanica#configuration
//https://cloud.spring.io/spring-cloud-netflix/reference/html/
//https://github.com/Netflix/Hystrix
