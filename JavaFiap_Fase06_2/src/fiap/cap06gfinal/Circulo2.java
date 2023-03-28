package fiap.cap06gfinal;

public class Circulo2 {
	
	private final double NUMERO_PI = 3.1416;

	private double raio;

	public double calcularArea(){
		raio = 10; //OK
		NUMERO_PI = 10; //Não Compila pois NUMERO_PI É "FINAL"
		return NUMERO_PI*raio*raio;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	

}
