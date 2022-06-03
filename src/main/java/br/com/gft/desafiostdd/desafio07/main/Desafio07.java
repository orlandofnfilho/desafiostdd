package br.com.gft.desafiostdd.desafio07.main;

import java.util.Locale;

import br.com.gft.desafiostdd.desafio07.model.entities.Gerente;
import br.com.gft.desafiostdd.desafio07.model.entities.Supervisor;
import br.com.gft.desafiostdd.desafio07.model.entities.Vendedor;

public class Desafio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try {
			Gerente gerente = Gerente.gerenteBuilder().nome("Luiz").idade(45).salario(6000.0).build();
			Supervisor supervisor = Supervisor.supervisorBuilder().nome("Carlos").idade(35).salario(4000.0).build();
			Vendedor vendedor = Vendedor.vendedorBuilder().nome("Pedro").idade(30).salario(2000.00).build();

			System.out.println();
			System.out.println("-----------Desafio 7-----------");
			System.out.println(gerente);
			System.out.println(supervisor);
			System.out.println(vendedor);
		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
