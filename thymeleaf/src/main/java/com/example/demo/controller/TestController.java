package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.TestService;

@Controller
public class TestController {

	@Resource
	TestService testService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		model.addAttribute("list", list);
		
		String str = testService.getTest();
		
		model.addAttribute("dbtest", str);
		
		return "test";
	}
	
	@RequestMapping(value = "/ajaxCallTest1", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> ajaxCallTest() {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		map.put("list", list);
		
		return map;
	}
	
	@RequestMapping(value = "/ajaxCallTest2", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> ajaxCallTest2() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		List<String> list = new ArrayList<>();
		
		list.add("B");
		list.add("L");
		list.add("Y");
		list.add("C");
		
		map.put("list", list);
		
		return map;
	}
}
