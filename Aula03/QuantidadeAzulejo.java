import java.util.Scanner;
public class QuantidadeAzulejo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double largura = 0;
		double comprimento = 0;
		double profundidade = 0;
		double tamanhoazulejo = 0;
		double areaDaBase = 0;
		double areaDaParedeMenor = 0;
		double areaDaParedeMaior = 0;
		double areaDaPiscina = 0;
		double quantidadeazulejos = 0;
		
		// Entrada de dados
		System.out.print("Digite a largura: ");
		largura = leitor.nextDouble();
		
		System.out.print("Digite o comprimento: ");
		comprimento = leitor.nextDouble();
		
		System.out.print("Digite a profundidade: ");
		profundidade = leitor.nextDouble();
		
		System.out.print("Digite o tamanho dos azulejos");
		tamanhoazulejo = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		areaDaBase = (comprimento * largura);
		areaDaParedeMenor = (profundidade * largura);
		areaDaParedeMaior = (profundidade * comprimento);
		
		areaDaPiscina = (areaDaBase + 2 * areaDaParedeMenor + 2 * areaDaParedeMaior);
		
		quantidadeazulejos = (areaDaPiscina / Math.pow(tamanhoazulejo, 2));
		
		// Saída de dados
		System.out.println("A quantidade de azulejos é: " + quantidadeazulejos);
		
	}

}
