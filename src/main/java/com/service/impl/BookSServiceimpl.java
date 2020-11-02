package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookDao;
import com.dao.BookSDao;
import com.entity.Book;
import com.entity.BookS;
import com.service.BookSService;
import com.service.BookService;

@Service
public class BookSServiceimpl implements BookSService {
	@Autowired
	private BookSDao booksDao;

	@Override
	public String queryBookNameBybookname(String bookname) {
		BookS books = booksDao.queryBybookname(bookname);
		if(books!=null) {
		   return books.getBookname();
		}else {
			return null;
		}
		//return book!=null?book.getName():null;
	}
	

	@Override
	public String queryBookNameBytexturl(String texturl) {
		BookS books = booksDao.queryBybookurl(texturl);
		if(books!=null) {
		   return books.getBookname();
		}else {
			return null;
		}
		//return book!=null?book.getName():null;
	}

	@Override
	public List<BookS> queryAllBooks() {
		return booksDao.queryBooks();
	}

	@Override
	public void addOneBook(BookS books) {
		booksDao.insertBook(books);
	}

	
}
