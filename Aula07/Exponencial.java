import java.util.Scanner;
public class Exponencial {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double base = 0;
		double expoente = 0;
		double resultado = 1;
		
		// Entrada de dados
		System.out.print("Digite a base: ");
		base = leitor.nextDouble();
		
		System.out.print("Digite o expoente: ");
		expoente = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		for (int i = 0 ; i < expoente ; i++) {
			resultado *= base;
		}
		
		// Saída de dados
		System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
	}

}
