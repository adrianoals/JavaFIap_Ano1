package fiap.cap06aExceptions;

public class TextExceptions6Conta {

	public static void main(String[] args) {
		// Cria uma nova inst�ncia de Conta
		Conta c = new Conta();
		
		/*try {
			// Saca
			c.sacar(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		// Deposita
		c.depositar(200);
	}


}
