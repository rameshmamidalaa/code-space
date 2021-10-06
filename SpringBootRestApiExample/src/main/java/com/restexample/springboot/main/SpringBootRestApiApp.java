/**
 * 
 */
package com.restexample.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ramesh_Mamidala
 *
 *The following are the parameters accepted in the @SpringBootApplication annotation:

	exclude: Exclude the list of classes from the auto configuration.

	excludeNames: Exclude the list of fully qualified class names from the auto configuration. This parameter added since spring boot 1.3.0.

	scanBasePackageClasses: Provide the list of classes that has to be applied for the @ComponentScan.

	scanBasePackages Provide the list of packages that has to be applied for the @ComponentScan. This parameter added since spring boot 1.3.0
	
	Remark: Instead of using @EnableAutoConfiguration, @ComponentScan & @Configuration on a class, you could just use only @SpringBootApplication which is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes.
 */
@SpringBootApplication(scanBasePackages= {"com.restexample.springboot"})
@Slf4j
public class SpringBootRestApiApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("I am in main::::::");
		SpringApplication.run(SpringBootRestApiApp.class, args);

	}

}
