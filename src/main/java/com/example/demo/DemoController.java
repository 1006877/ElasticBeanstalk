package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DemoController {

	@RequestMapping(value = "/getDemo", method = RequestMethod.GET)
	public String getdemo() {
		return "home";

	}

	@RequestMapping(value = "/getDemoString", method = RequestMethod.GET)
	public @ResponseBody String getDemoString() {
		return "demoString";

	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String getElasticString() {
		return "Welcome to Elastic Beanstalk";

	}
}