package br.com.prenatal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.prenatal.entity.InformacaoTempoVida;
import br.com.prenatal.entity.Pendencias;
import br.com.prenatal.service.PendenciasService;

@Controller
@RequestMapping("/pendencias/")
public class PendenciasController {

	@Autowired
	private PendenciasService pendenciasService;

	@RequestMapping(value = "prepararInserir", method = RequestMethod.GET)
	public String salvar(ModelMap model) {

		model.addAttribute("pendencias", new Pendencias());
		return "/pages/pendencias/pendenciasForm";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@Valid Pendencias pendencias,
			BindingResult result, ModelMap model) {

		if (result.hasFieldErrors()) {
			return "pendencias/pendenciasForm";
		}
		System.out.println(pendencias + "Cheguei aqui..");
		model.addAttribute("message", "Success");
		pendenciasService.salvar(pendencias);

		return "/pages/result";
	}
}
