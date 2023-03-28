package fase06.cap02.h;

import java.util.HashMap;

public class MapA {

	public static void main(String[] args) {
		
		HashMap mapa = new HashMap();

		mapa.put("RM1234", "Thiago");
		mapa.put("RM4321", "João");

		System.out.println(mapa);
		
		//Recuperar um elemento do Mapa
		System.out.println(mapa.get("RM1234"));
		
		mapa.remove("RM1234"); //remove um elemento.

		System.out.println(mapa.get("RM1234"));
		
		
	}

}
