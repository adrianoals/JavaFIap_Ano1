package fase06.cap02.c;

//Formas de criar Arrays

public class Notas {

	public static void main(String[] args) {
		
		//Forma 1:
		int[] notas = new int [40];
		
		notas [0] = 10; 
		
		System.out.println(notas[0]);
		
		System.out.println();
		
		
		// Forma 1:
		int notas2[] = new int[4];
		notas2[0] = 10;
		notas2[1] = 9;
		notas2[2] = 8;
		notas2[3] = 2;
		
		for (int i = 0; i < notas2.length; i++) {
			System.out.println(notas2[i]);
		}
		
		System.out.println();
		
		
		// Forma 2
		int notas3 [] = {10, 9, 8,2};
		
		for (int i = 0; i < notas3.length; i++) {
			System.out.println(notas3[i]);
		}
		
		System.out.println();
		
	
		//Forma 3
		int notas4 [] = new int[] {10,9,8,2};
	
		for (int i = 0; i < notas4.length; i++) {
			System.out.println(notas4[i]);
		}

		System.out.println();
		
		// For Each
		int notas5 [] = {11, 9, 5, 6};
		
		for (int nota : notas5){
			  System.out.println(nota);
			}
		
	
	
	}
}
