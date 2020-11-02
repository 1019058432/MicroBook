package com.service;

import java.util.List;

import com.entity.Book;

public interface BookService {
	public String queryBookNameById(long bookId);
    public List<Book> queryAllBooks();
    public void addOneBook(Book book);
}
