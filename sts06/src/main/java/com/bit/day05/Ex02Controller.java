package com.bit.day05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//필요한 인자 맘대로 받을 수 있음 순서도 내맘대로~!
@Controller
public class Ex02Controller {
	
	@RequestMapping("/ex02")
	public String mapping(Model model,HttpServletRequest req,HttpServletResponse resp) {
		return "ex02";
	}
}
