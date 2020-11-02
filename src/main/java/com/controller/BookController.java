package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Book;
import com.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	@RequestMapping("/getBookName")
	public String getBookNameById(Map<String,Object> map) {
		long bookId = 1001;
		String bookName = bookService.queryBookNameById(bookId);
		System.out.print(bookName);
		map.put("bookName", bookName);
		return "oneBook";
	}
	
	@RequestMapping("/handerBookInfo")
	public String handerBookInfo(Book book) {
		bookService.addOneBook(book);
		return "oneBook";
	}

}
