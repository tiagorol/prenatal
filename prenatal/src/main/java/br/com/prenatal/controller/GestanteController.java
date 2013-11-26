package br.com.prenatal.controller;

import java.util.List;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.prenatal.entity.Cidade;
import br.com.prenatal.entity.Estado;
import br.com.prenatal.entity.Gestante;
import br.com.prenatal.entity.enumeration.EstadoCivil;
import br.com.prenatal.entity.enumeration.GrauEscolaridade;
import br.com.prenatal.service.CidadesService;
import br.com.prenatal.service.EstadosService;
import br.com.prenatal.service.GestanteService;
import br.com.prenatal.validator.UserValidator;

@Controller
@RequestMapping("/gestante/")
public class GestanteController {

	@Autowired
	private GestanteService gestanteService;
	
	@Autowired
	private EstadosService estadoService;
	
	@Autowired
	private CidadesService cidadeService;
	
	@Autowired
	private UserValidator userValidator;
	
	@InitBinder
    protected void initBinder(HttpServletRequest request,
                              ServletRequestDataBinder binder) throws Exception {
        binder.setValidator(userValidator);
    }
	
	@RequestMapping(value = "prepararInserir", method = RequestMethod.GET)
	public String salvar(ModelMap model) {
				
		model.addAttribute("gestante", new Gestante());
			return "gestante/gestanteForm";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@Valid Gestante gestante, BindingResult result, ModelMap model) {
		
		if (result.hasFieldErrors()) {
			return "gestante/gestanteForm";		
		}
		System.out.println(gestante + "Cheguei aqui..");
		model.addAttribute("message", "Success");
		gestanteService.salvar(gestante);
		
		return "result";
	}
	
	@ModelAttribute("listaEstadoCivil")
	public EstadoCivil[] listaEstadoCivil(){
		return EstadoCivil.values();
	}
	@ModelAttribute("listaGrauEscolaridade")
	public GrauEscolaridade[] listaGrauEscolaridades(){
		return GrauEscolaridade.values();
	}
	@ModelAttribute("listaCidade")
	public List<Cidade> listaCidade(){
		return cidadeService.buscarTodas();
	}
	@ModelAttribute("listaEstado")
	public List<Estado> listaEstados(){
		return estadoService.buscarTodos();
	}
	
}
