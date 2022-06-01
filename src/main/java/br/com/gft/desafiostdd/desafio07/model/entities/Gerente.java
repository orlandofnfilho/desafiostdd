package br.com.gft.desafiostdd.desafio07.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Gerente extends Funcionario {

	public Gerente() {

	}

	@Builder(builderMethodName = "gerenteBuilder")
	public Gerente(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 10000.0;
	}
	
	

}
