package br.com.gft.desafiostdd.desafio07.model.entities;

import java.util.Locale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerenteTest {

	private Gerente gerente;

	@BeforeEach
	public void setup() {
		Locale.setDefault(Locale.US);
		gerente = Gerente.gerenteBuilder().nome("Luiz").idade(45).salario(6000.0).build();
	}

	@Test
	@DisplayName("Deve calcular a bonificacao => 16000.00")
	public void deveCalcularABonificacao() {
		double bonificacao = gerente.bonificacao();
		Assertions.assertEquals(16000.00, bonificacao, 0.01);
	}
}
