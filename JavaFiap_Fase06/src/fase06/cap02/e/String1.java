package fase06.cap02.e;

public class String1 {

	public static void main(String[] args) {
		
		
		// Formas de declarar uma String:
		
		//Forma 1:
		String nome;
		nome = new String();
		nome = "Maçã";
		System.out.println(nome);
		
		System.out.println();
		
		//Forma 2:
		String nome2 = new String ("Maçã");
		System.out.println(nome2);
		
		System.out.println();
		
		//Forma 3:  (Não instancia os dados, os dados ficam guardados na memorial pool e nao uma área pr[pria.)
		String nome3 = "Maçã";
		System.out.println(nome3);
		
		// Forma 4
		/* Erro forçado (Não compila)
		
		String nome4;
		System.out.println(nome4.lent);
		
		*/
		
		String nome4 = null;
		System.out.println(nome4.length());
		
		// Vai dar erro na execução.
		
		
		
	}

}
