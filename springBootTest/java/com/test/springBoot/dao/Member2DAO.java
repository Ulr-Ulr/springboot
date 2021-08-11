package com.test.springBoot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.springBoot.vo.Member2VO;

@Mapper
public interface Member2DAO {

	public List<Member2VO> selectAllMembers();
	
	public Member2VO findId(String id);
}
