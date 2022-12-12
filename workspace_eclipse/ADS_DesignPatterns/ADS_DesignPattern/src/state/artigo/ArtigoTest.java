package state.artigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArtigoTest {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstance();
		Artigo artigo = new Artigo();
		
		gerente.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
	}

	@Test
	void deveArtigoTransitarDeRascunhoRevisandoRascunho() {
		GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstance();
		Artigo artigo = new Artigo();
		
		gerente.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		gerente.setUsuarioCorrente("MODERADOR");
		artigo.reprovar();
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		artigo.getLogHistorico().forEach(System.out::println);
	}
}
