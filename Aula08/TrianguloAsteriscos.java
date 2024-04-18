import java.util.Scanner;
public class TrianguloAsteriscos {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int tamanhoTriangulo = 0;
		
		// Entrada de dados
		System.out.print("Qual o tamanho do triângulo?" );
		tamanhoTriangulo = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		for (int i = 0 ; i < tamanhoTriangulo ; i++) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
