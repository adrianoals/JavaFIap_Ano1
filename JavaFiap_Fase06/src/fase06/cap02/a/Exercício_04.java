package fase06.cap02.a;

/*
 * Elabore um programa que leia o nome e o salário de n pessoas, o usuário 
 * deverá informar se deseja continuar a iteração. Ao final, apresente a 
 * quantidade de pessoas informadas e a média entre os sálarios.
 */

import java.util.Scanner;

public class Exercício_04 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String opcão;
		String nome;	
		int qtdPessoas = 0;
		double aux;
		double salario = 0;
		double media;
		double soma = 0;
		
		
		do {
		  System.out.print("Informe seu nome: ");
		  
		  nome = sc.next();
		  
		  System.out.print("Informe seu salário: ");
		  
		  aux = soma;
		  
		  salario = sc.nextInt();
		  
		  soma = salario + aux;
		  
		  qtdPessoas++;
		  
		  media = (aux + salario) / qtdPessoas;
		  
		  System.out.println("Deseja continuar? ");
		  opcão = sc.next();
		
		} while(opcão.equals("S"));
		
		System.out.println(qtdPessoas);
		System.out.println(media);
		
		sc.close();

	}

}
