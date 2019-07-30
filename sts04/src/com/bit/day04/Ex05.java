package com.bit.day04;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.day04.modul.Module;

public class Ex05 {

	public static void main(String[] args) {
		//classpath로 읽어드릴때 파일명 앞에 classpath:/ 작성.
		String filename="classpath:/applicationContext.xml";
		ApplicationContext ctxt = null;
//		ctxt = new ClassPathXmlApplicationContext(filename);
		
//		String path="C:\\java\\workspace4\\sts04\\src\\";
//		String path="C:\\java\\workspace4\\sts04\\target\\classes\\";
//		String path="./target/classes/";
//		ctxt = new FileSystemXmlApplicationContext(path+filename);
		
		//패키징기준
		ctxt = new GenericXmlApplicationContext(filename);
		
		Module module = (Module) ctxt.getBean("module");
		System.out.println(module.getMsg());
	}

}
