import java.util.Scanner;

public class Aprovacao {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double prova1 = 0;
		double prova2 = 0;
		double prova3 = 0;
		
		double media = 0;
		double substitutiva = 0;
		
		// Entrada de dados
		System.out.print("Qual o resultado da primeira prova? ");
		prova1 = leitor.nextDouble();
		
		System.out.print("Qual o resultado da segunda prova? ");
		prova2 = leitor.nextDouble();
		
		System.out.print("Qual o resultado da terceira prova? ");
		prova3 = leitor.nextDouble();
		
		
		// Processamento
		media = (prova1 + prova2 + prova3) / 3;
		
		if (media >= 5) {
			System.out.println("Passou!");
		} else {
			System.out.print("Qual a nota da prova substitutiva? ");
			substitutiva = leitor.nextDouble();
			
			if (substitutiva >= 5) {
				System.out.println("Passou na recuperação!");
			} else {
				System.out.println("Não foi aprovado...");
			}
		}
		
		leitor.close();
		
	}

}
