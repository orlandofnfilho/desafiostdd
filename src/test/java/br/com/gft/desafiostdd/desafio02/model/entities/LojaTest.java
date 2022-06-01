package br.com.gft.desafiostdd.desafio02.model.entities;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.gft.desafiostdd.desafio02.model.exceptions.SemEstoqueException;

class LojaTest {

	private Loja americanas;

	private List<Livro> livros;
	private List<VideoGame> games;

	@BeforeEach
	public void setup() {

		livros = new ArrayList<Livro>();
		games = new ArrayList<VideoGame>();

		Livro l1 = Livro.builder().nome("Harry Potter").preco(50).qtd(40).autor("J. K. Rowling").tema("fantasia")
				.qtdPag(300).build();
		Livro l2 = Livro.builder().nome("Senhor dos Anéis").preco(60).qtd(30).autor("J. R. R. Tolkien").tema("fantasia")
				.qtdPag(500).build();
		Livro l3 = Livro.builder().nome("Java POO").preco(20).qtd(50).autor("GFT").tema("educativo").qtdPag(500)
				.build();

		VideoGame v1 = VideoGame.builder().nome("PS4").preco(1800).qtd(100).marca("Sony").modelo("Slim").isUsado(false)
				.build();
		VideoGame v2 = VideoGame.builder().nome("PS4").preco(1000).qtd(7).marca("Sony").modelo("Slim").isUsado(true)
				.build();
		VideoGame v3 = VideoGame.builder().nome("XBOX").preco(1500).qtd(500).marca("Microsoft").modelo("One")
				.isUsado(false).build();

		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		games.add(v1);
		games.add(v2);
		games.add(v3);

		americanas = Loja.builder().nome("Americanas").cnpj("12345678").livros(livros).games(games).build();

	}

	@Test
	@DisplayName("Deve verificar se a lista de livros não é null => true")
	public void deveVerificarSeAListaDeLivrosIsNotNullRetornaTrue() {
		Assertions.assertNotNull(americanas.getLivros());

	}

	@Test
	@DisplayName("Deve verificar o tamanho da lista de livros => 3")
	public void deveVerificarOTamanhoDaListaDeLivrosRetornaOTamanho() {
		Assertions.assertEquals(3, americanas.getLivros().size());

	}

	@Test
	@DisplayName("Deve verificar se a lista de livros está na loja => true")
	public void deveVerificarSeAListaDeLivrosFoiAdicionadaNaLoja() {
		Assertions.assertIterableEquals(livros, americanas.getLivros());
	}

	@Test
	@DisplayName("Deve verificar a quantidade de livros na lista => SemEstoqueException")
	public void deveVerificarAQuantiadeDeLivrosRetornaSemEstoqueException() {
		americanas.getLivros().removeAll(livros);
		Assertions.assertThrows(SemEstoqueException.class, () -> americanas.listaLivros());
	}

	@Test
	@DisplayName("Deve verificar se a lista de livros é null => SemEstoqueException")
	public void deveVerificarSeAListaDeLivrosENullRetornaSemEstoqueException() {
		americanas.setLivros(null);
		Assertions.assertThrows(SemEstoqueException.class, () -> americanas.listaLivros());
	}

	@Test
	@DisplayName("Deve verificar se lista os livros da loja => listaLivros")
	public void deveVerificarSeListaOsLivrosDaLoja() {
		Assertions.assertDoesNotThrow(() -> americanas.listaLivros());
	}

	@Test
	@DisplayName("Deve verificar se a lista de videos games não é null => true")
	public void deveVerificarSeAlistadeGamesIsNotNullRetornaTrue() {
		Assertions.assertNotNull(americanas.getGames());

	}

	@Test
	@DisplayName("Deve verificar o tamanho da lista de games => 3")
	public void deveVerificarOTamanhoDaListaDeGamesRetornaOTamanho() {
		Assertions.assertEquals(3, americanas.getGames().size());

	}

	@Test
	@DisplayName("Deve verificar se a lista de games está na loja => true")
	public void deveVerificarSeAListaDeGamesFoiAdicionadaNaLoja() {
		Assertions.assertIterableEquals(games, americanas.getGames());
	}

	@Test
	@DisplayName("Deve verificar a quantidade de games na lista => SemEstoqueException")
	public void deveVerificarAQuantiadeDeGamesRetornaSemEstoqueException() {
		americanas.getGames().removeAll(games);
		Assertions.assertThrows(SemEstoqueException.class, () -> americanas.listaVideoGames());
	}

	@Test
	@DisplayName("Deve verificar se a lista de games é null => SemEstoqueException")
	public void deveVerificarSeAListaDeGamesENullRetornaSemEstoqueException() {
		americanas.setGames(null);
		Assertions.assertThrows(SemEstoqueException.class, () -> americanas.listaVideoGames());
	}

	@Test
	@DisplayName("Deve verificar se lista os games da loja => listaVideoGames")
	public void deveVerificarSeListaOsGamesDaLoja() {
		Assertions.assertDoesNotThrow(() -> americanas.listaVideoGames());
	}

	@Test
	@DisplayName("Deve calcular o valor do patrimonio da loja => valor do patriomnio")
	public void deveCalcularOPatrimonioDaLoja() {
		double patrimonio = americanas.calculaPatrimonio();
		Assertions.assertEquals(941800.00, patrimonio, 0.01);

	}

}
