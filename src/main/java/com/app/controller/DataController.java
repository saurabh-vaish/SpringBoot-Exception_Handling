package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.BookService;

@Controller
public class DataController {

	
	@Autowired
	private BookService service;
	
	
	@RequestMapping("/get")
	public String getBook(@RequestParam Integer id,Model map)
	{
		map.addAttribute("data",service.getBookById(id));
		
		return "register";
	}
	
}
