package com.test.springBoot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		
		memberVo.setId("아이디");
		memberVo.setPw("비밀번호");
		memberVo.setName("이름");
		memberVo.setEmail("이메일");
		memberVo.setTel("번호");
		memberVo.setAuthor(1);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String memberVO1 = mapper.writeValueAsString(memberVo);
		
		log.info(memberVO1);
		
		return memberVo;
	}

}
