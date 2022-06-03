package br.com.gft.desafiostdd.desafio02.model.entities;

import java.util.List;

import br.com.gft.desafiostdd.desafio02.model.exceptions.SemEstoqueException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Builder
public class Loja {

	private String nome;
	private String cnpj;

	private List<Livro> livros;
	private List<VideoGame> games;

	public void listaLivros() {
		if (livros == null || livros.size() == 0)
			throw new SemEstoqueException("A loja não tem livros no seu estoque");
		for (Livro l : livros) {
			System.out.println("Titulo: " + l.getNome() + ", preco: " + l.getPreco() + ", quantidade: " + l.getQtd()
					+ " em estoque.");
		}

	}

	public void listaVideoGames() {
		if (games == null || games.size() == 0)
			throw new SemEstoqueException("A loja não tem video games no seu estoque");
		for (VideoGame v : games) {
			System.out.println("Video-game: " + v.getModelo() + ", preco: " + v.getPreco() + ", quantidade: "
					+ v.getQtd() + " em estoque.");
		}
	}

	public double calculaPatrimonio() {
		double totalLivros = 0.0;
		double totalVideoGames = 0.0;
		for (Livro l : livros) {
			totalLivros = totalLivros + l.getPreco() * l.getQtd();
		}

		for (VideoGame v : games) {
			totalVideoGames = totalVideoGames + v.getPreco() * v.getQtd();
		}

		double patrimonio = totalLivros + totalVideoGames;
		return patrimonio;
	}

}
