package com.example.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service1.config.Service1Config;
import com.example.service1.model.Properties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
public class HelloController {
	
	@Autowired
	Service1Config testServiceConfig;

	@GetMapping("hello")
	public String getMessage() {
		return "Hello World";
	}
	@GetMapping("service1/properties")
	public String getProperties() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Properties properties = new Properties(testServiceConfig.getMsg(),testServiceConfig.getVersion());
		return ow.writeValueAsString(properties);
	}
}
