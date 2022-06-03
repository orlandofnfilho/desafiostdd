package br.com.gft.desafiostdd.desafio03.model.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonagemTest {

	private Personagem personagem;

	@BeforeEach
	public void setup() {

		personagem = Personagem.builder().nome("dvp").vida(500).mana(200).xp(30).inteligencia(20).forca(30).level(10)
				.build();

	}

	@Test
	@DisplayName("Deve incrementar a quantidade de personagens criados => 1")
	public void deveIncrementarAQuantidadeDePersonagens() {
		Assertions.assertEquals(1, Personagem.getSequence());
	}

	@Test
	@DisplayName("Deve incrementar o level => 11 ")
	public void deveIncrementarOLevel() {
		personagem.lvlUp();
		int level = personagem.getLevel();
		Assertions.assertEquals(11, level);
	}

}