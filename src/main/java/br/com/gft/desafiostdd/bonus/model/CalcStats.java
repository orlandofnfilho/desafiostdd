package br.com.gft.desafiostdd.bonus.model;

import java.util.ArrayList;
import java.util.List;

public class CalcStats {

	private List<Integer> numbers = new ArrayList<>();

	public void addNumbers(int num1, int num2, int num3, int num4, int num5, int num6) {
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);
		numbers.add(num4);
		numbers.add(num5);
		numbers.add(num6);
	}

	public int maxValue() {
		int max = numbers.stream().mapToInt(i -> i).max().getAsInt();
		return max;
	}

	public int minValue() {
		int min = numbers.stream().mapToInt(i -> i).min().getAsInt();
		return min;
	}

	public int qtNumbers() {
		int size = numbers.size();
		return size;
	}

	public double avg() {
		double avg = (numbers.stream().mapToDouble(i -> i).sum()) / numbers.size();
		return avg;
	}

}
