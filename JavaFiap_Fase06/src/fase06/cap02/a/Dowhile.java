package fase06.cap02.a;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String opc�o;
		
		do {
		  System.out.print("Digite um numero: ");
		  
		  int n1 = sc.nextInt();
		  
		  System.out.print("Digite outro numero: ");
		  
		  int n2 = sc.nextInt();
		  
		  int soma = n1 + n2;
		  
		  System.out.println("A soma � " + soma);
		  
		  System.out.println("Deseja somar outro numero? (s/n)");
		  
		  opc�o = sc.next();
		} while(opc�o.equals("S"));
		sc.close();
		
		
		
		

	}

}
