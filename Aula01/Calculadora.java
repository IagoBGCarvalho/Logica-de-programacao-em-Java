import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int operando1 = 0;
		int operando2 = 0;
		
		int soma = 0;
		int subtracao = 0;
		
		// Entrada de dados
		System.out.print("Digite o primeiro número: ");
		operando1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		operando2 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		soma = (operando1 + operando2);
		
		subtracao = (operando1 - operando2);
		
		// Saída de dados
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtracao é: " + subtracao);
	}
}