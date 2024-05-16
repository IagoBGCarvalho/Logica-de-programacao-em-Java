import java.util.Scanner;

public class ConversaoDecimalBinario {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		int tamanho = 0;
		
		int [] resultado = new int[100000];
		
		// Entrada de dados
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		do {
			resultado[tamanho] = (numero % 2);
			tamanho++;
			numero = (numero/2);
		} while (numero > 0);
		
		// Saída de dados
		System.out.println("A representação binária é: ");
		for (int i = (tamanho - 1); i >= 0; i--) {
			System.out.print(resultado[i]);
		}
	}

}
