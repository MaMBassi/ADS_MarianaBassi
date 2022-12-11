package strategy.comparator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void deveOrdenarListaDeAnimaisPeloNome() {
		List<Animal> listaDeAnimais = new ArrayList<>();
		listaDeAnimais.add(new Animal(2L,"Coelho"));
		listaDeAnimais.add(new Animal(3L,"Cachorro"));
		listaDeAnimais.add(new Animal(4L,"Gato"));
		listaDeAnimais.add(new Animal(5L,"Girafa"));
		listaDeAnimais.add(new Animal(6L,"Cavalo"));
		
		System.out.println("Lista original: ");
		listaDeAnimais.forEach(System.out::println);
		
		listaDeAnimais.sort(new ComparadorPorNome());
		System.out.println("Lista ordenada por nome: ");
		listaDeAnimais.forEach(System.out::println);
	}
	
	@Test
	void deveOrdenarListaDeAnimaisPeloId() {
		List<Animal> listaDeAnimais = new ArrayList<>();
		listaDeAnimais.add(new Animal(2L,"Coelho"));
		listaDeAnimais.add(new Animal(3L,"Cachorro"));
		listaDeAnimais.add(new Animal(4L,"Gato"));
		listaDeAnimais.add(new Animal(5L,"Girafa"));
		listaDeAnimais.add(new Animal(6L,"Cavalo"));
		
		System.out.println("Lista original: ");
		listaDeAnimais.forEach(System.out::println);
		
		listaDeAnimais.sort(new ComparadorPorId());
		System.out.println("Lista ordenada por id: ");
		listaDeAnimais.forEach(System.out::println);
	}

}
