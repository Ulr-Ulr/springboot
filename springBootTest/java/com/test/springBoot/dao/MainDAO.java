package com.test.springBoot.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.test.springBoot.vo.MemberVO;

@Repository
public class MainDAO {
	private static final Map<String, MemberVO> inMemory = new HashMap<>();
	
	//get findAll findById
	public List<MemberVO> findAll (){
		MemberVO memberVo= new MemberVO();
		
		memberVo.setId("아이디");
		memberVo.setPw("비밀번호");
		memberVo.setName("이름");
		memberVo.setEmail("이메일");
		memberVo.setTel("번호");
		memberVo.setAuthor(1);
		inMemory.put(memberVo.getId(), memberVo);
		return null;
	}
	
	public MemberVO findById(String id) {
		return inMemory.get(id);
	}
	

}
