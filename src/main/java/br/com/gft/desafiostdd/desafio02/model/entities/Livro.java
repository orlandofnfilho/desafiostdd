package br.com.gft.desafiostdd.desafio02.model.entities;

import br.com.gft.desafiostdd.desafio02.interfaces.Imposto;
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
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = true)
public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int qtdPag;

	@Builder
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		if (tema.equalsIgnoreCase("educativo"))
			return 0;
		return getPreco() * 0.10;
	}

}
