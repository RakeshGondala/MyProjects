package com.dao;

import java.util.List;

import Entity.User;

public interface UserDao {

	public int addUser(User user);
	public List <User> getUsers();
}
