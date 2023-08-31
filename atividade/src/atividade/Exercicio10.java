package atividade;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual seu salário fixo? ");
		double salarioFixo = teclado.nextInt();
		
		System.out.println("Qual o valor da suas vendas este mês para cálculo da comissão? ");
		
		float comissao = teclado.nextInt();
		
		if( comissao <= 1500) {
			 double salariofinal = (comissao * 0.03) + salarioFixo;
			 System.out.println("Seu salário total do mês é " + salariofinal);
		} else if(comissao > 1500) {
			double salariofinal = (comissao * 0.05) + salarioFixo;
			 System.out.println("Seu salário total do mês é " + salariofinal);
		}
		teclado.close();
	}

}
