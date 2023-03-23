package com.springpractice.services;

import java.util.List;

import com.springpractice.entities.TestUser;

public interface CrudService {

	TestUser getUserById(Integer id);
	List<TestUser> getAllUsers();
}
