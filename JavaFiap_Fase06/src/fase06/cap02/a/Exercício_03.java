package fase06.cap02.a;

/*
 * Elabore um programa que calcule a sequencia de Fibonacci at� o 30� termo;
 * A sequ�ncia obedece o seguinte padr�o: 1, 1, 2, 3, 5... n.  
 */


public class Exerc�cio_03 {
	
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
