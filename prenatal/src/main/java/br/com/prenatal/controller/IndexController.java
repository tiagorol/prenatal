package br.com.prenatal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.prenatal.service.AuthenticationService;

@Controller
@RequestMapping("/index/")
public class IndexController {
	
	@Autowired
	AuthenticationService authenticationService;
	
	@ModelAttribute("mensagemPeriodoGravides")
	public String mensagemPeriodoGravides(){
		return "Você esta na 4 semana";
	}
}
