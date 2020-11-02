package ssm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/LoginFace")
public class LoginFace {
	 /**
     * 1. 使用RequestMapping注解来映射请求的URL，写在方法上面，一个请求对应一个方法
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 会做如下解析
     * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
     * "/WEB-INF/views/success.jsp"
     *在浏览器访问.jsp文件时需要在根目录条件下加类映射路径+方法映射路径
     */

     @RequestMapping("/login")
	public String Login(HttpServletRequest re ,HttpServletResponse rp) {
		ModelAndView mv=new ModelAndView();
		String s=re.getParameter("name");
		System.out.print(s);
		return "login";///WEB-INF/jsp/login.jsp
	}
	
}
