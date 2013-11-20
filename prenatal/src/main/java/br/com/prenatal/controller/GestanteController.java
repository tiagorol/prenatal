package br.com.prenatal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.prenatal.entity.Cidade;
import br.com.prenatal.entity.Estado;
import br.com.prenatal.entity.Gestante;
import br.com.prenatal.entity.enumeration.EstadoCivil;
import br.com.prenatal.entity.enumeration.GrauEscolaridade;
import br.com.prenatal.service.GestanteService;

@Controller
@RequestMapping("/gestante/")
public class GestanteController {

	@Autowired
	private GestanteService gestanteService;

	@RequestMapping(value = "prepararInserir", method = RequestMethod.GET)
	public String salvar(ModelMap model) {

		Estado sp1 = new Estado();

		sp1.setNome("Sao Paulo");
		sp1.setSigla("SP");
		sp1.setId(1L);

		Estado ce1 = new Estado();
		ce1.setNome("CEARA");
		ce1.setSigla("CE");
		ce1.setId(2L);

		List<Estado> listaEstado = new ArrayList<Estado>();

		listaEstado.add(ce1);
		listaEstado.add(sp1);

		Cidade cd1 = new Cidade();

		cd1.setId(1L);
		cd1.setNome("Fortaleza");

		Cidade cd2 = new Cidade();

		cd2.setId(2L);
		cd2.setNome("Paraiba");
		
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		
		listaCidade.add(cd1);
		listaCidade.add(cd2);
		
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
		model.addAttribute("listaCidade",listaCidade);
		model.addAttribute("listaEstado", listaEstado);
		return "gestante/gestanteForm";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(Gestante gestante, ModelMap model) {
		// userService.saveUser(user);
		System.out.println(gestante + "Cheguei aqui..");
		model.addAttribute("message", "Success");
		return "result";
	}
}
