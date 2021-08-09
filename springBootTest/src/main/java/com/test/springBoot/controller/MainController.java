package com.test.springBoot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.springBoot.vo.MemberVO;
import com.test.springBoot.vo.TestVO;

@Controller
public class MainController {

	private Logger log = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/")
	public String mainPage() {
		
		return "index";
	}
	@RequestMapping("/vo")
	@ResponseBody
	public TestVO test(TestVO id) {
		
		return id;
	}
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/member")
	public MemberVO member(MemberVO vo)  throws Exception{
		
		MemberVO memberVo= new MemberVO();
		
		memberVo.setId("1");
		memberVo.setPw("2");
		memberVo.setName("3");
		memberVo.setEmail("4");
		memberVo.setTel("5");
		memberVo.setAuthor(6);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String memberVO1 = mapper.writeValueAsString(memberVo);
		
		log.info(memberVO1);
		
		return memberVo;
	}
}
