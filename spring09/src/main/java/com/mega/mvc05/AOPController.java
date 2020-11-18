package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController {
	
	@Autowired
	ASite a;
	
	@Autowired
	BSite b;
	
	@Autowired
	AOPService service;
	
	@RequestMapping("aopError.do")
	public void apo3() {
		try {
			service.error();
		} catch (Exception e) {

		}
	}
	
	@RequestMapping("a.do")
	public void aop1() {
		a.person();
	}

	@RequestMapping("b.do")
	public void aop2() {
		b.cart();
		b.buy();
	}
		
}