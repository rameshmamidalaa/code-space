/**
 * 
 */
package com.restexample.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ramesh_Mamidala
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private long id;
	private String name;
	private int age;
	private double salary;	
}
