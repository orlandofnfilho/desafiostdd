package br.com.gft.desafiostdd.desafio03.model.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GuerreiroTest {

	private Guerreiro guerreiro;

	@BeforeEach
	public void setup() {

		guerreiro = Guerreiro.guerreiroBuilder().nome("DeathSmell").vida(9000).mana(1500).xp(70).inteligencia(35)
				.forca(135).level(80).build();

	}

	@Test
	@DisplayName("Deve adicionar uma habilidade na lista => true")
	public void deveAdicionarUmaHabilidadeNaListaDeHabilidades() {
		guerreiro.aprenderHabilidade("Triple Sonic Slash");
		Assertions.assertTrue(guerreiro.getHabilidade().contains("Triple Sonic Slash"));

	}

	@Test
	@DisplayName("Deve verificar se o valor do ataque está no intervalo => true")
	public void deveVerificarSeOValorDoAtaqueEstaNoIntervalo() {
		int ataqueFisico = 0;
		ataqueFisico = guerreiro.attack();
		Assertions.assertTrue(ataqueFisico > 0 && ataqueFisico <= 11100);
	}

	@Test
	@DisplayName("Deve verificar se o level aumenta ao passar de level = true")
	public void deveVerificarSeOLevelAumentaAoPssarDeLevel() {
		guerreiro.lvlUp();
		int newLevel = guerreiro.getLevel();
		Assertions.assertEquals(81, newLevel);
	}

	@Test
	@DisplayName("Deve verificar se a forca aumenta ao passar de level => true")
	public void deveVerificarSeAForcaAumentamAoPssarDeLevel() {
		guerreiro.lvlUp();
		int newForca = guerreiro.getForca();
		Assertions.assertEquals(145, newForca);
	}

}