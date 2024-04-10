import java.util.Scanner;
public class IMC {
	public static void main(String[] args) {
		
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double peso = 0;
		double altura = 0;
		double imc = 0;
		
		// Entrada de dados
		System.out.print("Digite o seu peso: ");
		peso = leitor.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		imc = (peso / Math.pow(altura, 2));
		
		// Saída de dados
		
		System.out.println("O seu IMC é: " + imc);
			
	}

}
