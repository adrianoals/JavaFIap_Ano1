package fase06.cap02.e;

public class String6 {

	public static void main(String[] args) {
		
		String nome = "FIAP";
		String nome2 = "FIAP";

		
		// Nesse caso como n�o instanciou as strings os valores s�o alocados em mem�ria pool 
		if (nome == nome2){
		  System.out.println("As Strings s�o iguais.");
		}else{
		  System.out.println("As Strings s�o diferentes.");
		}

	}

}
