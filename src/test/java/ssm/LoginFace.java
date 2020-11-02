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
     * 1. ʹ��RequestMappingע����ӳ�������URL��д�ڷ������棬һ�������Ӧһ������
     * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ, �������½���
     * ͨ��prefix+returnVal+suffix �����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ���ת������
     * "/WEB-INF/views/success.jsp"
     *�����������.jsp�ļ�ʱ��Ҫ�ڸ�Ŀ¼�����¼���ӳ��·��+����ӳ��·��
     */

     @RequestMapping("/login")
	public String Login(HttpServletRequest re ,HttpServletResponse rp) {
		ModelAndView mv=new ModelAndView();
		String s=re.getParameter("name");
		System.out.print(s);
		return "login";///WEB-INF/jsp/login.jsp
	}
	
}
