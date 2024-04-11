import java.util.Scanner;

public class ParidadeSinal {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		
		// Entrada de dados
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		
		if ((numero % 2) == 0) {
			System.out.println("Este número é par");
		} else {
			System.out.println("Este número é ímpar");
		}
		
		if (numero == 0) {
			System.out.println("Este número não tem sinal");
		} else if (numero > 0) {
			System.out.println("Este número é positivo");
		} else {
			System.out.println("Este número é negativo");
		}
		
	}

}
