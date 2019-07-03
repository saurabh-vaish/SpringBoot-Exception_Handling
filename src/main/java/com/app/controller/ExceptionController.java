package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.exception.NoBookFoundException;

@Controller
@ControllerAdvice
public class ExceptionController {

	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Model map) {
		
		map.addAttribute("error","Some Porblem occur  , please try after some time, From exception controller");
		
		return "errorPage";
	}

	
	// handling ArithmeticException
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleArithmeticException(Model map) {
		
		map.addAttribute("error","Arithmetic error occur , please try after some time, from exception controller");
		
		return "errorPage";
	}
	
	
	// handling userDefined Exception
	@ExceptionHandler(value=NoBookFoundException.class)
	public String handleNoBookFoundException(Model map) {

		map.addAttribute("error","book id does not exist, from exception controller");

		return "errorPage";
	}
	
}
