package templatemethod.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasMensais extends GeradorRelatorioTemplate{

	private Integer ano;
	private Integer mes;
	
	public GeradorRelatorioVendasMensais(Integer ano, Integer mes) {
		this.ano = ano;
		this.mes = mes;
	}
	
	//private String getCabecalho() {
	//	String cabecalho="empresa My" + '\n' + "----------";
	//	return cabecalho;
	//}
	
	//private String getRodape() {
	//	String rodape = "-----------" + '\n'+"* Propriedade particular - Uso confidencial";
	//	return rodape;
	//}
	
	@Override
	public List<String> getConteudo(){
		List<String> vendasMensal = ServicoDeRelatorio.getInstance().getVendasMensal(ano, mes);
		return vendasMensal;
	}
	
	//public String criarPagina(Integer ano, Integer mes) {
	//	String cabecalho = getCabecalho();
	//	List<String> conteudo = getConteudo(ano,mes);
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
}
