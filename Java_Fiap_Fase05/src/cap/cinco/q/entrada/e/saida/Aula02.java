package cap.cinco.q.entrada.e.saida;

//Entrada e Saida 2

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = sc.nextInt();

		int soma = numero1 + numero2;
		System.out.println("A soma �: " + soma);

		int resto = soma % 2;
		if (resto == 0){
			System.out.println("A soma � par");
		}else{
			System.out.println("A soma � �mpar");
		}

		sc.close();
		
		
	}

}
