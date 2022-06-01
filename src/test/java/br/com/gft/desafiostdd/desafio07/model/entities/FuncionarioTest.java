package br.com.gft.desafiostdd.desafio07.model.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FuncionarioTest {

	private Funcionario funcionario;

	@BeforeEach
	public void setup() {
		funcionario = Funcionario.builder().nome("Marcelo").idade(30).salario(3500.0).build();
	}

	@Test
	@DisplayName("Deve retorna o salario => true")
	public void deveRetornarOSalario() {
		double bonificacao = funcionario.bonificacao();
		Assertions.assertEquals(3500.00, bonificacao, 0.01);
	}

}
