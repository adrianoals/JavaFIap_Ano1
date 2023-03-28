package fase06.cap02.e;

public class String8 {

	public static void main(String[] args) {
		
		String nome = new String ("Maça");
		String nome2 = new String("maça");
		String nome3 = new String ("Maça");
		
		System.out.println(nome.equals(nome2)); //False
		System.out.println(nome.equals(nome3)); //True
		System.out.println(nome.equalsIgnoreCase(nome2)); // True
		
		// Da falso pois o perador == nao compara o valor e sim o local de memoria
		boolean teste = (nome == nome3);
		System.out.println(teste); //False
		
		// Não estancia por isso da verdadeiro
		String nome4 = "maça";
		String nome5 = "maça";
		teste = (nome4 == nome5);
		System.out.println(teste); // True
		

	}

}
