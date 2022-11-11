package org.iftm.evento.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/profissional")

public class ProfissionalController {
	@GetMapping("/sobre")
	public String sobre() {
		return "Sobre";
		}


	public ProfissionalController() {
		// TODO Auto-generated constructor stub
	}

}
