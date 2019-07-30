package com.bit.day04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.modul.Module;
import com.bit.day04.modul.Module1;
import com.bit.day04.modul.Module2;

public class Ex01 {

	public static void main(String[] args) {
		//spring-context 라이브러리 올리면 나오는 클래스
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//정의한 bean을 불러올 수 있다. getBean으로
		Module mod=(Module) context.getBean("module");
		System.out.println(mod.getMsg());
		
	}

}
