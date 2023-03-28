package cap.seis.dois;

public class Conta {
	
	double saldo;
	int agencia;
	int numeroConta;
	
	//M�todo Construtor
	public Conta() {
		
	}
	
	//M�todo Construtor com 3 argumentos
	
	public Conta (double saldo, int agencia, int numeroConta) {
		
		this.saldo = saldo;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
				
	}
	
	
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	public double verificarSaldo() {
		return saldo;
		
	}
}
