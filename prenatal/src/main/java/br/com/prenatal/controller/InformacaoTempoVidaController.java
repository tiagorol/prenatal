package br.com.prenatal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.prenatal.entity.InformacaoTempoVida;
import br.com.prenatal.service.InformacaoTempoVidaService;

@Controller
@RequestMapping("/informacaoTempoVida/")
public class InformacaoTempoVidaController {

	@Autowired
	private InformacaoTempoVidaService informacaoTempoVidaService;

	@RequestMapping(value = "prepararInserir", method = RequestMethod.GET)
	public String salvar(ModelMap model) {
		model.addAttribute("informacaoTempoVida", new InformacaoTempoVida());
		return "informacaoTempoVida/informacaoTempoVidaForm";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@Valid InformacaoTempoVida informacaoTempoVida, BindingResult result, ModelMap model) {

		if (result.hasFieldErrors()) {
			return "informacaoTempoVida/informacaoTempoVidaForm";
		}
		System.out.println(informacaoTempoVida + "Cheguei aqui..");
		model.addAttribute("message", "Success");
		informacaoTempoVidaService.salvar(informacaoTempoVida);

		return "result";
	}
	
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		List<InformacaoTempoVida> lista = informacaoTempoVidaService.buscarTodos();
		
		ModelAndView modelAndView = new ModelAndView("/pages/informacaoTempoVida/informacaoTempoVidaList");  
        modelAndView.addObject("listaInformacaoTempoVida", lista);
		return modelAndView;
	}

}
