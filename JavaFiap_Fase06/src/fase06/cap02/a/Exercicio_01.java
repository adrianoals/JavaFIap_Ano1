package fase06.cap02.a;

import java.util.Scanner;

/*
 * Exercício elabore um programa para ler 3 valores inteiros fornecidos pelo
 * usuário e calcular a soma deles. Apresente o resultado final.
 * 
 */

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		int soma = 0;
		
		int i = 1;
		
		do {
			System.out.println("Digite um número ");
			
			numero = sc.nextInt();
			
			soma = numero + soma;
			
			i++;
		}while (i<=3);
		
		System.out.println("A soma é: " + soma);
		
		
		sc.close();
	}
	
}
