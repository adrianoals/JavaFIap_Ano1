package fase06.cap02.e;

public class String3 {

	public static void main(String[] args) {
		
		String nome = new String ("Maçã");
		String descricao = new String();
		descricao = "tipo Gala, a Maçã mais doce do mercado";
		
		// Concatenando com +
		String propaganda = nome + " " + descricao;
		System.out.println(propaganda);
		
		// Usando .concat
		propaganda = nome.concat(" ").concat(descricao);
		System.out.println(propaganda);
		
		// Usando +=
		propaganda += "!";
		System.out.println(propaganda);
	}

}
