/**
 * 
 */
package com.practice.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ramesh_Mamidala
 *
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping("/")
	String hello() {
		LOG.info("::::::Hey I am here in method of hello::::");
		return "Hello World! Welcome to Spring Boot::::";
	}
}
