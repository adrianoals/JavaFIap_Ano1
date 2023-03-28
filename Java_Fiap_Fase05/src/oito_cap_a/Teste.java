package oito_cap_a;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setAlimenta("Animal se alimenta");
		animal.setLocomove("Animal se locomove");
		System.out.println(animal.getAlimenta());
		System.out.println(animal.getLocomove());
		
		System.out.println();
		
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Come ração");
		cachorro.setLocomove("Anda de 4 patas");
		cachorro.setLatido("Auau");
		System.out.println(cachorro.getAlimenta());
		System.out.println(cachorro.getLocomove());
		System.out.println(cachorro.getLatido());
		
		System.out.println();
		
		//Objeto cachorro e varíavel de referencia a partir da superclasse Animal
		//Só que dessa forma só é possível acessar os métodos da superclasse.
		Animal poddle = new Cachorro();
		poddle.setAlimenta("Come ração de Poddle");
		poddle.setLocomove("Anda igual Poddle");
		System.out.println(poddle.getAlimenta());
		System.out.println(poddle.getLocomove());
		
		
	}
}
	
	
	
	
