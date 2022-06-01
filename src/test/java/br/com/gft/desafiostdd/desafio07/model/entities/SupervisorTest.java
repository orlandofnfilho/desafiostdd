package br.com.gft.desafiostdd.desafio07.model.entities;

import java.util.Locale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SupervisorTest {

	private Supervisor supervisor;

	@BeforeEach
	public void setup() {
		Locale.setDefault(Locale.US);
		supervisor = Supervisor.supervisorBuilder().nome("Carlos").idade(35).salario(4000.0).build();

	}
	
	@Test
	@DisplayName("Deve verificar a bonificação  => valor incrementado")
	public void deveVerificarABonificacaoRetornaOValorIncrementado() {
		double bonificacao = supervisor.bonificacao();
		Assertions.assertEquals(9000.00, bonificacao, 0.01);
	}

}
