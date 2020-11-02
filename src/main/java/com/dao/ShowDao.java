package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.BookNames;
import com.entity.Chapter;
import com.entity.Show;

public interface ShowDao {

	    

	 String queryTextFileBychapter(String chapter);
	 List<Chapter> queryByBookName(String bookname);
	 List<BookNames> queryBookNames();
	
	 
	 
	 void insertBook(Show show);

	 
	 /**
	 * 查询所有图书
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 List<Chapter> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	 int Number();*/

	
	
}
