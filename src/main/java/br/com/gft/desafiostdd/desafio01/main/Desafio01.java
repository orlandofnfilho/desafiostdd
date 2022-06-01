package br.com.gft.desafiostdd.desafio01.main;

import java.util.Locale;

import br.com.gft.desafiostdd.desafio01.model.entities.Veiculo;
import br.com.gft.desafiostdd.desafio01.model.exceptions.VeiculoException;

public class Desafio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Veiculo v1 = Veiculo.builder().marca("Honda").modelo("Civic").placa("KFJ-6624").cor("Preto").km(10000)
				.isLigado(false).litrosCombustivel(0).velocidade(0).preco(70000.0).build();

		try {

			System.out.println();
			System.out.println("-----------Desafio 1-----------");
			System.out.println("Informações do veículo: ");
			System.out.println("Marca  : " + v1.getMarca());
			System.out.println("Modelo : " + v1.getModelo());
			System.out.println("Placa  : " + v1.getPlaca());
			System.out.println("Cor    : " + v1.getCor());
			System.out.println("Preco  : " + String.format("%.2f", v1.getPreco()));
			System.out.println("Km     : " + v1.getKm());

			System.out.println();

			System.out.println("Pintar veiculo de outra cor");
			v1.pintar("azul");
			System.out.println("Nova cor: " + v1.getCor());
			System.out.println();

			System.out.println("Ligando...");
			v1.ligar();
			System.out.println(v1.isLigado());
			System.out.println();

			System.out.println("Abastecendo...");
			v1.abastecer(50);
			System.out.println("Litros no combustível: " + v1.getLitrosCombustivel());
			System.out.println();

			System.out.println("Acelerando...");
			v1.acelerar();
			System.out.println("Velocidade atual: " + v1.getVelocidade());
			System.out.println();

			System.out.println("Freando...");
			v1.frear();
			System.out.println("Velocidade atual: " + v1.getVelocidade());
			System.out.println();

			System.out.println("Desligando...");
			v1.desligar();
			System.out.println("Veiculo ligado: " + v1.isLigado());

		} catch (VeiculoException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
