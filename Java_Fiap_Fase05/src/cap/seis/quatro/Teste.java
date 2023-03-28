package cap.seis.quatro;

public class Teste {
	

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta(100, 7647, 1306899);
		
		System.out.println(contaCorrente.getSaldo() );
		System.out.println(contaCorrente.getAgencia());
		System.out.println(contaCorrente.getNumeroConta());
		
		
		System.out.println("");
		
		
		contaCorrente.depositar(100);
		System.out.println(contaCorrente.getSaldo());
		
		
		System.out.println("");
		
		
		contaCorrente.retirar(1000);
		System.out.println(contaCorrente.getSaldo());

		System.out.println("");
		
		Conta cc = new Conta ();
		cc.depositar(100);
		cc.setAgencia(1258);
		cc.setNumeroConta(127896);
		
		cc.depositar(1000);
		
		System.out.println(cc.getSaldo());
		
		cc.retirar(500);
		
		System.out.println(cc.getSaldo());
		
		
	}
	

}
