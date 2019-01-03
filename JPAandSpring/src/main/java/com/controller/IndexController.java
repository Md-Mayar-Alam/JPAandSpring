package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.repositoryConfig.DatabaseConfiguration;

@Controller
public class IndexController {
	
	@Autowired
	DatabaseConfiguration databaseConfiguration;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String returnIndexPage() {
		System.out.println("Username is "+ databaseConfiguration.username);
		return "index";
	}
}
