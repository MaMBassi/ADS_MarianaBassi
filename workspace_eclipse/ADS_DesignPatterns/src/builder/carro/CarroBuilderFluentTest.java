package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderFluentTest {

	@Test
	void deveConstruirUmCarroPeloBuilder() {
		
		//partes validas
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista,portaPassageiro};
		Motor motorVTEC = new Motor();
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
				
		//CarroBuilderFluente
		Carro carroConstruido = new CarroBuilderFluente()
				.buildPortas(portas)
				.buildMotor(motorVTEC)
				.buildComputadorBordo(computadorBordoSiemens)
				.buildFreioABS(freioBosch);
				.getCarro();
				
		//validando carro		
		assertNotNull(carroConstruido);
		assertNotNull(carroConstruido.getPortas());
		assertNotNull(carroConstruido.getMotor());
		assertNotNull(carroConstruido.getComputadorBordo());
		assertNotNull(carroConstruido.getFreioABS());
		assertEquals(carroConstruido.getPortas().length, 2);
	}

}
