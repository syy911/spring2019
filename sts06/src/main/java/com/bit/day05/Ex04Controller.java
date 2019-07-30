package com.bit.day05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//String�� �����ϴ� ���
@Controller
@RequestMapping("/test")
//@RequestMapping("/test")//Ŭ������ ���� RequestMapping�� namespace�� ������ ��
public class Ex04Controller {
	
	@RequestMapping(value = "/ex04", method = RequestMethod.GET)	//�޼ҵ忡 RequestMapping���̴°� �ʼ� Ŭ������ ���ص� ��!
	public String ex04() {											//��Ʈ�ѷ� ȣ���ϴ� ��� ��������
		return "ex04";
	}
	
	@RequestMapping(value = "/ex05",method = RequestMethod.POST)	//�ϳ��� ��Ʈ�ѷ� Ŭ������ �پ��� �޼ҵ� ���� �� �ְ�
	public String ex05() {											//�� �޼ҵ�� �� RequestMapping ����
		return "ex05";
	}
}
