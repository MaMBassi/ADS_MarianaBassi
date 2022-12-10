package br.inatel.ads.solid.o;

public class ContratoCLT implements Remuneravel{
	
	//public void getSalario() {}//- sem solid
	public double getSalario() {
		return 600.00;
	}
	@Override
	public double getRemuneracao() {
		return this.getSalario();
	}
	
}
