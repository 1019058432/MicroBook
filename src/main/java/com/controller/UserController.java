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

	// 正常访问login页面

	// 表单提交过来的路径
	@RequestMapping("/checkLogin")
	public String login(@Param("name") String name, @Param("password") String password, Model model) {
		User user = userServivce.checkUser(name, password);
		if (name == null || "".equals(name)) { // 没有输入姓名
			System.out.print("请输入姓名");
			return "index";
		} else if (user == null || "".trim().equals(user)) { // 输入姓名但是姓名错误
			System.out.print("账户不存在，请先注册");
			return "index";
		} else if (user != null & (password == null || "".equals(password))) { // 姓名正确，但没有输入密码
			System.out.print("请输入密码");
			return "index";
		} else if (user != null & !(user.getPassword().equals(password))) { // 姓名正确，输入密码，但是密码错误
			System.out.print("密码错误");
			return "index";
		} else if (user != null & user.getPassword().equals(password)) { // 姓名密码均正确
			return "LoveBook";
		}
		return "LoveBook";
	}

}
