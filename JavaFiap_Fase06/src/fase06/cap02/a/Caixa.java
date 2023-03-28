package fase06.cap02.a;

public class Caixa {

	public static void main(String[] args) {
		
		int qtdProdutos = 5;
		int registros = 0;
		
		/* loop while
		while (registros < qtdProdutos) {
			registros++;
			System.out.println("O produto de número: " + registros + " foi registrado.");
		}  */
		
		//loop do while
		
		do {
			registros++;
			System.out.println("O caixa registrou o produto " + registros);
		} while (registros < qtdProdutos);
		
		
		System.out.println("");
		
		
		//Loop For
		
		for(int i =1; i <= qtdProdutos; i++) {
			System.out.println("O caixa registrou o produto " + i);
		}
		
		
		
		
	}

}
