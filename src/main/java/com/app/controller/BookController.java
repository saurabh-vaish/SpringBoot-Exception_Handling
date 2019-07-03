package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookController {

	@RequestMapping("/reg")
	public String showReg(Model map) {
		map.addAttribute("msg","hello from book controller");
		
		// creating a exception 
		
		String s = null;
		System.out.println(s.length());   //  Here NullPointerException Occur
		
		int a =10;
		System.out.println(a/0); // AirthmeticException occur
		
		return "register";
	}
	
	/*
	
	// handling NullPointerException
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Model map) {
		
		map.addAttribute("error","Some Porblem occur  , please try after some time");
		
		return "errorPage";
	}

	
	// handling ArithmeticException
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleArithmeticException(Model map) {
		
		map.addAttribute("error","Arithmetic error occur , please try after some time");
		
		return "errorPage";
	}
	
	*/
}
