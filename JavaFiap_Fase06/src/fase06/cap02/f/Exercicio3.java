/*
 * Dado um texto contendo somente palavras por caracteres em branco, terminando em ponto final,
 * escreva apenas palavras distintas existentes no texto.
 * 
 * 	Texto = "EU SOU MAIS EU ENQUANTO EU SOU EU." 
 * 
 *  Resposta = "EU SOU MAIS ENQUANTO"
 */


package fase06.cap02.f;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String texto = new String ("EU SOU MAIS EU ENQUANTO EU SOU EU.");
		
		String texto1 = texto.substring(texto.indexOf("EU SOU MAIS"), texto.indexOf("EU ENQUANTO EU SOU EU."));
		
		System.out.println(texto1);
		
		String texto2 = texto.substring(texto.indexOf("ENQUANTO"),texto.indexOf("EU SOU EU"));
		System.out.println(texto2);

	String resultado = texto1 + "" + texto2;
	System.out.println(resultado);
	
	}

}
