package com.marciani.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.marciani.sample.service.AuthenticationService;

@Controller
@RequestMapping("/login/")
public class LoginController {
	
	@Autowired
	AuthenticationService authenticationService;
	
	@RequestMapping(value = "logar", method = RequestMethod.POST)
	public String logar(@RequestParam(value = "email") String email, @RequestParam(value = "senha") String senha, ModelMap model) {
		
		System.out.println("CHEGOU AQUI!!!");
		System.out.println(email);
		
		boolean success = authenticationService.login(email, senha);
		
		model.addAttribute("message", "Success");
		
		return success ? "index" : "login.jsp";
	}

}
