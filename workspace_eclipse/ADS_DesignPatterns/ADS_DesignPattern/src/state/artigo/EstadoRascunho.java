package state.artigo;

import java.time.LocalDate;

public class EstadoRascunho implements Estado{

	private Artigo artigo;
	
	public EstadoRascunho(Artigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstance();
		if(gerente.ehUsuarioAutor()){
			this.artigo.transitarEstadoPara(new EstadoRevisando(artigo));
			this.artigo.getLogHistorico().add("Transitado para REVISANDO em"+LocalDate.now());
		}else {
			throw new RuntimeException("Usuario nao tem permissao para publicar");
		}
		
	}

	@Override
	public void reprovar() {
		
		//faz nada
	}

}
