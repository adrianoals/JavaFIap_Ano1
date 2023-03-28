package fase06.cap02.a;

/*
 * Elabore um programa que calcule a sequencia de Fibonacci até o 30° termo;
 * A sequência obedece o seguinte padrão: 1, 1, 2, 3, 5... n.  
 */


public class Exercício_03 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 0;
		int aux;

		
		for (int i = 0; i < 30; i++) {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
		}
		
	}

}
