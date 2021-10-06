/**
 * 
 */
package com.restexample.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.restexample.springboot.model.User;
import com.restexample.springboot.service.UserService;
import com.restexample.springboot.util.CustomErrorType;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ramesh_Mamidala
 *
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class RestApiController {

	@Autowired
	UserService userService; // Service which will do all data retrieval/manipulation work

	/**
	 * @return retrieve all the users
	 */
	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		log.info("Getting list of all the users::::");
		List<User> userList = userService.findAllUsers();
		if (userList.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}

	/**
	 * @param id
	 * @return retrieve single user
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable("id") long id) {
		log.info("Fetching the user with id {}", id);
		User user = userService.findById(id);
		if (user == null) {
			log.error("User with id {} not found", id);
			return new ResponseEntity<Object>(new CustomErrorType("User with id " + id + "not found"),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}

	/**
	 * @param user
	 * @param ucBuilder
	 * @return Created user
	 */
	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
		log.info("Creating user : {}", user);
		if (userService.isUserExist(user)) {
			log.error("Unable to create. A user with name {} already exist", user.getName());
			return new ResponseEntity<Object>(
					new CustomErrorType("Unable to create. A user with name " + user.getName() + "already exist."),
					HttpStatus.CONFLICT);
		}
		userService.saveUser(user);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<String>(header, HttpStatus.CREATED);
	}

	/**
	 * @param id
	 * @param user
	 * @return Updates  user
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable long id, @RequestBody User user) {
		log.info("Updating User with id {}", id);
		User currentUser = userService.findById(id);
		if (currentUser == null) {
			log.error("Unable to update. User with id {} not found.", id);
			return new ResponseEntity<Object>(
					new CustomErrorType("Unable to update. User with id " + id + "not found."), HttpStatus.NOT_FOUND);
		}
		currentUser.setName(user.getName());
		currentUser.setAge(user.getAge());
		currentUser.setSalary(user.getSalary());

		userService.updateUser(currentUser);
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}

	/**
	 * @param id
	 * @return Deleted user
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable long id) {
		log.info("Fetching & Deleting User with id {}", id);
		User user = userService.findById(id);
		if (user == null) {
			log.error("Unable to delete. User with id {}", id);
			return new ResponseEntity<Object>(new CustomErrorType("Unable to delete.User with id " + id + "not found."),
					HttpStatus.NOT_FOUND);
		}
		userService.deleteUserById(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	/**
	 * @return
	 */
	@RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUsers() {
		log.info("Deleting all users");
		userService.deleteAllUsers();
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

}
