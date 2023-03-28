package oito_cap_b;

public class Teste2 {

	public static void main(String[] args) {
		
		Conta cc1 = new Conta();
		cc1.depositar(1000);
		cc1.retirar(100);
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.depositar(1000);
		cc2.retirar(100);

		Conta cc3 = new ContaCorrente ();
		cc3.depositar(1000);
		cc3.retirar(100);;
		
		System.out.println("cc1: " + cc1.getSaldo());
		System.out.println("cc2: " + cc2.getSaldo());
		System.out.println("cc3: " + cc3.getSaldo());
		
	}
}
