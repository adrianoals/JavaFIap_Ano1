package fase06.cap02.a;

/*
 * Elabore um programa que leia o nome e o sal�rio de n pessoas, o usu�rio 
 * dever� informar se deseja continuar a itera��o. Ao final, apresente a 
 * quantidade de pessoas informadas e a m�dia entre os s�larios.
 */

import java.util.Scanner;

public class Exerc�cio_04 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String opc�o;
		String nome;	
		int qtdPessoas = 0;
		double aux;
		double salario = 0;
		double media;
		double soma = 0;
		
		
		do {
		  System.out.print("Informe seu nome: ");
		  
		  nome = sc.next();
		  
		  System.out.print("Informe seu sal�rio: ");
		  
		  aux = soma;
		  
		  salario = sc.nextInt();
		  
		  soma = salario + aux;
		  
		  qtdPessoas++;
		  
		  media = (aux + salario) / qtdPessoas;
		  
		  System.out.println("Deseja continuar? ");
		  opc�o = sc.next();
		
		} while(opc�o.equals("S"));
		
		System.out.println(qtdPessoas);
		System.out.println(media);
		
		sc.close();

	}

}
