package com.bit.day04.modul;

public class Module2 implements Module {
	private String msg = "환영합니다";
	
	public Module2() {}
	
	//생성자로 set주입
	//xml로 값을 주입하면 setter method가 없다고 ERROR
	public Module2(String msg) {
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
