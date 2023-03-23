package com.springpractice.restapis;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springpractice.entities.TestUser;
import com.springpractice.services.CrudService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DataController {

	@Autowired
	CrudService crudService;
	
	@GetMapping(path = "/getDemoResponse")
	Map<String, Object> getDemoResponse() {
		
		Map<String, Object> response = new ConcurrentHashMap<>();
		response.put("result", Boolean.TRUE);
		log.info("response = {}", response);
		return response;
	}
	
	@GetMapping(path = "/getUserById")
	TestUser getUserById(@RequestParam(name = "id") Integer id) {
		
		log.info("id received = {}", id);
		return crudService.getUserById(id);
	}
	
	@GetMapping(path = "/getAllUsers")
	List<TestUser> getAllUsers() {
		
		log.info("Inside getAllUsers method");
		List<TestUser> response = crudService.getAllUsers();
		log.info("API response ==> {}", response.toString());
		return response;
	}
}
