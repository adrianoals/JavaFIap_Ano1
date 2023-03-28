package fase06.cap02.e;

public class String6 {

	public static void main(String[] args) {
		
		String nome = "FIAP";
		String nome2 = "FIAP";

		
		// Nesse caso como não instanciou as strings os valores são alocados em memória pool 
		if (nome == nome2){
		  System.out.println("As Strings são iguais.");
		}else{
		  System.out.println("As Strings são diferentes.");
		}

	}

}
