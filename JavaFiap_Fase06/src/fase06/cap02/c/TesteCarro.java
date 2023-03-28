package fase06.cap02.c;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro[] carros = new Carro[5];

		Carro carro = new Carro();
		carro.setModelo("Gol");

		carros[0] = carro;
		
		String modelo = carros[0].getModelo();
		System.out.println(modelo);
		
		System.out.println();
		
		/*
		 For Each:
		
		for (<tipo> <variável> : <array>){
			  <instruções>
			}
		
		*/
		
		
		for (Carro modelCar : carros){
			  System.out.println(modelCar.getModelo());
			}
		
		

	}

}
