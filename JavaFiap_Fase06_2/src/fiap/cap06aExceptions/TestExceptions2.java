package fiap.cap06aExceptions;

public class TestExceptions2 {

	public static void main(String[] args) {


		int[] array = new int[2];
		try {
			//Tenta acessar uma posi��o inexistente do vetor
			array[2] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Mensagem de erro: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
