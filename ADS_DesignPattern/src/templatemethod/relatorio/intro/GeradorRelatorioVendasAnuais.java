package templatemethod.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasAnuais extends GeradorRelatorioTemplate{

	private Integer ano;
	
	public GeradorRelatorioVendasAnuais(Integer ano) {
		this.ano = ano;
	}
	//private String getCabecalho() {
	//	String cabecalho="empresa My" + '\n' + "----------";
	//	return cabecalho;
	//}
	
	//private String getRodape() {
	//	String rodape = "-----------" + '\n'+"* Propriedade particular - Uso confidencial";
	//	return rodape;
	//}
	
		
	//public String criarPagina(Integer ano) {
	//	String cabecalho = getCabecalho();
	//	List<String> conteudo = getConteudo(ano);
	//	String rodape = getRodape();
		
	//	StringBuffer bufferPagina = new StringBuffer();
	//	bufferPagina.append(cabecalho);
		
	//	for(String linha:conteudo) {
	//		bufferPagina.append('\n');
	//		bufferPagina.append(linha);
	//	}

	//	bufferPagina.append('\n');
	//	bufferPagina.append(rodape);
	//	return bufferPagina.toString();
	//}

	@Override
	public List<String> getConteudo() {
		List<String> vendasAnual = ServicoDeRelatorio.getInstance().getVendasAnual(this.ano);
		return vendasAnual;
	}
}
