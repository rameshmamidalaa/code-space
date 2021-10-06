/**
 * 
 */
package com.practice.springboot.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
@SpringBootApplication(scanBasePackages={"com.practice.springboot"}) //The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes:
/* @EnableAutoConfiguration
 * @ComponentScan("com.practice.springboot")
 * OR JUST USE @SpringBootApplication(scanBasePackages={"com.practice.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined*/
public class SpringBootWebAppplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(SpringBootWebAppplication.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.info("I am in main::::");
		SpringApplication.run(SpringBootWebAppplication.class, args);

	}

}
