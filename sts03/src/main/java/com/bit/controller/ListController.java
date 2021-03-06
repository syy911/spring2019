package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.support.DaoSupport;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.day03.model.Day02Dao;
import com.bit.day03.model.Day02Dao2;

public class ListController implements Controller {
	Day02Dao2 dao;
	
	//xml을 통해서 객체를 주입받아 사용
	public void setDao(Day02Dao2 dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		//jsp페이지에 EL로 보내서 사용하기
		mav.addObject("alist", dao.selectAll());
		
		//jsp페이지 지정
		mav.setViewName("list");
		
		return mav;
	}

}
