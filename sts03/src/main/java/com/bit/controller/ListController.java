package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.support.DaoSupport;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.day03.model.Day02Dao;

public class ListController implements Controller {
	Day02Dao dao;
	
	//xml을 통해서 객체를 주입받아 사용
	public void setDao(Day02Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("alist", dao.selectAll());
		//jsp페이지 지정
		mav.setViewName("list");
		
		return mav;
	}

}
