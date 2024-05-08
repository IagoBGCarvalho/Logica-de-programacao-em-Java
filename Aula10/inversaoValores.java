import java.util.Scanner;
public class inversaoValores {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [] vetor = new int [5];
		int [] vetorInvertido = new int [5];
		
		// Entrada de dados
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o valor do índice: " + i + ": ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Processamento
		for (int i = 0; i < 5; i++) {
			vetorInvertido[4 - i] = vetor[i];
		}
		
		// Saída de dados
		for (int i = 0; i < 5; i++) {
			System.out.println("Vetor original[" + i + "] = " + vetor[i]);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Vetor invertido[" + i + "] = " + vetorInvertido[i]);
		}
	}

}
