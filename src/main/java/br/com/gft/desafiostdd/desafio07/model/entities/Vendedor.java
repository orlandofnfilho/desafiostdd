package br.com.gft.desafiostdd.desafio07.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vendedor extends Funcionario {
	
	public Vendedor() {
		
	}

	@Builder(builderMethodName = "vendedorBuilder")
	public Vendedor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 3000.0;
	}
	
	
	
	

}
