package com.bit.day04.modul;

public class Module1 implements Module {
	//접근 불가능
	private String msg="hello world";
	
	//접근 가능케 해줌
	public String getMsg() {
		return msg;
	}
	
	//필드값 주입가능
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
