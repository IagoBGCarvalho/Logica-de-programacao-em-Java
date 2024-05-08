import java.util.Scanner;
public class BuscaValorNoVetor {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [] vetor = new int[1000];
		
		int busca = 0;
		
		int achei = -1;
		
		// Entrada de dados
		System.out.print("Digite o valor a ser buscado: ");
		busca = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ((int) (1000 * Math.random()));
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == busca ) {
				achei = i;
			}
		}
		
		// Saída de dados
		if (achei == -1) {
			System.out.println("Não achei!");
		} else {
			System.out.println("Achei! Está na posição: " + achei);
		}
		
	}

}
