package com.bit.day04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.modul.Module;
import com.bit.day04.modul.Module1;
import com.bit.day04.modul.Module2;

public class Ex01 {

	public static void main(String[] args) {
		//spring-context ���̺귯�� �ø��� ������ Ŭ����
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//������ bean�� �ҷ��� �� �ִ�. getBean����
		Module mod=(Module) context.getBean("module");
		System.out.println(mod.getMsg());
		
	}

}
