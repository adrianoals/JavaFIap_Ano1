package fase06.cap02.h;

import java.util.ArrayList;

public class GenericsA {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();

		Aluno aluno = new Aluno();

		lista.add("FIAP"); //String
		lista.add(2); //Integer
		lista.add(aluno); //Aluno
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
		int valor2 = (int)lista.get(1);
		System.out.println(valor2);
		
		
	}

}
