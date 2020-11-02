package com.service;

import java.util.List;


import com.entity.BookS;

public interface BookSService {
	public String queryBookNameBybookname(String bookname);
	public String queryBookNameBytexturl(String texturl);
    public List<BookS> queryAllBooks();
    public void addOneBook(BookS books);
}