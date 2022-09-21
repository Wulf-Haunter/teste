package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.print("Digite o valor de A: ");
		a= scan.nextInt();
		System.out.print("Digite o valor de B: ");
		b= scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println("Soma " + soma);
		System.out.println("subtracao "+subtracao);
		System.out.println("multiplicacao "+multiplicacao);
		System.out.println("divisao "+divisao);
		

	}
	

	public static int soma (int a, int b) {
		return a + b;
	}
	public static int subtracao (int a,int b) {
		return a - b;
	}
	public static int divisao (int a, int b) {
		return a / b;
	}
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
}
