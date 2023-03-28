package fase06.cap02.e;

public class String5 {

	public static void main(String[] args) {
		
		String nome = new String("FIAP");
		String nome2 = new String("FIAP");

		
		//O operador == compara o endereço de memória nesse caso é diferente pois quando se 
		// estancia uma string ela fica alocada em local de memoria
		
		if (nome == nome2){
		  System.out.println("As Strings são iguais.");
		}else{
		  System.out.println("As Strings são diferentes.");
		}
		
		

	}

}
