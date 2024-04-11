import java.util.Scanner;
public class Mascara {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		boolean impar = false;
		
		// Entrada de dados
		do {
			System.out.print("Digite um número par: ");
			numero = leitor.nextInt();
			impar = ((numero % 2) == 1);
			if (impar) {
				System.out.println("Apenas números pares!!");
			}
		} while (impar);
		
		leitor.close();
		
		// Saída de dados
		System.out.println("Obrigado pelo número par!");
	}

}
