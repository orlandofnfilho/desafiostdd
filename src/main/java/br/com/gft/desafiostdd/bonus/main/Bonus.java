package br.com.gft.desafiostdd.bonus.main;

import java.util.Locale;

import br.com.gft.desafiostdd.bonus.model.CalcStats;

public class Bonus {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try {
			CalcStats sequence = new CalcStats();

			sequence.addNumbers(6, 9, 15, -2, 92, 11);

			System.out.println();
			System.out.println("-----------Bônus-----------");
			System.out.println("Calculando estatísticas simples");
			System.out.println("Sequência: " + sequence.getNumbers());
			System.out.println("Valor máximo: " + sequence.maxValue());
			System.out.println("Valor minimo: " + sequence.minValue());
			System.out.println("Numeros de elementos na sequência: " + sequence.qtNumbers());
			System.out.println("Valor médio: " + String.format("%.7f", sequence.avg()));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
