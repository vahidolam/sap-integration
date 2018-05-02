package com.olam.fieldstar1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
	
	@GetMapping(value="/locmessage")
	public String message() {
		
		return "i am from location controller";
	}

}
