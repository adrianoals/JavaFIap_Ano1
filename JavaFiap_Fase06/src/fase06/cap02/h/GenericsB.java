package fase06.cap02.h;

import java.util.ArrayList;

public class GenericsB {
	
	public static void main(String[] args) {
	
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Thiago");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Jo�o");

		listaCliente.add(cliente1);
		listaCliente.add(cliente2);

		for (int i = 0; i < listaCliente.size(); i++) {
		    Cliente cli = listaCliente.get(i); //N�o � necess�rio o cast
		    System.out.println(cli.getNome());
		}
		
		for (Cliente cliente : listaCliente) {
			  System.out.println(cliente.getNome());
			}
		
		
	}

}
