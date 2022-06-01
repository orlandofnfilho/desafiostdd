package br.com.gft.desafiostdd.desafio03.model.entities;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MagoTest {

	private Mago mago;
	private Random r = new Random();

	@BeforeEach
	public void setup() {

		mago = Mago.magobuilder().nome("Exeqt0r").vida(3000).mana(5000).xp(90).inteligencia(125).forca(40).level(80)
				.build();

	}

	@Test
	@DisplayName("Deve adicionar uma magia na lista => true")
	public void deveAdicionarUmaMagiaNaListaDeMagias() {
		mago.aprenderMagia("Hurricane");
		Assertions.assertTrue(mago.getMagia().contains("Hurricane"));

	}

	@Test
	@DisplayName("Deve verificar se o valor do ataque está no intervalo => true")
	public void deveVerificarSeOValorDoAtaqueEstaNoIntervalo() {
		int ataqueMagico = 0;
		ataqueMagico = mago.attack();
		Assertions.assertTrue(ataqueMagico > 0 && ataqueMagico <= 10300);
	}

	@Test
	@DisplayName("Deve verificar se o level aumenta ao passar de level = true")
	public void deveVerificarSeOLevelAumentaAoPssarDeLevel() {
		mago.lvlUp();
		int newLevel = mago.getLevel();
		Assertions.assertEquals(81, newLevel);
	}
	
	@Test
	@DisplayName("Deve verificar se a inteligencia aumenta ao passar de level => true")
	public void deveVerificarSeAInteligenciaAumentamAoPssarDeLevel() {
		mago.lvlUp();
		int newInteligencia = mago.getInteligencia();
		Assertions.assertEquals(135, newInteligencia);
	}

}
