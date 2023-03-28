package cap.cinco.q.entrada.e.saida;

// Entrada e Saida 1

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a idade: ");
		int idade = sc.nextInt();
		System.out.print("Informe o preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Informe o seu peso: ");
		float peso = sc.nextFloat();
		System.out.println("Peso informado: " + peso);
		
		
		
		sc.close();
		

	}

}
