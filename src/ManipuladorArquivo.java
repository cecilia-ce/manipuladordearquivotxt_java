import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ManipuladorArquivo {
	
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		
		while (true) {
			
			if (linha != null) {
				System.out.println(linha);
			} else {
				
				break;
			}
				
			linha = buffRead.readLine();
			
		}	
			
		buffRead.close();
		
	}
	
	public static void escritor (String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter (new FileWriter(path));
		String linha = ""; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = entrada.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}
	
	public static void apagar (String path) throws IOException {
		Writer clean = new BufferedWriter(new FileWriter(path));
		clean.close();
		
	}

}
