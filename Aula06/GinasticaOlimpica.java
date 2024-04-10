import java.util.Scanner;
public class GinasticaOlimpica {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		 
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double n5 = 0;
		double n6 = 0;
		
		double menor = 0;
		double maior = 0;
		
		double media = 0;
		
		// Entrada de dados
		System.out.print("Qual a primeira nota? ");
		n1 = leitor.nextDouble();
		maior = n1;
		menor = n1;
		
		System.out.print("Qual a segunda nota? ");
		n2 = leitor.nextDouble();
		if (n2 > n1) {
			maior = n2;
		}
		if (n2 < menor) {
			menor = n2;
		}

		System.out.print("Qual a terceira nota? ");
		n3 = leitor.nextDouble();
		if (n3 > maior) {
			maior = n3;
		}
		if (n3 < menor) {
			menor = n3;
		}

		System.out.print("Qual a quarta nota? ");
		n4 = leitor.nextDouble();
		if (n4 > maior) {
			maior = n4;
		}
		if (n4 < menor) {
			menor = n4;
		}


		System.out.print("Qual a quinta nota? ");
		n5 = leitor.nextDouble();
		if (n5 > maior) {
			maior = n5;
		}
		if (n5 < menor) {
			menor = n5;
		}


		System.out.print("Qual a sexta nota? ");
		n6 = leitor.nextDouble();
		if (n6 > maior) {
			maior = n6;
		}
		if (n6 < menor) {
			menor = n6;
		}

		
		leitor.close();
		
		// Processamento
		
		media = ((n1 + n2 + n3 + n4 + n5 + n6 - maior - menor) / 4);
		
		// Saída de dados
		System.out.println("A média das notas é: " + media);
		

		
	}

}
