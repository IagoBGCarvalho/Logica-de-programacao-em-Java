import java.util.Scanner;
public class CuboMagico {
	public static void main(String[] args) {
		// Declaraçã de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [][] quadrado = new int[3][3];
		
		int soma = 0;
		int padrao = 0;
		boolean magic = false;
		
		// Entrada de dados
		
		for (int i = 0; i < quadrado.length; i++) {
			for (int j = 0; j < quadrado[i].length; j++) {
				System.out.print("Matriz[" + i + ", " + j + "] = ");
				quadrado[i][j] = leitor.nextInt();
			}
		}
		
		leitor.close();
		
		// Processamento da diagonal principal
		for (int i = 0; i < quadrado.length; i++) {
			padrao += quadrado[i][i];
		}
		magic = true;
		
		// Processamento da diagonal invertida
		soma = 0;
		for (int i = 0; i < quadrado.length; i++) {
			soma += quadrado[i][quadrado.length - 1 - i];
		}
		if (soma != padrao) {
			magic = false;
		}
		
		// Processamento das linhas
		for (int i = 0; i < quadrado.length; i++) {
			soma = 0;
			for (int j = 0; j < quadrado.length; j++) {
				soma += quadrado[i][j];
			}
			if (soma != padrao) {
				magic = false;
			}
		}
		
		//Processamento das colunas
		for (int i = 0; i < quadrado.length; i++) {
			soma = 0;
			for (int j = 0; j < quadrado.length; j++) {
				soma += quadrado[j][i];
			}
			if (soma != padrao) {
				magic = false;
			}
		}
		
		// Saída de dados
		if (magic) {
			System.out.println("É um quadrado mágico!");
		} else {
			System.out.println("Não é um quadrado mágico!");
		}
		
	}

}
