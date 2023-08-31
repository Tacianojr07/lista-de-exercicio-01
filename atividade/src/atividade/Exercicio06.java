package atividade;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor01 = teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor02 = teclado.nextInt();
		
		if(valor01 != valor02 && valor01 > valor02) {
			System.out.println("O primeiro valor que você digitou é maior que o segundo " + valor01);
		} else if(valor02 != valor01 && valor02 > valor01) {
			System.out.println("O segundo valor que você digitou é maior que o primeiro " + valor02);
		} else if (valor01 == valor02) {
			System.out.println("Os valores digitados são iguais ");
		}
		
		teclado.close();
		
		
	}

}
