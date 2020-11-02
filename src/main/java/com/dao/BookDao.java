package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Book;

public interface BookDao {
	/**

	 * ͨ��ID��ѯ����ͼ��

	 *

	 * @param id

	 * @return

	 */

	 Book queryById(long id);
	 
	 List<Book> queryBooks();
	 void insertBook(Book book);

	 

	 /**

	 * ��ѯ����ͼ��

	 *

	 * @param offset ��ѯ��ʼλ��

	 * @param limit ��ѯ����

	 * @return

	 */

	 List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	 

	 /**

	 * ���ٹݲ�����

	 *

	 * @param bookId

	 * @return ���Ӱ����������>1����ʾ���µļ�¼����

	 */

	 int reduceNumber(long bookId);
}