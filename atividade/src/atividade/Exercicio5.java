package atividade;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();
        
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        
        
        int idade = anoAtual - anoNascimento;
        
        
        if (idade >= 16) {
            System.out.println("Você pode votar este ano!");
        } else {
            System.out.println("Você não pode votar este ano.");
        }
        
        teclado.close();
	}

}
