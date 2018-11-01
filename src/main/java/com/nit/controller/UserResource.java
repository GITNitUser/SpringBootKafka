package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.User;
import com.nit.producer.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class UserResource {
	@Autowired
	KafkaProducer kafkaProducer;
	
	@GetMapping(value="/getUser/{userId}",produces="application/json")
	public User getUserDetails(@PathVariable("userId") int userId) {
		
		return null;
	}
	
	@PostMapping(value="/saveUser",consumes="application/json")
	public String saveUserDetails(@RequestBody User user) {
		
		String msg=kafkaProducer.producer(user);
		return msg;
	}
	

}
