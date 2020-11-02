package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ShowDao;
import com.entity.BookNames;
import com.entity.Chapter;
import com.entity.Show;
import com.service.ShowService;
@Service
public class ShowServiceimpl implements ShowService {
	@Autowired
	private ShowDao showDao;

	@Override
	public String queryTextFileByChapter(String bookname) {//չʾС˵ĳһ�½ڵ�����
		String sh = showDao.queryTextFileBychapter(bookname);
		if(bookname!=null) {
			   return sh;
			}else {
				return null;
			}
	}

	@Override
	public List<Chapter> queryAllChapterByBookName(String bookname) {//չʾһ��С˵�������½�
		return showDao.queryByBookName(bookname);
	}

	@Override
	public List<BookNames> queryAllBooks() {//չʾ����С˵����
		return showDao.queryBookNames();
	}

	
	@Override
	public void showOneBook(Show sh) {
		showDao.insertBook(sh);
	}



	
	
	
	    
	 
	
}
