package br.inatel.ads.poo;

public class ContratoMEI implements Remuneravel{
	private double faturamentoMensal;

	@Override
	public double getValor() {
		return this.faturamentoMensal;
	}

}
