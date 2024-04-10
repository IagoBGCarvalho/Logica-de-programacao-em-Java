import java.util.Scanner;
public class TranguloAngulo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int angulo1 = 0;
		int angulo2 = 0;
		int angulo3 = 0;
		
		// Entrada de dados
		
		System.out.println("Digite o primeiro angulo: ");
		angulo1 = leitor.nextInt();
		
		System.out.println("Digite o segundo ângulo: ");
		angulo2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro ângulo: ");
		angulo3 = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		
		if ((angulo1 + angulo2 + angulo3) != 180) {
			System.out.println("Não é um triângulo!");
		} else if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
			System.out.println("Triângulo retângulo");
		} else if ((angulo1 < 90) || (angulo2 < 90) || (angulo3 < 90)) {
			System.out.println("Triângulo acutângulo");
		} else { 
			System.out.println("Triângulo obtusãgulo");
		}
		
	}

}
