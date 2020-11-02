package com.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.BookDao;
import com.service.SaveService;
import com.service.BookSService;
import com.service.impl.SaveServiceimpl;
import com.entity.BookS;
import com.entity.Chapter;
import com.entity.SaveBook;

import org.apache.ibatis.annotations.Param;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/links")
public class JsoupController {
	@Autowired
	private  SaveService saService;
	@Autowired
	private BookSService booksService;
	//LoveBookjsp页面操作
		public  void getchaters(String url){
			SaveBook sa= new SaveBook();
			Document doc = null;
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Elements h1_els = doc.getElementsByTag("h1");
			Element h1_el = h1_els.get(0);
			String title = h1_el.text();
			Elements h1_els1 = doc.getElementsByTag("strong");
			Element h1_el1 = h1_els1.get(1);
			String title1 = h1_el1.text();
			sa.setBookname(title1);
			sa.setChapter(title);
			Element  content_el = doc.getElementById("content");
			String content = content_el.text();
			sa.setTextFile(content);    
			saService.saveOneBook(sa);
			
			
		}
		
		public   List<String> getUrlsByDirectories(String url){//获取url,bookname去除静态
			Document doc = null;
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Elements dd_els = doc.getElementsByTag("dd");
			Elements h2_els = doc.getElementsByTag("h2");//书名
			Element h2_el = h2_els.get(0);
			String title2 = h2_el.text();
			System.out.println(title2);
			BookS  bo =new BookS();
			bo.setBookname(title2);
			bo.setTexturl(url);
			handerBookurl(bo);
			List<String> list = new ArrayList<String>();
			for(int i=0;i<dd_els.size();i++) {
				Element dd_el = dd_els.get(i);
				Element a_el = dd_el.child(0);
				String title = a_el.html();
				String chater_url = a_el.attr("abs:href");
				list.add(chater_url);
			}
			return list;
		}
		
		@RequestMapping("/link")
		public  String BookURL(@Param("Links")String Links) throws Exception {
			String url = Links;
			
			List<String> list = getUrlsByDirectories(url);
			for(String str:list) {
				getchaters(str);
			}
			return "showBook";
		}
		@RequestMapping("/addBookurl")
		public void handerBookurl(BookS books) {
			booksService.addOneBook(books);
			//写入书名以及对应的url
		}
		//返回存书界面
		@RequestMapping("/chek")
		public  String chekBook(Map<String, Object> map) throws Exception {
			
			
			return "LoveBook";
		}
	}