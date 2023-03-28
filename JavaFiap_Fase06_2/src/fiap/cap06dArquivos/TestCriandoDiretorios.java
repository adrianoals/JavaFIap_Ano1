package fiap.cap06dArquivos;

import java.io.File;
import java.io.IOException;

public class TestCriandoDiretorios {

	public static void main(String[] args) {
		
		File diretorio = new File("fiap");

		if (diretorio.exists()){
			System.out.println("Diret�rio existe!");
		}else{
			if (diretorio.mkdir())
				System.out.println("Diret�rio criado!");
			else
				System.out.println("Diret�rio n�o criado.");
		}

		File arquivo = new File(diretorio,"file.txt");
		try {
			if (arquivo.createNewFile())
				System.out.println("Arquivo criado!");
			else
				System.out.println("Arquivo n�o criado!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// Cria o diret�rio na pasta do projeto.
	
}
