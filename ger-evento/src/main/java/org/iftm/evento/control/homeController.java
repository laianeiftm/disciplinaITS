package org.iftm.evento.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Autowired
private ProfissionalRepository profRepository;

@GetMapping("/home")
public String home(Model model) {
	List<Veterinario> veterinarios;
	veterinarios = vetRepository.findAll();
	model.addAttribute("veterinarios", veterinarios);
	return "home";
}


