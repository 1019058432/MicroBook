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
	/* @param offset ��ѯ��ʼλ��

	 * @param limit ��ѯ����

	 * @return

	 */

}
