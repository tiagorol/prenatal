package br.com.prenatal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.prenatal.service.UserService;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	@Autowired	
	public UserService userService;
	
	@RequestMapping(value = "/simple-welcome", method = RequestMethod.GET)
	public String simpleWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome to SpringHibernateSample App");
		return "simple-welcome";
	}
	
	@RequestMapping(value = "/name-welcome", method = RequestMethod.GET)
	public String nameWelcome(@RequestParam(value = "name", defaultValue = "Unknown") String name, ModelMap model) {
		model.addAttribute("name", name);
		return "name-welcome";
	}
	
}
