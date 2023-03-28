package cap.cinco.operadores;

//Operador Lógico

public class Aula06 {

	public static void main(String[] args) {
		
		
		//Operador and
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println(precisaVotar);
		
		//Operador or
		int nrAmarelo = 1, nrVermelho = 1;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);
		
		//Operador xor
		int x = 9, y = 11;
		boolean teste = x > 10 ^ y > 10;
		System.out.println(teste);
		
		//Operador not
		idade = 20;
		boolean maioridade = !(idade >= 18);
		System.out.println(maioridade);
		
		
	}
	
}
