package fiap.cap06cExceptions;


public class TestExceptions {

	public static void main(String[] args) throws DivisaoPorZero {
		
		try {
			int val = 10 / 0;
			System.out.println(val);
		} catch (Exception e) {
			throw new DivisaoPorZero();
		}
	}

}
