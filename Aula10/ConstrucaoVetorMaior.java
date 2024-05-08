import java.util.Scanner;

public class ConstrucaoVetorMaior {
	public static void main(String[] args) {
		// DEclaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [] vetorOriginal = new int[10];
		int [] vetorMaior = new int [10];
		
		int numero = 0;
		int indiceMaior = -1;
		
		// Entrada de dados
		for (int i = 0; i < vetorOriginal.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor original: ");
			vetorOriginal[i] = leitor.nextInt();
		}
		
		System.out.print("Digite o número limite: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		for (int i = 0; i < vetorOriginal.length; i++) {
			if (vetorOriginal[i] > numero) {
				indiceMaior++;
				vetorMaior[indiceMaior] = vetorOriginal[i];
			}
		}
		
		// Saída de dados
		for (int i = 0; i <= indiceMaior; i++) {
			System.out.println("vetorMaior[" + i + "] = " + vetorMaior[i]);
		}
	}

}
