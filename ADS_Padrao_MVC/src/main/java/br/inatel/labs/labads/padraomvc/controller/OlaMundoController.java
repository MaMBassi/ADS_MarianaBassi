package br.inatel.labs.labads.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {

	@GetMapping("/ola")
	public String getOla(Model model) {
		model.addAttribute("usuario","Mariana");
		return "ola-mundo";
	}
}