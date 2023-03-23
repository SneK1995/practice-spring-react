package com.springpractice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springpractice.entities.TestUser;

public interface TestUserRepository extends JpaRepository<TestUser, Integer> {

	@Query(value = "select * from testuser", nativeQuery = true)
	List<TestUser> selectAllUsers();
}
