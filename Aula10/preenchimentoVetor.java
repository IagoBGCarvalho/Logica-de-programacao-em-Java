import java.util.Scanner;
public class preenchimentoVetor {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [] vetor = new int[5];
		
		// Entrada de dados
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o valor do índice " + i + ": ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Saída de dados
		for (int i = 0; i < 5; i++) {
			System.out.println("Vetor[" + i + "] = " + vetor[i]);
		}
	}

}
