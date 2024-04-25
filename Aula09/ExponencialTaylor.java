import java.util.Scanner;
public class ExponencialTaylor {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double potencia = 0;
		double fatorial = 0;
		double exponencial = 0;
		double resultado = 0;
		
		// Entrada de dados
		System.out.print("Digie a potência: ");
		potencia = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		for (int i = 0 ; i < 150 ; i++) {
			exponencial = 1;
			for (int j = 0 ; j < i ; j++) {
				exponencial *= potencia;
			}
			
			fatorial = 1;
			for (int j = i ; j > 0 ; j--) {
				fatorial *= j;
			}
			
			resultado += (exponencial / fatorial);
		}
		
		// Saída de dados
		
		System.out.println("e^" + potencia + "por Taylo:" + resultado);
		System.out.println("e^" + potencia + "pelo Java:" + Math.pow(Math.E, potencia));
		
	}

}
