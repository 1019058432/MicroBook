package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.SaveBook;
import com.service.SaveService;

@Controller
@RequestMapping("/save")
public class SaveContorller {
	@Autowired
	private SaveService saveService;

	
	@RequestMapping("/savebook")
	public String handerBookInfo(SaveBook save) {
		//saveService.saveOneBook(save);
		return "succes";
	}

}
