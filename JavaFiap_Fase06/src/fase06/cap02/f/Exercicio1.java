/*
 * Conidere a string "BANANADA" e combine as intru��es de manipula��o de string para:
 * 
 * - Imprimir ANA usando substr.
 * - Substituir a string "BANANADA" por "BANDA", usando a instru��o delete.
 * - Indicar as posi��es de todos os "A" existentes na palavra "BANANADA"
 * 
 */



package fase06.cap02.f;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String nome = new String ("BANANADA");
		
		
		System.out.println(nome.substring(1,4));
		
		System.out.println(nome.replaceAll("BANANADA", "BANDA"));
		
		int ocorrencia = nome.indexOf("A");
		System.out.println(ocorrencia);
		String nome2 = nome.substring(nome.indexOf("A"));
		System.out.println(nome2);
		
		
		
		

	}

}
