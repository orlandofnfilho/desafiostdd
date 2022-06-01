package br.com.gft.desafiostdd.desafio02.model.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VideoGameTest {

	private VideoGame videoGame;

	@BeforeEach
	public void setup() {
		videoGame = VideoGame.builder().nome("PS4").preco(1800).qtd(100).marca("Sony").modelo("Slim").isUsado(false)
				.build();
	}

	@Test
	@DisplayName("Deve modificar o preco => 1700.00")
	public void deveModificarOprecoRetornaNovoPreco() {
		videoGame.setPreco(1700);
		Assertions.assertEquals(1700.00, videoGame.getPreco(), 0.01);
	}

	@Test
	@DisplayName("Deve calcular o imposto sobre video game usado => 450.00")
	public void deveCalcularOImpostoSobreVideoGameUsado() {
		videoGame.setUsado(true);
		double imposto = videoGame.calculaImposto();
		Assertions.assertEquals(450.00, imposto, 0.01);

	}

	@Test
	@DisplayName("Deve calcular o imposto sobre video game novo => 810.00")
	public void deveCalcularOImpostoSobreVideoGameNovo() {
		double imposto = videoGame.calculaImposto();
		Assertions.assertEquals(810.00, imposto, 0.01);

	}

}
