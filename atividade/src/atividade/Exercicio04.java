package atividade;


import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite a sua primeira nota: ");
			float nota01 = teclado.nextFloat();
			
			System.out.println("Digite a sua segunda nota: ");
			float nota02 = teclado.nextFloat();
			
			float notaFinal = (nota01 + nota02) / 2; 
			teclado.close();
			
			if(notaFinal >= 6) {
				System.out.println("Parabéns você foi aprovado " + notaFinal);
			} else {
				System.out.println("Infelizmente você foi reprovado " + notaFinal );
			}
			
			
	}

}
