package br.inatel.labs.labads.padraomvc.controller.ProdutoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.inatel.labs.labads.padraomvc.model.entidade.Produto.Produto;
import br.inatel.labs.labads.padraomvc.service.ProdutoService.ProdutoService;

@Controller
public class ProdutoController {
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/produtos")
	public String getProdutos(Model model) {
		List<Produto> produtos = service.findAll();
		model.addAttribute("listaDeProdutos",produtos);
		return "lista-de-produtos";
	}

}
