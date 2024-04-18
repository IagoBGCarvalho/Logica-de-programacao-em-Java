import java.util.Scanner;
public class PesquisaSocioeconomica {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double renda = 0;
		double pessoas = 0;
		double rendaIndividual = 0;
		
		double qtdClasseA = 0;
		double qtdClasseB = 0;
		double qtdClasseC = 0;
		double qtdClasseD = 0;
		double qtdClasseE = 0;
		
		double tamanhoPopulacao = 0;
		
		double percentualClasseA = 0;
		double percentualClasseB = 0;
		double percentualClasseC = 0;
		double percentualClasseD = 0;
		double percentualClasseE = 0;
		
		// Entrada de dados
		do {
			System.out.print("Qual a renda familiar? ");
			renda = leitor.nextDouble();
			
			System.out.print("Quantas pessoas? ");
			pessoas = leitor.nextDouble();
			
			rendaIndividual = (renda / pessoas);
			
			if (rendaIndividual < 500 ) {
				qtdClasseE += pessoas;
			} else if (rendaIndividual < 1000) {
				qtdClasseD += pessoas;
			} else if (rendaIndividual < 5000) {
				qtdClasseC += pessoas;
			} else if (rendaIndividual < 10000) {
				qtdClasseB += pessoas;
			} else {
				qtdClasseA += pessoas;
			} 
			
			tamanhoPopulacao += pessoas;
			
			System.out.println("Digite <S> para mais casas: ");
		} while (leitor.next().equalsIgnoreCase("S"));
		
		leitor.close();
		
		// Processamento
		
		percentualClasseA = (100 * qtdClasseA / tamanhoPopulacao);
		percentualClasseB = (100 * qtdClasseB / tamanhoPopulacao);
		percentualClasseC = (100 * qtdClasseC / tamanhoPopulacao);
		percentualClasseD = (100 * qtdClasseD / tamanhoPopulacao);
		percentualClasseE = (100 * qtdClasseE / tamanhoPopulacao);
		
		// Saída de dados
		System.out.println(percentualClasseA + "% Classe A ");
		System.out.println(percentualClasseB + "% Classe B ");
		System.out.println(percentualClasseC + "% Classe C ");
		System.out.println(percentualClasseD + "% Classe D ");
		System.out.println(percentualClasseE + "% Classe E ");
		
		
		
		
	}

}
