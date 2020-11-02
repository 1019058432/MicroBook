package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Book;
import com.entity.BookS;

public interface BookSDao {
 BookS queryBybookname(String name);
 BookS queryBybookurl(String url);
	 List<BookS> queryBooks();
	 void insertBook(BookS books);
	 List<BookS> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	/* @param offset 查询起始位置

	 * @param limit 查询条数

	 * @return

	 */

}
