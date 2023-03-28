package fase06.cap02.g;

import java.util.ArrayList;

public class TestCollectionsA {

	public static void main(String[] args) {
		
		ArrayList carrinho = new ArrayList ();  
		Double valor = 10.55;
		int valor2 = 1;
		int valor3;
		
		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);
		
		System.out.println(carrinho.get(0));
		System.out.println(carrinho.get(1));
		System.out.println(carrinho.get(2));
		
		// Foi necessário usar cast 
		valor3 = (int) carrinho.get(2);
		System.out.println(valor3);
		
	}

}
