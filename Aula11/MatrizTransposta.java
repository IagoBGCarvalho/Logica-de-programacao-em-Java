import java.util.Scanner;
public class MatrizTransposta {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [][] matriz = new int[2][3];
		int [][] matrizTransposta = new int[3][2];
		
		// Entrada de dados
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Matriz origina[" + i + ", " + j + "] = ");
				matriz[i][j] = leitor.nextInt();
			}
		}
		
		leitor.close();
		
		// Processamento
		for (int i = 0; i < matrizTransposta.length; i++) {
			for (int j = 0; j < matrizTransposta[i].length; j++) {
				matrizTransposta[i][j] = matriz[j][i];
			}
		}
		
		// Saída de dados
		System.out.println("Matriz Original: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Matriz Transposta: ");
		for (int i = 0; i < matrizTransposta.length; i++) {
			for (int j = 0; j < matrizTransposta[i].length; j++) {
				System.out.print(matrizTransposta[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
