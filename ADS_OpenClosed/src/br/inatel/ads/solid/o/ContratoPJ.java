package br.inatel.ads.solid.o;

public class ContratoPJ implements Remuneravel{
	
	public double getValorMensal() {
		return 600.00;
	}
	@Override
	public double getRemuneracao() {
		return this.getValorMensal();
	}
}
