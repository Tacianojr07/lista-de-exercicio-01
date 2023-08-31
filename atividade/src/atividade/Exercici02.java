package atividade;

import java.util.Scanner;

public class Exercici02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		int valor = teclado.nextInt();
		
		if(valor >= 0) {
			System.out.println("O valor que você digitou é positivo: " + valor);
		} else if ( valor < 0) {
			System.out.println("O valor digitado é negativo " + valor);
		}
		teclado.close();
		
	}
}
