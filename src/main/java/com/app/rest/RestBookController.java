package com.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Book;
import com.app.service.BookService;

@RestController
@RequestMapping("/rest")
public class RestBookController {

	
	@Autowired
	private BookService service;
	
	
	@GetMapping(value = "/reg",produces = "application/json")
	public ResponseEntity<String> showReg() {
		
		ResponseEntity<String> res =null;
		
		res = new ResponseEntity<String>("hii from rest controller",HttpStatus.OK);
		
		// creating a exception 
		
		String s = null;
	//	System.out.println(s.length());   //  Here NullPointerException Occur
		
		int a =10;
		System.out.println(a/0); // AirthmeticException occur
		
		return res;
	}
	
	
	@GetMapping(value = "/get",produces = "application/json")
	public Book getBook(@RequestParam Integer id)
	{
		return service.getBookById(id);
	}
	
}
