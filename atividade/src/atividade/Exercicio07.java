package atividade;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor01 = teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor02 = teclado.nextInt();
		
		while(valor01 == valor02) {
			System.out.println("Por favor, insira um número diferente do primeiro");
			System.out.println("Digite o segundo valor: ");
			valor02 = teclado.nextInt();
		}
		if( valor01 < valor02) {
			System.out.println("Em ordem crescente: " + valor01 + " , " + valor02);
		} else {
			System.out.println("Em ordem crescente: " + valor02 + " , " + valor01);
		}
		teclado.close();
	}
	

}
