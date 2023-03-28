package fase06.cap02.h;

import java.util.ArrayList;

public class CollectionA {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		lista.add("LTP");
		lista.add("Web");
		lista.add("Algoritmos");
		System.out.println(lista);
		
		lista.set(1, "Algoritmos");
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);

		
		System.out.println(lista.get(1));
		
		
		System.out.println();
		
		ArrayList lista2 = new ArrayList();
		lista2.add("LTP");
		lista2.add("Web");
		lista2.add("Algoritmo");
		System.out.println(lista2);
		for (int i = 0; i < lista2.size(); i++) {
		  System.out.println(lista2.get(i));
		}
		
		
		System.out.println();
		int indice = lista2.indexOf("Web");
		System.out.println("O valor \"Web\" está na posição: " + indice);
		
	}

}
