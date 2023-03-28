package fase06.cap02.g;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionsB {

	public static void main(String[] args) {
		//Interface List e uso de Generics
		// Generics não permite tipos primitivos

		List<String> carrinho = new ArrayList<String>();

		System.out.println(carrinho.isEmpty());

		carrinho.add("Maça");
		carrinho.add("Morango");
		carrinho.add("Maça");
		carrinho.set(1, "Pera");

		System.out.println(carrinho.isEmpty());
		System.out.println(carrinho.size());

		System.out.println(carrinho.get(0));
		System.out.println(carrinho.get(1));
		System.out.println(carrinho.get(2));
		//System.out.println(carrinho.get(3)); //Vai dar exception

		System.out.println();

		// Informa se a variavel contem
		System.out.println(carrinho.contains("Maça"));
		// Informa o primeiro indice que aparece 
		System.out.println(carrinho.indexOf("Maça"));
		//Retorna o valor 
		System.out.println(carrinho.get(carrinho.indexOf("Maça")));
		//Retorna o ultimo indice
		System.out.println(carrinho.lastIndexOf("Maça"));

		//Remove um intem de tal indice
		carrinho.remove(carrinho.indexOf("Maça"));
		System.out.println(carrinho.get(0));

		// Limpa a lista
		carrinho.clear();
		System.out.println(carrinho.isEmpty());

	}

}
