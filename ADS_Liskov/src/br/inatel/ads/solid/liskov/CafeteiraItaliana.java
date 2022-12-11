package br.inatel.ads.solid.liskov;

public class CafeteiraItaliana extends Cafeteira{
	public Capuccino prepararCapucino() {
	      return new Capuccino();
	   }

	   public Cafe preparCafe() {
	      return new Cafe(agua, po, acucar, canela);
	   }


}
