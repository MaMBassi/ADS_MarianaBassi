package br.inatel.ads.solid.o;

public class FolhaDePagamento {
	private double saldo;

	//public void calcular(Object f) {
	//	if (f instanceof ContratoCLT){
	//		this.saldo = f.getSalario();
    //
	//	} else if (f instanceof Estagio) {
	//		this.saldo = f.getBolsaAuxilio();
	//	}
     		//outros ifs aqui
	public void calcular(Remuneravel r) {
		this.saldo = r.getRemuneracao();
	}
}
