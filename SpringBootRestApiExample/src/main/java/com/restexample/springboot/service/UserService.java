/**
 * 
 */
package com.restexample.springboot.service;

import java.util.List;

import com.restexample.springboot.model.User;

/**
 * @author Ramesh_Mamidala
 *
 */
public interface UserService {
	User findById(long id);
	User findByName(String name);
	void saveUser(User user);
	void updateUser(User user);
	void deleteUserById(long id);
	void deleteAllUsers();
	List<User> findAllUsers();
	boolean isUserExist(User user);
}
