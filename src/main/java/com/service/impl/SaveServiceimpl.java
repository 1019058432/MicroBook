package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SaveDao;
import com.entity.SaveBook;
import com.service.SaveService;
@Service
public class SaveServiceimpl implements SaveService {
	@Autowired
	private SaveDao saveDao;

	

	@Override
	public void saveOneBook(SaveBook sa) {
		saveDao.saveBook(sa);
		
	}
	


}
