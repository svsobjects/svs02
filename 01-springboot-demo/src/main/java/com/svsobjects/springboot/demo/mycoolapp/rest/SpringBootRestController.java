package com.svsobjects.springboot.demo.mycoolapp.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootRestController {

	public SpringBootRestController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/")
	public String getMessage()
	{
		return "Welcome to SVSObjects - "+(new Date()).toString();
	}
}
