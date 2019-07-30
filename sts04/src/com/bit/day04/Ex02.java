package com.bit.day04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.modul.Module1;
import com.bit.day04.modul.Module2;
import com.bit.day04.modul.Module3;

public class Ex02 {

	public static void main(String[] args) {
		//IoC ����� 
		//����ϴ� �ʿ��� ����
		
//		Module3 module=new Module3();		
//		//��ü������ ���� module setting
//		module.setModule(new Module2());
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Module3 mod=(Module3) context.getBean("mod");
		mod.func();
	}

}
