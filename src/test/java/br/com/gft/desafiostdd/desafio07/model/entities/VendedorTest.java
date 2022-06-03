package br.com.gft.desafiostdd.desafio07.model.entities;

import java.util.Locale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VendedorTest {

	private Vendedor vendedor;

	@BeforeEach
	public void setup() {
		Locale.setDefault(Locale.US);
		vendedor = Vendedor.vendedorBuilder().nome("Pedro").idade(30).salario(2000.00).build();
	}

	@Test
	@DisplayName("Deve calcular a bonificacao => 5000.00")
	public void deveCalcularABonificacao() {
		double bonificacao = vendedor.bonificacao();
		Assertions.assertEquals(5000.00, bonificacao, 0.01);
	}

}
