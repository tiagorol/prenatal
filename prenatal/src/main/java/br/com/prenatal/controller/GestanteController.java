package br.com.prenatal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.prenatal.entity.Cidade;
import br.com.prenatal.entity.Gestante;
import br.com.prenatal.entity.enumeration.EstadoCivil;
import br.com.prenatal.entity.enumeration.GrauEscolaridade;
import br.com.prenatal.service.CidadesService;
import br.com.prenatal.service.EstadosService;
import br.com.prenatal.service.GestanteService;

@Controller
@RequestMapping("/gestante/")
public class GestanteController {

	@Autowired
	private GestanteService gestanteService;
	
	@Autowired
	private EstadosService estadoService;
	
	@Autowired
	private CidadesService cidadeService;
	
	@RequestMapping(value = "prepararInserir", method = RequestMethod.GET)
	public String salvar(ModelMap model) {
		
		List<EstadoCivil> listaEstadoCivil = new ArrayList<EstadoCivil>();
		
		listaEstadoCivil.add(EstadoCivil.CASADO);
		listaEstadoCivil.add(EstadoCivil.DIVORCIADO);
		listaEstadoCivil.add(EstadoCivil.SOLTEIRO);

		List<GrauEscolaridade> listaGrauEscolaridade = new ArrayList<GrauEscolaridade>();
	
		listaGrauEscolaridade.add(GrauEscolaridade.ANALFABETO);		
		listaGrauEscolaridade.add(GrauEscolaridade.DOUTORADO);	
		listaGrauEscolaridade.add(GrauEscolaridade.FUNDAMENTAL_COMPLETO);
		
		model.addAttribute("gestante", new Gestante());
		model.addAttribute("listaEstadoCivil",EstadoCivil.values());
		model.addAttribute("listaGrauEscolaridade",GrauEscolaridade.values());
		model.addAttribute("listaCidade",cidadeService.buscarTodas());
		model.addAttribute("listaEstado", estadoService.buscarTodos());
		return "gestante/gestanteForm";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(Gestante gestante, ModelMap model) {
		// userService.saveUser(user);
		System.out.println(gestante + "Cheguei aqui..");
		model.addAttribute("message", "Success");
		gestanteService.salvar(gestante);
		
		return "result";
	}
}
