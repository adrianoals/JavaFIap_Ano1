package fiap.cap06dArquivos;

import java.io.File;
import java.io.IOException;

public class TestCriandoArquivos2 {
	
	public static void main(String[] args) {
		File arquivo = new File("C:\\\\Users\\\\drili\\\\OneDrive\\\\Área de Trabalho\\\\ArquivoTxt\\arquivo2.txt");

		// Verifica se o arquivo existe
		if (arquivo.exists()) {
			System.out.println("O arquivo existe!" 
		+ " Pode ser lido:" + arquivo.canRead() 
		+ " Pode ser gravado:" + arquivo.canWrite() 
		+ " Tamanho:" + arquivo.length() 
		+ " Caminho:" + arquivo.getPath());
		} else {
			// Cria o arquivo
			try {
				if (arquivo.createNewFile())
					System.out.println("Arquivo criado!");
				else
	System.out.println("Arquivo não criado!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	

}
