package com.steins.service;

import com.steins.dao.BaseTest;
import com.steins.dao.UserDao;
import com.steins.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceImplTest extends BaseTest {
	@Autowired
	private UserService userService;
	@Test
	public void getUser() {
		User u =new User();
		String username="1111";
		String password="1111";
		u.setUsername(username);
		u.setPassword(password);
		System.out.println(userService.getUser(u));
		
	}
}