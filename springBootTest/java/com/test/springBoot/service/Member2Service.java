package com.test.springBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springBoot.dao.Member2DAO;
import com.test.springBoot.vo.Member2VO;

@Service
public class Member2Service {

	@Autowired
	Member2DAO member2Dao;
	//전체보기
	public List<Member2VO> selectAllMembers(){
		return member2Dao.selectAllMembers();
	}
	//id검색해서 보기
	public Member2VO findId(String id) throws Exception{
		return member2Dao.findId(id);
	}
	//insert
	public void insertMember(Member2VO vo) {
		member2Dao.insertMember(vo);
	}
}
