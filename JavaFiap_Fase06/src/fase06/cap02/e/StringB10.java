package fase06.cap02.e;

import java.util.Arrays;

public class StringB10 {

	public static void main(String[] args) {
		

		String descricao = new String ("Ma�a Gala, a ma�a mais doce do mercado!");
		
		System.out.println(descricao.replace("G", "g"));
		System.out.println(descricao.replace("Gala", "Fuji"));
		System.out.println(descricao.replace("a", "A"));
		
		// M�todo String quebra a String e o m�todo length o resultado dessa quebra
		System.out.println(descricao.split(" ").length);
		System.out.println(Arrays.toString(descricao.split(" ")));
		

	}

}
