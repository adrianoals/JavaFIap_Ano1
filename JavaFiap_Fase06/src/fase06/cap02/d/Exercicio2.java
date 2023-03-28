// Exercício 2

/*
 * Escreva um programa para preencher uma matriz unidimenisonal (vetor) que
 * deverá receber as temperaturas ao longo do dia. A medição precisa ser registrada
 * a cada uma hora. Ao final exiba a média do dia. 
 * 
 */

package fase06.cap02.d;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner informaTemp = new Scanner (System.in);
		
		float [] temperatura = new float [5];
		
		for(int i=0; i<temperatura.length; i++) {
			  System.out.println("Digite a temperatura da hora: ");
			  temperatura[i] = informaTemp.nextFloat(); 
			}
		
		informaTemp.close();
		
		float totalTemp = 0;
		
		for(int i=0;i<temperatura.length;i++) {
			  totalTemp = totalTemp + temperatura[i];
			}
			
			float mediaTemp = totalTemp/temperatura.length;
			System.out.println("A média da temperatura é: " + mediaTemp);
		
		
	}

}
