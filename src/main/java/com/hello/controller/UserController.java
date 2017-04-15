package com.hello.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.model.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	private static List<User> userlist;
	/*
	 * @ModelAttribute public void userModle(int id,String name,String
	 * password,Model model){ User user = new User(id,name,password);
	 * model.addAttribute("user", user); }
	 * 
	 * @RequestMapping("/login") public String login(Model model){ User user =
	 * (User) model.asMap().get("user"); user.setId(1);
	 * user.setName("username"); user.setPassword("password"); return "result";
	 * }
	 */
	public UserController() {
		super();
		userlist = new ArrayList<User>();
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm(){
		return "registerForm";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,
			@RequestParam("username") String username) {
		User user = new User(loginname,username,password);
		userlist.add(user);
		return "login";
	}
	
	@RequestMapping(value = "/login")
	public String login(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,
			Model model) {
		
		for (User user : userlist) {
			if(user.getLoginname().equals(loginname)&&user.getPassword().equals(password)){
				model.addAttribute("user", user);
				return "welcome";
			}
		}
		return "login";
	}
	
	
}
