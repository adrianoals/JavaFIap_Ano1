/*
 * Indique se uma expressão é palindroma;
 * Exemplo "AMOR" e "ROMA" não são palíndromos.
 * "OVO" e "OVO" ou "AMOR ME AMA EM ROMA" e "AMOR ME AMA EM ROMA" são palíndromes. 
 * 
 */

package fase06.cap02.f;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner insiraFrase = new Scanner (System.in);
		
		System.out.println("Insira uma frase: ");
		String frase1 = insiraFrase.next();
		
		System.out.println("Insira uma frase: ");
		String frase2 = insiraFrase.next();
		
		if(frase1.equals(frase2)) {
			System.out.println("São palindromas");
		} else {
			System.out.println("Não são palindromas.");
		}

	}
}