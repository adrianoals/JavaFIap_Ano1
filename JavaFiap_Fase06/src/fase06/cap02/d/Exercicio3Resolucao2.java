/*
 * Escreva um programa para armazenar em uma matriz as notas das 5 diciplinas 
 * dos 20 alunos de uma turma
 */

package fase06.cap02.d;

import java.util.Scanner;

public class Exercicio3Resolucao2 {

	public static void main(String[] args) {
		
		float [] [] notas = new float [5][20];
		
		Scanner notaAluno = new Scanner (System.in);
		
		System.out.println(notas.length);
		System.out.println(notas[0].length);
		
		System.out.println();
		
		int i = 0;
		
		while (i < notas.length) {
			
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Iforme a nota da disciplina: " + i +" do aluno: " + j );
			}
			
			i++;
			
		}
		
		
	}

}
