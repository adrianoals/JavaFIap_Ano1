/*
 * Escreva um programa para armazenar em uma matriz as notas das 5 diciplinas 
 * dos 20 alunos de uma turma
 */


package fase06.cap02.d;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float [] [] notas = new float [5][20];
		
		Scanner notaAluno = new Scanner (System.in);
		
		System.out.println(notas.length);
		System.out.println(notas[0].length);
		
		
		//for (int i = 0; i<notas.length; i++);{
			
		for (int j = 0; j <notas[0].length; j++) {
			System.out.println("Informe a nota do aluno " + j +" na disciplina 1 ");
			notas[0][j] = notaAluno.nextFloat();

		}
		
		for (int j = 0; j <notas[1].length; j++) {
			System.out.println("Informe a nota do aluno " + j +" na disciplina 2 " );
			notas[1][j] = notaAluno.nextFloat();

		}
		
		for (int j = 0; j <notas[1].length; j++) {
			System.out.println("Informe a nota do aluno " + j +" na disciplina 3 " );
			notas[2][j] = notaAluno.nextFloat();

		}
		
		for (int j = 0; j <notas[1].length; j++) {
			System.out.println("Informe a nota do aluno " + j +" na disciplina 4 " );
			notas[3][j] = notaAluno.nextFloat();

		}
		
		for (int j = 0; j <notas[1].length; j++) {
			System.out.println("Informe a nota do aluno " + j +" na disciplina 5 " );
			notas[4][j] = notaAluno.nextFloat();

		}
		
		
		}
		
		
	}
	
