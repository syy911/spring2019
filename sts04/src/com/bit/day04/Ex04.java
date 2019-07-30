package com.bit.day04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.modul.Module5;

public class Ex04 {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Module5 mod=(Module5) ctxt.getBean("mod5");
		
		//String []
		System.out.println(Arrays.toString(mod.getArr()));
		
		System.out.println("------------------------------");
		//List
		List<String> list = mod.getList();
		for(String msg:list) {
			System.out.print(msg+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
		//Set
		Set<String> set = mod.getSet();
		for(String msg : set) {
			System.out.print(msg+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
		//Map
		//properties는 자료형으로 따지면 Map타입
		Map<String, String> map = mod.getMap();
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+" : "+map.get(key));
		}
	}
}
