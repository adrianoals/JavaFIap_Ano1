package fase06.cap02.e;

public class String1 {

	public static void main(String[] args) {
		
		
		// Formas de declarar uma String:
		
		//Forma 1:
		String nome;
		nome = new String();
		nome = "Ma��";
		System.out.println(nome);
		
		System.out.println();
		
		//Forma 2:
		String nome2 = new String ("Ma��");
		System.out.println(nome2);
		
		System.out.println();
		
		//Forma 3:  (N�o instancia os dados, os dados ficam guardados na memorial pool e nao uma �rea pr[pria.)
		String nome3 = "Ma��";
		System.out.println(nome3);
		
		// Forma 4
		/* Erro for�ado (N�o compila)
		
		String nome4;
		System.out.println(nome4.lent);
		
		*/
		
		String nome4 = null;
		System.out.println(nome4.length());
		
		// Vai dar erro na execu��o.
		
		
		
	}

}
