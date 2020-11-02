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
	public String queryTextFileByChapter(String bookname) {//展示小说某一章节的内容
		String sh = showDao.queryTextFileBychapter(bookname);
		if(bookname!=null) {
			   return sh;
			}else {
				return null;
			}
	}

	@Override
	public List<Chapter> queryAllChapterByBookName(String bookname) {//展示一本小说的所有章节
		return showDao.queryByBookName(bookname);
	}

	@Override
	public List<BookNames> queryAllBooks() {//展示所有小说书名
		return showDao.queryBookNames();
	}

	
	@Override
	public void showOneBook(Show sh) {
		showDao.insertBook(sh);
	}



	
	
	
	    
	 
	
}
