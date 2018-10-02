package com.acheron.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/appStatus")
	public String appStatus() {
		return "Up";
	}
}
