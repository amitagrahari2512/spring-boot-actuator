package com.learn.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/v1/")
public class ServiceController {
	
	@Autowired
	private List<String> list;
	
	@GetMapping(path = "/lists" , produces = {"application/json"})
	public List<String> getLists()
	{
		return list;
	}
	
}
