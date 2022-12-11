package br.inatel.ads.solid.liskov;

class Cafeteira {
	public Cafe prepararCafe() {
		return new Cafe(agua, po, acucar);
	}

}

