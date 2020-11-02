package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.BookNames;
import com.entity.Chapter;
import com.entity.Show;
import com.service.ShowService;

@Controller
@RequestMapping("/show")
public class ShowContorller {
	@Autowired
	private ShowService showService;
	
	/*
	 * @RequestMapping(value ="/showe", method = RequestMethod.GET) public String
	 * BookName(Map<String,Object> map,@PathVariable("chap") String chap) throws
	 * UnsupportedEncodingException{ String chapter = chap; //String
	 * bookName=bookname;
	 * 
	 * //map.put("bookName", bookName); List<BookNames> bookNames =
	 * showService.queryAllBooks(); map.put("bookNames", bookNames); return
	 * "showBook"; }
	 */
	//查询小说书名
		@RequestMapping("/showBooks")
		public ModelAndView getBookName(Map<String, Object> map) {
			ModelAndView modelAndView = new ModelAndView();
			List<BookNames> bookNames = showService.queryAllBooks();
			modelAndView.addObject("bookNames", bookNames);
			modelAndView.setViewName("showBook");
			return modelAndView;

		}
		//查询小说章节名
	@RequestMapping("/showBookName")
	public ModelAndView getBookNames(Map<String, Object> map,@RequestParam("board.boFaterId") String bookname) {
		ModelAndView modelAndView = new ModelAndView();
		String bookName=bookname;
		modelAndView.addObject("bookName", bookName);
		List<Chapter> bookNames = showService.queryAllChapterByBookName(bookname);//从书名展示传书名过来
		modelAndView.addObject("bookNames", bookNames);
		modelAndView.setViewName("succes");
		return modelAndView;

	}
	
	
	//查询小说章节内容
	@RequestMapping("/getName")
	public  String Bookchapter(Map<String,Object> map,@RequestParam("board.boFaterId") String cha,@RequestParam("bname") String bookname) throws Exception {
		String chapter = cha;
		String bookName=bookname;
		//System.out.print(bookname);
		map.put("bookName", bookName);
		String bookNames = showService.queryTextFileByChapter(chapter);
		map.put("bookNames", bookNames);
		return "showTextFile";
	}

	@RequestMapping(value ="/showe1a/{chap}", method = RequestMethod.GET)
	public String BookText(Map<String,Object> map,@PathVariable("chap") String chap) throws UnsupportedEncodingException{
		String chapter = chap;
		//String bookName=bookname;
		
		//map.put("bookName", bookName);
		String bookNames = showService.queryTextFileByChapter(toUTF(chapter));
		map.put("bookNames", bookNames);
		return "showTextFile";
	}
	public static final String toUTF(String param) throws UnsupportedEncodingException{
		String newString = new String(param.getBytes("ISO-8859-1"),"UTF-8");//a标签传输汉字使用iso-8859-1编码（默认）
		return newString;
	}

	
}
