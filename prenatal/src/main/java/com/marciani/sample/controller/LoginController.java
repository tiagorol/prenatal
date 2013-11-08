package com.marciani.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login/")
public class LoginController {
	
	@RequestMapping(value = "logar", method = RequestMethod.POST)
	public String logar(@RequestParam(value = "email") String email, ModelMap model) {
		
		System.out.println("CHEGOU AQUI!!!");
		System.out.println(email);
		
		model.addAttribute("message", "Success");
		
		return "result";
	}

}
