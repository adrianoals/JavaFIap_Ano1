package fiap.cap06dArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestLendoArquivos {

	public static void main(String[] args) {
		try {
			//Abre o arquivo
			FileReader stream = new FileReader("C:\\Users\\drili\\OneDrive\\Área de Trabalho\\ArquivoTxt\\arquivo.txt");
			BufferedReader reader = new BufferedReader(stream);

			//Lê uma linha do arquivo
			String linha = reader.readLine();	
			while (linha != null){
				System.out.println(linha);
				//Lê a próxima linha do arquivo
				linha = reader.readLine();
			}

			reader.close();
			//Fecha o arquivo
			stream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
