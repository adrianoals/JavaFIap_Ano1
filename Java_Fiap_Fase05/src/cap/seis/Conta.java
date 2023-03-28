package cap.seis;

public class Conta {
	
	int numero;
	double saldo;
	int agencia;
	
	Cliente cliente = new Cliente();
	
	
	//Método Construtor
	public Conta (double valor) {
		saldo = valor;
		System.out.println("criando uma estancia de conta");
	}
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar (double valor) {
		saldo = saldo + valor;
	}

	public void retirar (double valor) {
		saldo = saldo - valor;
	}
	

	public void retirar (double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
	public void setAgencia (int agencia) {
		this.agencia = agencia;
	}
	
}
