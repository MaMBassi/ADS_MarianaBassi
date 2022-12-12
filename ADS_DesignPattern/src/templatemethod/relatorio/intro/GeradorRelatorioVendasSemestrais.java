package templatemethod.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasSemestrais extends GeradorRelatorioTemplate{

	private Integer semestre;
	
	public GeradorRelatorioVendasSemestrais(Integer semestre) {
		this.semestre = semestre;
	}
	@Override
	public List<String> getConteudo() {
		List<String> vendasSemestral = ServicoDeRelatorio.getInstance().getVendasSemestral(semestre);
		return vendasSemestral;
	}

}
