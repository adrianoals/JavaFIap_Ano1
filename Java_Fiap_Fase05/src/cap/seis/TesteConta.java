package cap.seis;

// Instanciando uma Classe

public class TesteConta {

	public static void main(String[] args) {
	
		
		Conta contaCorrente = new Conta(100);
		Conta contaPoupanca = new Conta(100);
		Conta contaInvestimento = new Conta(100);
		
		
	
		
		contaCorrente.numero = 11;
		//contaCorrente.saldo = 150.58;
		contaCorrente.cliente.nome = "Z� do Caix�o";
		contaCorrente.cliente.idade = 55;
		
		contaPoupanca.numero = 111;
		contaPoupanca.saldo = 1000;
		contaPoupanca.cliente.nome = "Jobson";
		contaPoupanca.cliente.idade = 38;
		
		contaInvestimento.numero = 2014;
		contaInvestimento.saldo = 789.49;
		contaInvestimento.cliente.nome = "Severino";
		contaInvestimento.cliente.idade = 19;
		contaInvestimento.agencia = 3458;
		
		System.out.println(contaCorrente);
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente);
		System.out.println(contaCorrente.cliente.nome);
		
		
		// Testando m�todos
		System.out.println(contaInvestimento.recuperarSaldo());
		contaInvestimento.depositar(500);
		System.out.println(contaInvestimento.recuperarSaldo());
		
		// Sobrecarga de M�todos
		contaInvestimento.retirar(50);
		System.out.println(contaInvestimento.recuperarSaldo());
		// M�todo que usa this
		System.out.println(contaInvestimento.agencia);
		contaInvestimento.setAgencia(4589);
		System.out.println(contaInvestimento.agencia);
		
		
	}

}

