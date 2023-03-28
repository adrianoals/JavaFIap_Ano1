package fase06.cap02.h;

import java.util.HashSet;

public class CollectionB {

	public static void main(String[] args) {
		
		HashSet cursos = new HashSet<>();

		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");

		cursos.add("Java"); //Repetido!

		//Imprime todos os elementos
		System.out.println(cursos);

	}

}
