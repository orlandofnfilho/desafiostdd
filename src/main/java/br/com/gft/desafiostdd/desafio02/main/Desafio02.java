package br.com.gft.desafiostdd.desafio02.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.desafiostdd.desafio02.model.entities.Livro;
import br.com.gft.desafiostdd.desafio02.model.entities.Loja;
import br.com.gft.desafiostdd.desafio02.model.entities.VideoGame;
import br.com.gft.desafiostdd.desafio02.model.exceptions.SemEstoqueException;

public class Desafio02 {

	public static void main(String[] args) {

		try {
			Livro l1 = Livro.builder().nome("Harry Potter").preco(50).qtd(40).autor("J. K. Rowling").tema("fantasia")
					.qtdPag(300).build();
			Livro l2 = Livro.builder().nome("Senhor dos Anéis").preco(60).qtd(30).autor("J. R. R. Tolkien")
					.tema("fantasia").qtdPag(500).build();
			Livro l3 = Livro.builder().nome("Java POO").preco(20).qtd(50).autor("GFT").tema("educativo").qtdPag(500)
					.build();

			VideoGame ps4 = VideoGame.builder().nome("PS4").preco(1800).qtd(100).marca("Sony").modelo("Slim")
					.isUsado(false).build();
			VideoGame ps4Usado = VideoGame.builder().nome("PS4").preco(1000).qtd(7).marca("Sony").modelo("Slim")
					.isUsado(true).build();
			VideoGame xbox = VideoGame.builder().nome("XBOX").preco(1500).qtd(500).marca("Microsoft").modelo("One")
					.isUsado(false).build();

			List<Livro> livros = new ArrayList<>();
			livros.add(l1);
			livros.add(l2);
			livros.add(l3);

			List<VideoGame> games = new ArrayList<>();
			games.add(ps4);
			games.add(ps4Usado);
			games.add(xbox);

			Loja americanas = new Loja("Americanas", "12345678", livros, games);

			System.out.println();
			System.out.println("-----------Desafio 2-----------");
			System.out.println("R$ " + l2.calculaImposto() + " de imposto sobre o livro " + l2.getNome());
			System.out.println("Livro Educativo não tem imposto: " + l3.getNome());
			System.out.println("Imposto " + ps4Usado.getNome() + " " + ps4Usado.getModelo() + " usado, R$ "
					+ ps4Usado.calculaImposto());
			System.out.println("Imposto " + ps4.getNome() + " " + ps4.getModelo() + " R$ " + ps4.calculaImposto());

			System.out.println("----------------------------------------------------------------------");
			System.out.println("A loja " + americanas.getNome() + " possui esses livros para venda: ");
			americanas.listaLivros();
			System.out.println("----------------------------------------------------------------------");
			System.out.println("A loja " + americanas.getNome() + " possui esses video-games para venda: ");
			americanas.listaVideoGames();
			System.out.println("----------------------------------------------------------------------");
			System.out.println(
					"O patrimonio da loja " + americanas.getNome() + " e R$ " + americanas.calculaPatrimonio());

		} catch (SemEstoqueException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
