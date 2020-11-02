package com.entity;

public class BookNames extends Show{

	private String bookname;

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "BookNames [bookname=" + bookname + "]";
	}


	
}
