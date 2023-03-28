package fiap.cap06ePolimorfismo;

public class Test {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		try {
			cc.sacar(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

	}

}
