package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/mac")
	public ModelAndView mac() {
		ModelAndView mv =new ModelAndView();
		mv.addObject("msg", "Hello Mac");
		mv.setViewName("/WEB-INF/mac.jsp");
		return mv;
	}
}
