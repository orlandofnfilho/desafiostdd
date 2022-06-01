package br.com.gft.desafiostdd.desafio01.model.entities;

import br.com.gft.desafiostdd.desafio01.model.exceptions.VeiculoException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;

	public void acelerar() {
		if (isLigado == false) {
			throw new VeiculoException("O veiculo está desligado");
		}
		if (litrosCombustivel == 0) {
			throw new VeiculoException("O veiculo não tem combustivel");
		}
		velocidade += 20;

	}

	public void abastecer(int combustivel) {
		if (litrosCombustivel == 60) {
			throw new VeiculoException("O tanque já está cheio");
		}
		if ((combustivel + litrosCombustivel) > 60) {
			throw new VeiculoException("A quantidade de combustivel ultrapassa a capacidade do tanque");
		}
		litrosCombustivel += combustivel;

	}

	public void frear() {
		if (isLigado == false) {
			throw new VeiculoException("O veiculo está desligado");
		}
		if (velocidade <= 0) {
			throw new VeiculoException("O veiculo está parado");
		}

		velocidade -= 20;

	}

	public void pintar(String cor) {
		this.cor = cor;
	}

	public void ligar() {
		if (isLigado == true)
			throw new VeiculoException("O veiculo já está ligado");
		isLigado = true;

	}

	public void desligar() {
		if (isLigado == false) {
			throw new VeiculoException("O veiculo já está desligado");
		}
		if (velocidade > 0) {
			throw new VeiculoException("O veiculo está em movimento");
		}
		isLigado = false;
	}

}
