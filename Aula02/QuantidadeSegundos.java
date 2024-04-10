import java.util.Scanner;

public class QuantidadeSegundos {
	public static void main(String[] args) {
		
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int quantidadeSegundos = 0;
		
		// Entrada de dados
		System.out.print("Digite as horas: ");
		horas = leitor.nextInt();
		System.out.print("Digite os minutos: ");
		minutos = leitor.nextInt();
		System.out.print("Digite os segundos: ");
		segundos = leitor.nextInt();
		
		leitor.close();
		
		// Processamento de dados
		
		quantidadeSegundos = ((horas * 3600) + (minutos * 60) + (segundos));
		
		
		// Saída de dados
		System.out.println("A quantidade de segundos é: " + quantidadeSegundos);
		
		
	}

}
