package fase06.cap02.e;

public class String9 {

	public static void main(String[] args) {
		
		String descricao = new String("Ma�a Gala, a ma�� mais doce do mercado!");
		
		// tamanho da string
		System.out.println(descricao.length());
		
		// Come�a com
		System.out.println(descricao.startsWith("Ma�a"));
		
		// Termina com
		System.out.println(descricao.endsWith("!"));
		
		// Traz o caractere do �ndice
		System.out.println(descricao.charAt(1));

		//Traz o indice da possi��o do caractere
		System.out.println(descricao.indexOf("G"));
		System.out.println(descricao.indexOf("a"));
		
		// Traz o �nicio de onde se encontra a palavra Gala
		System.out.println(descricao.indexOf("Gala"));
		
		// Traz o indice da posi��o da ultima vez que aparece esse caractere
		System.out.println(descricao.lastIndexOf("a"));

	}

}
