/**
 * 
 */
package com.restexample.springboot.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.restexample.springboot.model.User;
import com.restexample.springboot.service.UserService;

/**
 * @author Ramesh_Mamidala
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	private static final AtomicLong counter = new AtomicLong();
	private static List<User> users;
	
	static {
		users = populateDummyUsers();
	}
	
	private static List<User> populateDummyUsers() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(counter.incrementAndGet(),"Sam", 30, 70000));
		userList.add(new User(counter.incrementAndGet(),"Ram", 32, 90000));
		userList.add(new User(counter.incrementAndGet(),"Tom", 45, 50000));
		userList.add(new User(counter.incrementAndGet(),"Rot", 50, 40000));
		return userList;
	}

	@Override
	public User findById(long id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
			
		}
		return null;
	}

	@Override
	public User findByName(String name) {
		for(User user: users) {
			if(user.getName().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
	}

	@Override
	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
		
	}

	@Override
	public void deleteUserById(long id) {
		for(Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
			}
		}
	}

	@Override
	public void deleteAllUsers() {
		users.clear();
	}

	@Override
	public List<User> findAllUsers() {
		return users;
	}

	@Override
	public boolean isUserExist(User user) {
		return findByName(user.getName()) != null;
	}

}
