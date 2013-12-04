package br.com.prenatal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.prenatal.service.AuthenticationService;

@Controller
@RequestMapping("/login/")
public class LoginController {
	
	@Autowired
	AuthenticationService authenticationService;
	
	@RequestMapping(value = "logar", method = RequestMethod.POST)
	public String logar(@RequestParam(value = "email") String email, @RequestParam(value = "senha") String senha, ModelMap model) {
		boolean success = authenticationService.login(email, senha);
		model.addAttribute("message", "Success");
		return success ? "/pages/index" : "/login";
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(){
		authenticationService.logout();
		return "/login";
	}
}
