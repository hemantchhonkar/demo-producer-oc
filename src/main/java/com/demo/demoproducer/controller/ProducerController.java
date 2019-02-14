package com.demo.demoproducer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demoproducer.bean.Employee;

@RestController
@RequestMapping("/producer")
@CrossOrigin("*")
public class ProducerController {
	

	@GetMapping("/produceEmployee")
	public  List<Employee> produceEmployeeList(){
		return Arrays.asList(new Employee[]{new Employee(1, "Hello There !", "rajesh@gmail.com", 10000000),new Employee(2, "Nitin", "nitin@gmail.com", 123888383)});
	}

	@GetMapping
	public ResponseEntity<Message> message() {
		return ResponseEntity.ok(new Message("Hello this is producer API"));
	}
}


class Message {
	String content;
	Message(String content){
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	Message() {}
}