package fiap.cap06aExceptions;

public class TestExceptions {

	public static void main(String[] args) {
	
		try {
			
			int val = 10 / 0;
			
			System.out.println(val);
		} catch (Exception e) { // Captura da Exce��o
			
			// Tratamento da exce��o
			
			e.printStackTrace();			
			
		}

	}

}
