package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		model.addAttribute("list", list);
		
		return "test";
	}
	
	@RequestMapping(value = "/ajaxCallTest")
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
}
