package com.dio.bootcampjava.calculator;

import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);
	static Calculadora calculadora = new Calculadora();

	public static void main(String[] args) {

		int opcao = 0;
		double nbr1, nbr2, result;
		while (opcao != 5) {
			System.out.println("==========CALCULADORA==========");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Sair");
			opcao = teclado.nextInt();
			if (opcao != 5) {
				System.out.println("Informe o primeiro valor: ");
				nbr1 = teclado.nextDouble();
				System.out.println("Informe o segundo valor: ");
				nbr2 = teclado.nextDouble();
				switch (opcao) {
				case 1:
					result = calculadora.soma(nbr1, nbr2);
					System.out.printf("%.2f + %.2f = %.2f\n", nbr1, nbr2, result);
					break;
				case 2:
					result = calculadora.subtrai(nbr1, nbr2);
					System.out.printf("%.2f - %.2f = %.2f\n", nbr1, nbr2, result);
					break;
				case 3:
					result = calculadora.multiplica(nbr1, nbr2);
					System.out.printf("%.2f * %.2f = %.2f\n", nbr1, nbr2, result);
					break;
				case 4:
					result = calculadora.divide(nbr1, nbr2);
					System.out.printf("%.2f / %.2f = %.2f\n", nbr1, nbr2, result);
					break;
				}
			}
		}
	}
}
