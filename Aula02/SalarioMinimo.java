import java.util.Scanner;

public class SalarioMinimo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double salario = 0;
		double qtdSalarioMinimo = 0;
		
		// Entrada de dados
		System.out.print("Digite o seu salário ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		qtdSalarioMinimo = (salario / 1412);
		
		// Saída de dados
		System.out.println("A quantidade de salários mínimos é R$" + qtdSalarioMinimo);
				
	}

}