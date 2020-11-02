package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookDao;
import com.entity.Book;
import com.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;

	@Override
	public String queryBookNameById(long bookId) {
		Book book = bookDao.queryById(bookId);
		if(book!=null) {
		   return book.getName();
		}else {
			return null;
		}
		//return book!=null?book.getName():null;
	}

	@Override
	public List<Book> queryAllBooks() {
		return bookDao.queryBooks();
	}

	@Override
	public void addOneBook(Book book) {
		bookDao.insertBook(book);
	}
	

}
