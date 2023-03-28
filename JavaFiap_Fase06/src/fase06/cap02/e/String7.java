package fase06.cap02.e;

public class String7 {

	public static void main(String[] args) {
		
		String nome = "FIAP";
		String nome2 = new String("FIAP");

		// Se uma das string foi instanciada elas já se encontram em locais
		// de memorias diferentes por isso p/ comparar string melhor utilizar os métodos de String
		if (nome == nome2){
		  System.out.println("As Strings são iguais.");
		}else{
		  System.out.println("As Strings são diferentes.");
		  
		// Comparando se é diferente
		String nome3 = "FIAP";
		String nome4 = new String("FIAP");
		
		if (!nome3.equals(nome4)){
			System.out.println("As Strings são diferentes.");
			}else{
				System.out.println("As Strings são iguais.");
				}
		 	  
		}
		

	}

}
