package com.bit.day05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//String을 리턴하는 방법
@Controller
@RequestMapping("/test")
//@RequestMapping("/test")//클래스에 붙은 RequestMapping은 namespace의 역할을 함
public class Ex04Controller {
	
	@RequestMapping(value = "/ex04", method = RequestMethod.GET)	//메소드에 RequestMapping붙이는건 필수 클래스는 안해도 됨!
	public String ex04() {											//컨트롤러 호출하는 방식 지정가능
		return "ex04";
	}
	
	@RequestMapping(value = "/ex05",method = RequestMethod.POST)	//하나의 컨트롤러 클래스에 다양한 메소드 들어올 수 있고
	public String ex05() {											//그 메소드들 다 RequestMapping 가능
		return "ex05";
	}
}
