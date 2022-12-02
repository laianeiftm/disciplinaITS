package org.iftm.evento.control;
import java.util.Optional;

import org.iftm.evento.model.Profissional;
import org.iftm.evento.model.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
// @RequestMapping("/profissional")


public class ProfissionalController {
	
	@Autowired
	ProfissionalRepository repositorio;
	
	@GetMapping("/sobre")
	public String sobre() {
		return "Sobre";
		}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable int id) {  
	  	Optional<Profissional> Profissional = repositorio.findById(id);
	      if (Profissional.isPresent()) {
	            		repositorio.delete(Profissional.get());
	    	}        
	        return "redirect:/home";
	    }

    @GetMapping("/form")
    public String profissionalForm(Profissional profissional) {    	
        return "addProfissionalForm";
        
    }
    
    @PostMapping("/add")
    public String novo(Profissional profissional) {
        repositorio.save(profissional);
        return "redirect:/home";
    }

    @GetMapping("form/{id}")
    public String updateForm(Model model, @PathVariable int id) {
    	Optional<Profissional> profissional = repositorio.findById(id);
    	System.out.println(profissional.get().getCodProfissional());
    	if (profissional.isPresent()) {
    		model.addAttribute("profissional", profissional.get());
    		return "atualizaProfissionalForm";
    	}else {
    		return "redirect:/home";
    	}
    }
    
    @PostMapping("update/{id}")
    public String alterarProduto(Profissional profissional, @PathVariable int id) {
    	System.out.println(profissional.getCodProfissional());
       repositorio.save(profissional);
        return "redirect:/home";
    }

    



	
}
