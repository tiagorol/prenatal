package br.com.prenatal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		List<Pendencias> lista = pendenciasService.buscarTodos();
		
		ModelAndView modelAndView = new ModelAndView("/pages/pendencias/pendenciasList");  
        modelAndView.addObject("listaPendencias", lista);
		return modelAndView;
	}
	@RequestMapping(value = "/remover/{id}", method = RequestMethod.GET)
	private ModelAndView remover(@PathVariable Long id) {
		pendenciasService.removerServive(id);
		return listar();

     }
	@RequestMapping (value = "/editar/ {id}" ,  method= RequestMethod.GET)
    public  ModelAndView  editar(@PathVariable  Long  id )  {
           
           // ModelAndView.addObject ( "listapendecias",listar);
            return  listar();
    }
}
