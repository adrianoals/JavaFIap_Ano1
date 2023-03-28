package fase06.cap02.a;

/*
 * Elabore um programa para fazer a tabuada de um numero fornecido pelo usu�rio, 
 * variando de 0 a 12, e mostre o resultado da itera��o
 */

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner taboada = new Scanner (System.in);
		
		System.out.println("Informe um n�mero para exibirmos a taboada:  ");
		
		int numero = taboada.nextInt();
		
		
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println("A taboada de " + numero + " x " + i +" � igual a " + resultado);
		}
		 
		taboada.close();

	}

}
