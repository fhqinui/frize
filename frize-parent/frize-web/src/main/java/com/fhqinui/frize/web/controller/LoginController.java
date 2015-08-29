package com.fhqinui.frize.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value="/page.do", method = {RequestMethod.GET})
	public String loginPagin(HttpServletRequest request, HttpServletResponse response){
//		HttpSession session = request.getSession(false);
//		if(null != session && session.getAttribute("operatorCode") != null) {
//			//已经登陆
//			return "redirect:"+INDEX_PAGE;
//		}
		return  "login";
	}
}
