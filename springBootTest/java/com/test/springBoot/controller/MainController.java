package com.test.springBoot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.springBoot.dao.MainDAO;
import com.test.springBoot.dao.Member2DAO;
import com.test.springBoot.service.Member2Service;
import com.test.springBoot.vo.Member2VO;
import com.test.springBoot.vo.MemberVO;
import com.test.springBoot.vo.TestVO;

@Controller
public class MainController {
	@Autowired
	private MainDAO dao;
	
	@Autowired
	private Member2DAO dao2;
	
	@Autowired
	private Member2Service member2Service; 
	
	private Logger log = LoggerFactory.getLogger(MainController.class);
	
	//전체검색
	@GetMapping("/members")
	public @ResponseBody List<Member2VO> selectListMembers() throws Exception {
		List<Member2VO> allMembers = member2Service.selectAllMembers();
		log.info(allMembers.toString());
		return allMembers;
	}
	//아이디 검색해서 뽑아오기
	@ResponseBody
	@RequestMapping("/members/{id}")
	public Member2VO findById(@PathVariable String id) throws Exception {
		log.info(member2Service.findId(id).toString());
		//return dao2.findId(id);
		return member2Service.findId(id);
	}
	//post 아이디 입력
	@ResponseBody
	@PostMapping("/members")
	public void insertMember(@RequestBody Member2VO vo) throws Exception {
		member2Service.insertMember(vo);
	}
	
	
	@ResponseBody
	@GetMapping("/member")
	public List<MemberVO> member()  throws Exception{
		
//		MemberVO memberVo= new MemberVO();
//		
//		memberVo.setId("아이디");
//		memberVo.setPw("비밀번호");
//		memberVo.setName("이름");
//		memberVo.setEmail("이메일");
//		memberVo.setTel("번호");
//		memberVo.setAuthor(1);
//		
//		ObjectMapper mapper = new ObjectMapper();
//		
//		String memberVO1 = mapper.writeValueAsString(memberVo);
//		
//		log.info(memberVO1);
		
//		return memberVo;
		return dao.findAll();
	}
	@PostMapping("/member")
	@ResponseBody
	public void abc(@RequestBody MemberVO memberVO) throws Exception {
		log.info(memberVO.toString());
	}
	//특정 값을 받아와서 넣어줄 때 사용 예)select id
	@ResponseBody
	@RequestMapping("/member/{id}")
	public MemberVO findMemberById(@PathVariable String id)  throws Exception{
		return dao.findById(id);
	}
	
	
	
	
	//test
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
	
}
