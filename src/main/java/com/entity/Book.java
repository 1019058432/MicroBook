package com.entity;

public class Book {
	private int bookId;// ͼ��ID
	private String name;// ͼ������
	private int number;// �ݲ�����
	public long getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		String str = this.bookId+","+this.name+","+this.number;
		System.out.println(str);
		return str;
	}
	
}
