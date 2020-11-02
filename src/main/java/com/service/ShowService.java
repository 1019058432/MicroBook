package com.service;

import java.util.List;

import com.entity.BookNames;
import com.entity.Chapter;
import com.entity.Show;

public interface ShowService {
	public String queryTextFileByChapter(String chapter);
	
	public  List<Chapter> queryAllChapterByBookName(String bookname);
	
    public List<BookNames> queryAllBooks();//
   
    public void showOneBook(Show sh);
	

    

	 
	
}
