package org.iftm.evento.control;

import java.util.List;

import org.iftm.evento.model.Profissional;
import org.iftm.evento.model.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {

	@Autowired
	ProfissionalRepository repositorio;

	@GetMapping("/home")
	public String home(Model model) {
		List<Profissional> profissionais;
		profissionais = repositorio.findAll();
		model.addAttribute("profissionais", profissionais);
		return "home";
	}
	
  

	
	
	
	
	
	
	
	
	
}
