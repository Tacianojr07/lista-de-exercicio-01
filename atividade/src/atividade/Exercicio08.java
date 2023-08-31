package atividade;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o horário que se iniciou a partida de xadrez (Sem os minutos): ");
		int horaInicio = teclado.nextInt();
		
		System.out.println("Digite o horário que terminou a partida: ");
		int horaTermino = teclado.nextInt();
		teclado.close();
		
		int duracaoJogo;
		
		if (horaInicio < horaTermino) {
			duracaoJogo = horaTermino - horaInicio;
		} else if(horaInicio == horaTermino) {
			duracaoJogo = 24;
		} else {
			duracaoJogo = (24 - horaInicio) + horaTermino;
		}
		
		System.out.println("O jogo durou " + duracaoJogo + " horas" );
		
		
		
	}

}
