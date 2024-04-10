import java.util.Scanner;
public class PercentualDeVotosValidos {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double votosCandidato1 = 0;
		double votosCandidato2 = 0;
		double votosCandidato3 = 0;
		double votosBrancos = 0;
		double votosNulos = 0;
		
		double totalValidos = 0;
		double totalInvalidos = 0;
		
		double porcentagem1 = 0;
		double porcentagem2 = 0;
		double porcentagem3 = 0;
		double invalidos = 0;
		
		// Entrada de Dados
		System.out.print("Qual o número de votos do candidato 1? ");
		votosCandidato1 = leitor.nextDouble();
		
		System.out.print("Qual o número de votos do candidato 2? ");
		votosCandidato2 = leitor.nextDouble();
		
		System.out.print("Qual o número de votos do candidato 3? ");
		votosCandidato3 = leitor.nextDouble();
		
		System.out.print("Qual o número de votos em branco? ");
		votosBrancos = leitor.nextDouble();
		
		System.out.print("Qual o número de votos nulos? ");
		votosNulos = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		totalValidos = (votosCandidato1 + votosCandidato2 + votosCandidato3);
		totalInvalidos = (votosBrancos + votosNulos);
		porcentagem1 = (100 * votosCandidato1 / totalValidos);
		porcentagem2 = (100 * votosCandidato2 / totalValidos);
		porcentagem3 = (100 * votosCandidato3 / totalValidos);
		invalidos = (100 * (votosBrancos + votosNulos) / (totalValidos + totalInvalidos));
		
		// Saída de dados
		System.out.println("A porcentagem de votos do candidato 1 é: " + porcentagem1);
		System.out.println("A porcentagem de votos do candidato 2 é: " + porcentagem2);
		System.out.println("A porcentagem de votos do candidato 3 é: " + porcentagem3);
		System.out.println("A porcentagem de votos inválidos é: " + invalidos);
		
		
		
	}
		


}
