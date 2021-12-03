import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("MANIPULADOR DE ARQUIVO\n");
		System.out.println("---------------------------\n");
		System.out.println("Escolha uma das opões abaixo:\n\n");
		System.out.println("[1] Inserir nome no arquivo. [2] Exibir todos os nomes do arquivo [3] Apagar todo o arquivo  [4] Sair \n\n");
		int opcao = teclado.nextInt();
		String path = "/users/cecil/Desktop/AtividadePOO/teste.txt";
		
		
			
			switch(opcao) {
			
				case 1: 
					ManipuladorArquivo.escritor(path);
					break;
			
				case 2: 
					ManipuladorArquivo.leitor(path); 
					break;
			
				case 3: 
					System.out.println("Conteúdo apagado com sucesso!");
					ManipuladorArquivo.apagar(path);
					break;
			
				default: System.out.println("Opção digitada não existe!");
			}	

	}

}
