package fase06.cap02.a;

import java.util.Scanner;

/*
 * Exerc�cio elabore um programa para ler 3 valores inteiros fornecidos pelo
 * usu�rio e calcular a soma deles. Apresente o resultado final.
 * 
 */

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		int soma = 0;
		
		int i = 1;
		
		do {
			System.out.println("Digite um n�mero ");
			
			numero = sc.nextInt();
			
			soma = numero + soma;
			
			i++;
		}while (i<=3);
		
		System.out.println("A soma �: " + soma);
		
		
		sc.close();
	}
	
}
