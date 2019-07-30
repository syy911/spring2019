package com.bit.day05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Form01Controller {

	@RequestMapping("/ex09")
	public String ex09() {
		return "form01";
	}
	
	@RequestMapping("/ex10")	//넘어오는 파라미터를 받는 방법
	public void ex10(Model model,@RequestParam int num
								,@RequestParam String msg) {
		model.addAttribute("num",num);
		model.addAttribute("msg",msg);
	}
}
