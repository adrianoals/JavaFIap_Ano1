package cap.seis.dois;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta(100, 3526, 127896);
		
		
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.agencia);
		System.out.println(contaCorrente.numeroConta);
		
		
		System.out.println("");
		
		
		contaCorrente.depositar(100);
		System.out.println(contaCorrente.saldo);
		
		
		System.out.println("");
		
		contaCorrente.saldo = 1000;
		System.out.println(contaCorrente.saldo);
		contaCorrente.retirar(1000);
		System.out.println(contaCorrente.verificarSaldo());

	}

}
