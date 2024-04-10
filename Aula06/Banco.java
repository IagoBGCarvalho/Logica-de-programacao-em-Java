import java.util.Scanner;
public class Banco {
	public static void main(String[] args) {
		// DEclaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double saldoInicial = 0;
		int operacao = 0;
		double valor = 0;
		double saldoFinal = 0;
		
		// Entrada de dados
		
		System.out.print("Digite o valor do saldo da conta: ");
		saldoInicial = leitor.nextDouble();
		
		System.out.println("+================+");
		System.out.println("| Menu de Opções |");
		System.out.println("+================+");
		System.out.println("| 1 - Saque      |");
		System.out.println("| 2 - Depósito   |");
		System.out.println("+================+");
		System.out.print("Digite a operação: ");
		operacao = leitor.nextInt();
		
		if (operacao == 1) {
			System.out.print("Digite o valor do saque: ");
		} else {
			System.out.print("Digite o valor do depósito: ");
		}
		
		valor = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		if (operacao == 1) {
			saldoFinal = (saldoInicial) - (valor);
		} else {
			saldoFinal = (saldoInicial) + (valor);
		}
		
		// Saída de dados
		System.out.println("O saldo atual da conta é: " + saldoFinal);
		
	}

}
