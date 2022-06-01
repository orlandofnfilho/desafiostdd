package br.com.gft.desafiostdd.desafio07.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Supervisor extends Funcionario {

	public Supervisor() {

	}

	@Builder(builderMethodName = "supervisorBuilder")
	public Supervisor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);

	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 5000.0;
	}

}
