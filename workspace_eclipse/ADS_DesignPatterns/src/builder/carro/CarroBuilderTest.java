package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	@Test
	void deveConstruirUmCarroPeloBuilder() {
		//partes validas
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista,portaPassageiro};
		Motor motorVTEC = new Motor();
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		//builder
		CarroBuilder carroBuilder = new CarroBuilder();
		carroBuilder.buildPortas(portas);
		carroBuilder.buildMotor(motorVTEC);
		carroBuilder.buildComputadorBordo(computadorBordoSiemens);
		carroBuilder.buildFreioABS(freioBosch);
		
		//testa o carro construido
		Carro carroConstruido = carroBuilder.getCarro();
		assertNotNull(carroConstruido);
		assertNotNull(carroConstruido.getPortas());
		assertNotNull(carroConstruido.getMotor());
		assertNotNull(carroConstruido.getComputadorBordo());
		assertNotNull(carroConstruido.getFreioABS());
		assertEquals(carroConstruido.getPortas().length, 2);
	}

}
