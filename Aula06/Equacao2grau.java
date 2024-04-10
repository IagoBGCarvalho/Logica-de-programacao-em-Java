import java.util.Scanner;
public class Equacao2grau {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
		
		// Entrada de dados
		
		System.out.print("Digite o a: ");
		a = leitor.nextDouble();
		
		System.out.print("Digite o b: ");
		b = leitor.nextDouble();
		
		System.out.print("Digite o c: ");
		c = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		delta = (Math.pow(b, 2) - 4 * a * c);
		
		if (delta >= 0) {
			x1 = ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = ((-b - Math.sqrt(delta)) / (2 * a));
		} else {
			System.out.println("É um número complexo!");	
		}
		
		// Saída de dados
		if (delta < 0) {
			System.out.println("Não existem raízes reais para esta equação!");
		} else if (delta == 0) {
			System.out.println("Há apenas uma raíz real para essa equação: " + x1);
		} else {
			System.out.println("As raízes são: " + x1 + " e " + x2);
		}
		 
		
	}

}
