package ssm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TestJsoup {
	
	public static void getchaters(String url){
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
		System.out.println(title);
		
		Element  content_el = doc.getElementById("content");
		String content = content_el.text();
		System.out.println(content);
	}
	
	public  static List<String> getUrlsByDirectories(String url){
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements dd_els = doc.getElementsByTag("dd");
		Elements h2_els = doc.getElementsByTag("h2");
		Element h2_el = h2_els.get(0);
		String title2 = h2_el.text();
		System.out.println(title2);
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

	public static void main(String[] args) throws Exception {
		String url = "http://www.shuquge.com/txt/8659/index.html";
		List<String> list = getUrlsByDirectories(url);
		for(String str:list) {
			getchaters(str);
		}
		

	}

}
