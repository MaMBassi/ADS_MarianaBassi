package br.inatel.ads.poo;

public class ContratoCLT implements Remuneravel{
	private double salario;

	@Override
	public double getValor() {
		return this.salario;
	}
	
}
