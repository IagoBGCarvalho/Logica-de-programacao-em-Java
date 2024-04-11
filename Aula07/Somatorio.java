import java.util.Scanner;
public class Somatorio {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		long limite = 0;
		long resultado = 0;
		
		// Entrada de dados
		System.out.print("Informe o limite: ");
		limite = leitor.nextLong();
		
		leitor.close();
		
		// Processamento
		for (int x = 1 ; x <= limite ; x++) {
			resultado += x;
		}
		
		// Saída de dados
		System.out.println("O somatório é: " + resultado);
	}

}
