package fase06.cap02.c;

import java.util.Scanner;

public class Notas2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[] notas = new float[10];
		
		for(int i=0; i<notas.length; i++) {
		  System.out.println("Digite a nota do aluno: ");
		  notas[i] = sc.nextFloat();
		}
		sc.close();

		System.out.println();
		
		// Calcular a m�dia dos alunos
		float totalNotas = 0;
		
		for(int i=0;i<notas.length;i++) {
		  totalNotas = totalNotas + notas[i];
		}
		
		float mediaNotas = totalNotas/notas.length;
		System.out.println("A m�dia dos alunos � " + mediaNotas);
		
	}

}
