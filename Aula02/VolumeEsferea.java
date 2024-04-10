import java.util.Scanner;

public class VolumeEsferea {
	public static void main(String[] args) {
		
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double raio = 0;
		double volume = 0;
		
		// Entrada de dados
		
		System.out.print("Digite o raio da esfera ");
		raio = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		volume = ((4 / 3) * Math.PI * Math.pow(raio, 3));
		
		// Saída de dados
		System.out.println("O volume da esfera é: " + volume);
		
		
	}

}
