package fiap.cap06gfinal;

public class Circulo3 {
	
	private final double NUMERO_PI = 3.1416;

	private double raio;

	public final double calcularArea(){
		return NUMERO_PI*raio*raio;
	}

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
