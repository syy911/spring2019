package com.bit.day04.modul;

public class Module2 implements Module {
	private String msg = "ȯ���մϴ�";
	
	public Module2() {}
	
	//�����ڷ� set����
	//xml�� ���� �����ϸ� setter method�� ���ٰ� ERROR
	public Module2(String msg) {
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
