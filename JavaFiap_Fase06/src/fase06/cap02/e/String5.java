package fase06.cap02.e;

public class String5 {

	public static void main(String[] args) {
		
		String nome = new String("FIAP");
		String nome2 = new String("FIAP");

		
		//O operador == compara o endere�o de mem�ria nesse caso � diferente pois quando se 
		// estancia uma string ela fica alocada em local de memoria
		
		if (nome == nome2){
		  System.out.println("As Strings s�o iguais.");
		}else{
		  System.out.println("As Strings s�o diferentes.");
		}
		
		

	}

}
