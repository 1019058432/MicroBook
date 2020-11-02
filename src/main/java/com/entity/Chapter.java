package com.entity;

public class Chapter extends Show{

	private String chapter;

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	@Override
	public String toString() {
		return "Chapter [chapter=" + chapter + "]";
	}
	
}
