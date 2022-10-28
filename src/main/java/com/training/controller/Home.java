package com.training.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	@GetMapping("/home")
	public String represent()
	{
		System.out.println("hello");
		return  "from Home Controller";
	}


}




