package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Book;
import com.entity.BookS;
import com.service.BookSService;
import com.service.BookService;

@Controller
@RequestMapping("/booknameAndurl")
public class BookSController {
	@Autowired
	private BookSService booksService;
	@RequestMapping("/getBookName")
	public String getBookNameByurl(Map<String,Object> map) {
		String bookname =null;
		String bookName = booksService.queryBookNameBybookname(bookname);
		System.out.print(bookName);
		map.put("bookName", bookName);
		return "oneBook";
	}
	@RequestMapping("/getBookurl")
	public String getBookNameByname(Map<String,Object> map) {
		String bookurl =null;
		String bookName = booksService.queryBookNameBybookname(bookurl);
		System.out.print(bookName);
		map.put("bookName", bookName);
		return "oneBook";
	}
	
	@RequestMapping("/addBookurl")
	public String handerBookurl(BookS books) {
		booksService.addOneBook(books);
		return "oneBook";
	}

}
