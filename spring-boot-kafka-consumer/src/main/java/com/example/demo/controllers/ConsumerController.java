package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;
	
	@GetMapping("/")
	@ResponseBody String index() {
		consumerService.consume();
		return "";
		
	}
}
