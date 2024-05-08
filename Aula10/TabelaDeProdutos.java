import java.util.Scanner;

public class TabelaDeProdutos {
	public static void main(String[] args) {
		// DEclaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double[] tabela = new double[1000000];
		
		// Entrada de dados
		do {
			
			System.out.print("Digite o código do produto: ");
			int codigo = leitor.nextInt();
			
			System.out.print("Digite o valor do produto: ");
			double valor = leitor.nextDouble();
			
			tabela[codigo] = valor;
			
			System.out.println("Digite <S> para mais produtos: ");
			
		} while (leitor.next().equalsIgnoreCase("S"));
		
		leitor.close();
		
		// Saída de dados
		
		System.out.println("+==================+");
		System.out.println("| Tabela de Preços |");
		System.out.println("+==================+");
		System.out.println("| Codigo | Valor   |");
		System.out.println("+==================+");
		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i] > 0) {
				System.out.println("| " + i + "\t | R$ " + tabela[i] + " |");
			}
		}
		
		System.out.println("+==================+");
		
	}

}
