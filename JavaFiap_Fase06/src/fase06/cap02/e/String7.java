package fase06.cap02.e;

public class String7 {

	public static void main(String[] args) {
		
		String nome = "FIAP";
		String nome2 = new String("FIAP");

		// Se uma das string foi instanciada elas j� se encontram em locais
		// de memorias diferentes por isso p/ comparar string melhor utilizar os m�todos de String
		if (nome == nome2){
		  System.out.println("As Strings s�o iguais.");
		}else{
		  System.out.println("As Strings s�o diferentes.");
		  
		// Comparando se � diferente
		String nome3 = "FIAP";
		String nome4 = new String("FIAP");
		
		if (!nome3.equals(nome4)){
			System.out.println("As Strings s�o diferentes.");
			}else{
				System.out.println("As Strings s�o iguais.");
				}
		 	  
		}
		

	}

}
