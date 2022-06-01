package br.com.gft.desafiostdd.desafio07.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Funcionario {

	private String nome;
	private Integer idade;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, Integer idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public double bonificacao() {
		return salario;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: " + nome);
		sb.append("\nIdade: " + idade);
		sb.append("\nSalario: " + String.format("%.2f", salario));
		sb.append("\nBonificacao: " + String.format("%.2f", bonificacao()));
		return sb.toString();
	}

}
