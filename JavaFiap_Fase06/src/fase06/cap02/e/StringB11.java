package fase06.cap02.e;

public class StringB11 {

	public static void main(String[] args) {
		
		String descricao = new String ("Ma�a Gala, a ma�a mais doce do mercado!");
		
		// Transforma a string em minusculo
		System.out.println(descricao.toLowerCase());
		
		// Transforma a string em maiusculo
		System.out.println(descricao.toUpperCase());
		
		// pega o treco do indice 0 at� o indice 4
		System.out.println(descricao.substring(0, 4));
		
		// Pega a partir do indice 4 at� o final
		System.out.println(descricao.substring(4));
		
		System.out.println(descricao.substring(descricao.indexOf("Ma�a"),descricao.indexOf(" ")));
		
		System.out.println(descricao);
		
		
	}

}
