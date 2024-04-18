import java.util.Scanner;
public class PesoMedioPopulacao {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double peso = 0;
		double qtdpessoas = 0;
		double media = 0;
		
		// Entrada de dados
		do {
			System.out.print("Qual o seu peso? ");
			peso += leitor.nextDouble();
			qtdpessoas++;
			
			System.out.print("Digite <S> para mais essoas: ");
		} while (leitor.next().equalsIgnoreCase("S"));
		
		leitor.close();
		
		// Processamento
		media = (peso / qtdpessoas);
		
		// Saída de dados
		System.out.println("A média de peso da população é: " + media);
	}

}
