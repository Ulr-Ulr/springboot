package com.test.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.springBoot.vo.testVO;

@Controller
public class mainController {

	@RequestMapping("/")
	public String mainPage() {
		return "index";
	}
	@RequestMapping("/vo")
	@ResponseBody
	public testVO test(testVO id) {
		
		return id;
	}
}
