package oito_cap_b;

public class Teste {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(1245);
		cc.setNumeroConta(123456789);
		cc.setTipo("Pessoa Física");
		cc.setChequeEspecial(1000);
		cc.depositar(500.45);
		cc.retirar(100);
		cc.setChequeEspecial(1000);
		
		System.out.println(cc.getAgencia());
		System.out.println(cc.getNumeroConta());
		System.out.println(cc.getTipo());
		System.out.println(cc.getChequeEspecial());
		System.out.println(cc.getSaldo());
		System.out.println(cc.getSaldoDisponivel());
		
		System.out.println();
		
		
		//Só acessa os métodos da Superclasse
		Conta cc2 = new ContaCorrente();
		cc2.setAgencia(12456);
		cc2.setNumeroConta(12456);
		cc2.getAgencia();
		cc2.getNumeroConta();
		
		//Down Cast (Agora acessa os métodos e atributos da subclasse)
		
		ContaCorrente cc3 = (ContaCorrente) cc2;
		cc3.setChequeEspecial(500);
		cc3.setTipo("Conta Física");
		System.out.println(cc3.getAgencia());
		System.out.println(cc3.getNumeroConta());
		System.out.println(cc3.getSaldoDisponivel());
		
		System.out.println();
		
		
		/*
		Não possível fazer Downcast no caso abaixo
		
		Conta conta = new Conta();
		
		ContaCorrente cc4 = (ContaCorrente) conta; // da um erro de exceção 
		no terminal
		
		Para identificar se a variável  é uma Estancia daquele objeto 
		que se espera, usa a função Instanceof 
		
	*/
		
		Conta conta = new Conta();
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente c4 = (ContaCorrente) conta;
			} else {
				System.out.println("Não é instancia");
			}
		
		
		
		
		
		
	}
	
	


}
