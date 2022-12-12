package state.artigo;

import java.time.LocalDate;

public class EstadoRevisando implements Estado{
	private Artigo artigo;
	
	public EstadoRevisando(Artigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstance();
		if(gerente.ehUsuarioModerador()){
			this.artigo.transitarEstadoPara(new EstadoRevisando(artigo));
			this.artigo.getLogHistorico().add("Transitado para APROVADO em"+LocalDate.now());
		}else {
			throw new RuntimeException("Usuario nao tem permissao para publicar");
		}
	}

	@Override
	public void reprovar() {
		GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstance();
		if(gerente.ehUsuarioModerador()){
			this.artigo.transitarEstadoPara(new EstadoRevisando(artigo));
			this.artigo.getLogHistorico().add("Transitado para RASCUNHO em"+LocalDate.now());
		}else {
			throw new RuntimeException("Usuario nao tem permissao para reprovar");
		}
	}
}
