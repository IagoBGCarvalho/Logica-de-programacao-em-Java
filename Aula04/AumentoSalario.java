import java.util.Scanner;

public class AumentoSalario {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double salario = 0;
		int cargo = 0;
		
		double salarioNovo = 0;
		
		
		// Entrada de dados
		System.out.print("Qual o seu salário? ");
		salario = leitor.nextDouble();
		
		System.out.print("E qual é o seu cargo? ");
		cargo = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		switch (cargo) {
			case 1:
				salarioNovo = (1.5 * salario);
				break;
			case 2:
				salarioNovo = (1.3 * salario);
				break;
			case 3:
				salarioNovo = (1.1 * salario);
				break;
			default:
				System.out.println("Cargo inválido!");
				break;
		}
		
		// Saída de dados
		System.out.println("O novo salário é: " + salarioNovo);
		
	}

}
