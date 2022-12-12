package br.inatel.labs.labads.padraomvc.service.ProdutoService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import br.inatel.labs.labads.padraomvc.model.entidade.Produto.Produto;

@Service
public class ProdutoService {

	private List<Produto> listaDeProdutos = new ArrayList<>();
	
	@PostMapping
	private void setup() {
		Produto p1 = new Produto(1L,"Furadeira",300.00);
		Produto p2 = new Produto(2L,"Lixadeira",200.00);
		Produto p3 = new Produto(3L,"Serra circular",500.00);
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		
	}
	
	public List<Produto> findAll(){
		return listaDeProdutos;
	}
	
}
