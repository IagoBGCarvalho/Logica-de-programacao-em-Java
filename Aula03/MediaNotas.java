import java.util.Scanner;
public class MediaNotas {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double media = 0;
		
		// Entrada de dados
		System.out.print("Digite a primeira nota: ");
		nota1 = leitor.nextDouble();
		
		System.out.print(" Digite a segunda nota: ");
		nota2 = leitor.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		media = (nota1 + nota2 + nota3) / 3;
		
		// Saída de dados
		
		System.out.println("A média das notas é: " + media);
		
				
	}

}
