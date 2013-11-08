package br.com.prenatal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.prenatal.entity.user.model.User;
import br.com.prenatal.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	
	@Autowired	
	public UserService userService;
	
	@RequestMapping(value = "management", method = RequestMethod.GET)
	public String saveUser(ModelMap model) {
		model.addAttribute("user", new User());
		return "user-management";
	}
	
	@RequestMapping(value = "management/save", method = RequestMethod.POST)
	public String saveUser(User user, ModelMap model) {		
		userService.saveUser(user);		
		model.addAttribute("message", "Success");
		return "result";
	}
	
	@RequestMapping(value = "management/delete", method = RequestMethod.POST)
	public String deleteUser(String username, ModelMap model) {		
		userService.deleteUser(username);		
		model.addAttribute("message", "Success");
		return "result";
	}

}
