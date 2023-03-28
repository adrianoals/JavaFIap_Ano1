package fase06.cap02.e;

public class String9 {

	public static void main(String[] args) {
		
		String descricao = new String("Maça Gala, a maçã mais doce do mercado!");
		
		// tamanho da string
		System.out.println(descricao.length());
		
		// Começa com
		System.out.println(descricao.startsWith("Maça"));
		
		// Termina com
		System.out.println(descricao.endsWith("!"));
		
		// Traz o caractere do índice
		System.out.println(descricao.charAt(1));

		//Traz o indice da possição do caractere
		System.out.println(descricao.indexOf("G"));
		System.out.println(descricao.indexOf("a"));
		
		// Traz o ínicio de onde se encontra a palavra Gala
		System.out.println(descricao.indexOf("Gala"));
		
		// Traz o indice da posição da ultima vez que aparece esse caractere
		System.out.println(descricao.lastIndexOf("a"));

	}

}
