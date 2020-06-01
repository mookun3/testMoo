package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CommonMapper;
import com.example.demo.service.TestService;

@Service
public class TestServceImpl implements TestService {
	
	@Autowired
	private CommonMapper testMapper;

	/*
	@Resource
	TestDao testDao;
	*/
	@Override
	public String getTest() {
		return testMapper.getCommon();
	}
	
}
