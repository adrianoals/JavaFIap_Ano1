package cap.cinco.q.entrada.e.saida;

//Leitura de Dados

import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
	
		int idade = 10;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		
		if (idade >= 18) {
			System.out.println("Maior idade");
		} else if (idade == 18) {
			System.out.println("Acabou de ser maior de idade.");
		}else {	
			System.out.println("Menor idade");
		}
	
	}

}
