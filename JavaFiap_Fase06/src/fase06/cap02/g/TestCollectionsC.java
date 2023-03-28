package fase06.cap02.g;

import java.util.HashSet;
import java.util.Set;

public class TestCollectionsC {

	public static void main(String[] args) {
		
		
		Set<String> cesta = new HashSet<String>();
		
		System.out.println(cesta.isEmpty());
		cesta.add("Maça");
		cesta.add("Maça");
		cesta.add("maça");
		System.out.println(cesta.isEmpty());
		
		System.out.println(cesta.size());
		System.out.println(cesta);
		
		// A classe HashSet não permite lementos duplicados 

	}

}
