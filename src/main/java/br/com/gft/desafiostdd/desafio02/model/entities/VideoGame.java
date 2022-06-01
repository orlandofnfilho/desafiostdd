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
public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	@Builder
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		if (isUsado == true)
			return getPreco() * 0.25;
		return getPreco() * 0.45;
	}

}
