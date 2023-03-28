package fase06.cap02.e;

public class String8 {

	public static void main(String[] args) {
		
		String nome = new String ("Ma�a");
		String nome2 = new String("ma�a");
		String nome3 = new String ("Ma�a");
		
		System.out.println(nome.equals(nome2)); //False
		System.out.println(nome.equals(nome3)); //True
		System.out.println(nome.equalsIgnoreCase(nome2)); // True
		
		// Da falso pois o perador == nao compara o valor e sim o local de memoria
		boolean teste = (nome == nome3);
		System.out.println(teste); //False
		
		// N�o estancia por isso da verdadeiro
		String nome4 = "ma�a";
		String nome5 = "ma�a";
		teste = (nome4 == nome5);
		System.out.println(teste); // True
		

	}

}
