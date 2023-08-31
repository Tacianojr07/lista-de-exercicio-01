package atividade;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantas maças você deseja comprar?");
		
		int qtdMaca = teclado.nextInt();
		teclado.close();
		
		if (qtdMaca >= 12) {
			int valorFinal = qtdMaca * 1;
			System.out.println("Você comprou " + qtdMaca + " maças e o valor da compra deu R$" + valorFinal);
			
		} else {
			float valorFinal = (float) (qtdMaca * 1.30);
			System.out.println("Você comprou " + qtdMaca + " maças e o valor da compra deu R$ " + valorFinal);
		}
	}
}
