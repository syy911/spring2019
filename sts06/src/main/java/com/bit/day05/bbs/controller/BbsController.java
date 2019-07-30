package com.bit.day05.bbs.controller;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.day05.model.entity.Day02Dao;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	@Autowired
	Day02Dao day02Dao;
	
	public void setDay02Dao(Day02Dao day02Dao) {
		this.day02Dao=day02Dao;
	}
	
	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute("alist", day02Dao.selectAll());
	}
}
