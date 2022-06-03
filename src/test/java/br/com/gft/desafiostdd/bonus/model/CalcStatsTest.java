package br.com.gft.desafiostdd.bonus.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalcStatsTest {

	private CalcStats sequence;

	@BeforeEach
	public void setup() {

		sequence = new CalcStats();
		sequence.addNumbers(6, 9, 15, -2, 92, 11);

	}

	@Test
	@DisplayName("Deve calcular o maior => 92")
	public void deveCalcularOMaiorValor() {
		int max = sequence.maxValue();
		Assertions.assertEquals(92, max);
	}

	@Test
	@DisplayName("Deve calcular o menor valor => -2")
	public void deveCalcularOMenorValor() {
		int min = sequence.minValue();
		Assertions.assertEquals(-2, min);
	}

	@Test
	@DisplayName("Deve calcular o tamanho da lista => 6")
	public void deveCalcularOTamanhoDaLista() {
		int size = sequence.qtNumbers();
		Assertions.assertEquals(6, size);
	}

	@Test
	@DisplayName("Deve calcular a média dos valores => 21.8333333")
	public void deveCalcularOValorMedio() {
		double avg = sequence.avg();
		Assertions.assertEquals(21.8333333, avg, 0.0000001);
	}
}
