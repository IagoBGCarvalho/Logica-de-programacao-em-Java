import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		// Entrada de dados
		System.out.print("Digite a primeira aresta: ");
		a = leitor.nextInt();
		
		System.out.print("Digite a segunda aresta: ");
		b = leitor.nextInt();
		
		System.out.print("Digite a terceira aresta: ");
		c = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		
		if ((a == b) && (a == c)) {
			System.out.println("Triângulo equilátero!");
		} else if ((a == b) || (a == c) || (b == c)) {
			System.out.println("Triãngulo isóceles!");
		} else {
			System.out.println("Triângulo escaleno!");
		}
	}

}
