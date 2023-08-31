package atividade;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        double horasSemanais = 40.0;
        double valorHora;
        double horasTrabalhadas;
        double salarioTotal;

        
        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: ");
        valorHora = scanner.nextDouble();

        
        if (horasTrabalhadas <= horasSemanais * 4) {
            salarioTotal = valorHora * horasTrabalhadas;
        } else {
            double horasExtras = horasTrabalhadas - (horasSemanais * 4);
            salarioTotal = (valorHora * horasSemanais * 4) + (horasExtras * valorHora * 1.5);
        }

        System.out.println("O salário total do funcionário é: " + salarioTotal);

        scanner.close();
    








	}

}
