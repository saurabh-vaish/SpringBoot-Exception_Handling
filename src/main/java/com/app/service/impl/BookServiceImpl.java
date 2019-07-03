package com.app.service.impl;

import org.springframework.stereotype.Service;

import com.app.exception.NoBookFoundException;
import com.app.model.Book;
import com.app.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	
	public Book getBookById(Integer id) {
		
		if(id==101)
		{
			return new Book(10,"AA","B-10",100.00);
		}
		else
		{
			throw new NoBookFoundException("book id not exist");
		}
		
	}

	
	
	
}
