package br.com.gft.desafiostdd.desafio02.model.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LivroTest {

	private Livro livro;

	@BeforeEach
	public void setup() {
		livro = Livro.builder().nome("Harry Potter").preco(50).qtd(40).autor("J. K. Rowling").tema("fantasia")
				.qtdPag(300).build();

	}

	@Test
	@DisplayName("Deve modificar o nome do livro => Novo nome")
	public void deveRetornarONomeDoLivro() {
		livro.setNome("Livro Java POO");
		Assertions.assertTrue("livro java poo".equalsIgnoreCase(livro.getNome()));
	}

	@Test
	@DisplayName("Deve calcular o imposto para livros educativos => 0")
	public void deveCalcularImpostoRetornaZeroParaEducativo() {
		livro.setTema("educativo");
		double imposto = livro.calculaImposto();
		Assertions.assertEquals(0, imposto, 0.01);
	}

	@Test
	@DisplayName("Deve calcular o imposto para livros não educativos => 10% valor do livro")
	public void deveCalcularImpostoSobreLivrosNaoEducativos() {
		double imposto = livro.calculaImposto();
		Assertions.assertEquals(5, imposto, 0.01);
	}

}
