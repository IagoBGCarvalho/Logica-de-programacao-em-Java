import java.util.Scanner;
public class RaizQuadrada {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double numero = 0;
		double estimativa = 0;
		
		// Entrada de dados
		System.out.print("Digite um número: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		estimativa = (numero / 2);
		for (int i = 0 ; i < 50 ; i++) {
			estimativa = ((estimativa + (numero/estimativa))/2);
			System.out.println(estimativa);
		}
		
		// Saída de dados
		System.out.println("Raiz Newton: " + estimativa);
		System.out.println("Raiz Java: " + Math.sqrt(numero));
		
	}

}
