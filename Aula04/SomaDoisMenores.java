import java.util.Scanner;

public class SomaDoisMenores {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		double resultado = 0;
		
		// Entrada de dados
		
		System.out.print("Digite o primeiro número: ");
		a = leitor.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		b = leitor.nextDouble();
		
		System.out.print("Digite o terceiro número: ");
		c = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
	 
		if ((a > b) && (a > c)) {
			resultado = b + c;
		} else if (b > c) {
			resultado = a + c;
		} else {
			resultado = a + b;
		}
		
		// Saída de dados
		System.out.println("A soma dos menores é: " + resultado);
		
		
		
	}

}
