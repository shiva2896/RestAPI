package com.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.dao.Request;
import com.sample.dao.Response;

@RestController
@RequestMapping("/SimplePostAPI")
public class Controller {

	
	@PostMapping(value = "/SimpleService", consumes = MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<?>  simpleResponse(@RequestBody Request requestJson) {
		Response response = new Response();
		response.setName(requestJson.getName());
		response.setStatus("SUCESS");
	  return new  ResponseEntity<Response>(response,HttpStatus.OK) ;
	  
	  }
	 
}
