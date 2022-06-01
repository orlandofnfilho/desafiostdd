package br.com.gft.desafiostdd;

import java.util.Scanner;

import br.com.gft.desafiostdd.desafio01.main.Desafio01;
import br.com.gft.desafiostdd.desafio02.main.Desafio02;
import br.com.gft.desafiostdd.desafio03.main.Desafio03;
import br.com.gft.desafiostdd.desafio07.main.Desafio07;

public class App {

	public static void printMenu(String[] options) {
		for (String option : options) {
			System.out.println(option);
		}
		System.out.print("Escolha o desafio: ");
	}

	public static void main(String[] args) {
		String[] options = { "1- Desafio 1", "2- Desafio 2", "3- Desafio 3", "4- Desafio 7", "5- Sair" };
		Scanner scanner = new Scanner(System.in);
		int option = 1;
		while (option != 5) {
			printMenu(options);
			try {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					option1();
					System.out.println();
					break;
				case 2:
					option2();
					System.out.println();
					break;
				case 3:
					option3();
					System.out.println();
					break;
				case 4:
					option4();
					System.out.println();
					break;
				case 5:
					System.out.println("Terminado");
					break;
				}
			} catch (Exception ex) {
				System.out.println("Porfavor entre um valor entre 1 e " + options.length);
				scanner.next();
			}
		}
	}

	private static void option1() {
		Desafio01.main(null);
	}

	private static void option2() {
		Desafio02.main(null);
	}

	private static void option3() {
		Desafio03.main(null);
	}

	private static void option4() {
		Desafio07.main(null);
	}

}
