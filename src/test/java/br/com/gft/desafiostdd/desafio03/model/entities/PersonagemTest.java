package br.com.gft.desafiostdd.desafio03.model.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.gft.desafiostdd.desafio03.model.entities.Personagem;

class PersonagemTest {

	private Personagem personagem;

	@BeforeEach
	public void setup() {

		personagem = Personagem.builder().nome("dvp").vida(500).mana(200).xp(30).inteligencia(20).forca(30).level(10)
				.build();

	}

	@Test
	@DisplayName("Deve verificar a quantidade de personagens criados => 1")
	public void deveVerificarAQuantidadeDePersonagensCriados() {
		Assertions.assertEquals(1, Personagem.getSequence());
	}

	@Test
	@DisplayName("Deve verificar se incrementa o level => level + 1 ")
	public void deveVerificarSeIncrementaOLevel() {
		personagem.lvlUp();
		int level = personagem.getLevel();
		Assertions.assertEquals(11, level);
	}

}