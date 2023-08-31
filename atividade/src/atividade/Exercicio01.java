package atividade;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = teclado.nextInt();
		
		if (valor > 10) {
			System.out.println("O valor que você digitou é maior que também " + valor);
		} else if (valor < 10) {
			System.out.println("O valor que você digitou é menor que 10 " + valor);
		}
		teclado.close();

	}

}
