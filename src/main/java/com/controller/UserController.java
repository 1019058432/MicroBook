package com.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userServivce;

	// ��������loginҳ��

	// ���ύ������·��
	@RequestMapping("/checkLogin")
	public String login(@Param("name") String name, @Param("password") String password, Model model) {
		User user = userServivce.checkUser(name, password);
		if (name == null || "".equals(name)) { // û����������
			System.out.print("����������");
			return "index";
		} else if (user == null || "".trim().equals(user)) { // ��������������������
			System.out.print("�˻������ڣ�����ע��");
			return "index";
		} else if (user != null & (password == null || "".equals(password))) { // ������ȷ����û����������
			System.out.print("����������");
			return "index";
		} else if (user != null & !(user.getPassword().equals(password))) { // ������ȷ���������룬�����������
			System.out.print("�������");
			return "index";
		} else if (user != null & user.getPassword().equals(password)) { // �����������ȷ
			return "LoveBook";
		}
		return "LoveBook";
	}

}
