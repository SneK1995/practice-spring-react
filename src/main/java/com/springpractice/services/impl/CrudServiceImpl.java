package com.springpractice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.springpractice.entities.TestUser;
import com.springpractice.repositories.TestUserRepository;
import com.springpractice.services.CrudService;

@Service
public class CrudServiceImpl implements CrudService {

	@Autowired
	TestUserRepository testUserRepository;
	
	@Override
	public TestUser getUserById(Integer id) {
		
		Optional<TestUser> user = testUserRepository.findById(id);
		return !user.isEmpty() ? user.get() : null;
	}

	@Override
	public List<TestUser> getAllUsers() {
		
		//List<TestUser> users = testUserRepository.findAll();
		List<TestUser> users = testUserRepository.selectAllUsers();
		return !ObjectUtils.isEmpty(users) ? users : null;
	}

}
