package br.inatel.ads.solid.o;

public class Estagio implements Remuneravel{
	//public void getBolsaAuxilio() {}
	public double getBolsaAuxilio() {
		return 120.00;
	}
	
	@Override
	public double getRemuneracao() {
		// TODO Auto-generated method stub
		return this.getBolsaAuxilio();
	}
}
