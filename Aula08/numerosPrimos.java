import java.util.Scanner;
public class numerosPrimos {
	public static void main(String[] args) {
		// DEclaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		
		boolean primo = false;
		
		// Entrada de dados
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		primo = true;
		for (int divisor = 2 ; divisor < numero ; divisor++) {
			if ((numero % divisor) == 0) {
				primo = false;
			}
		}
		
		// Saída de dados
		if (primo) {
			System.out.println("Esse número é primo!");
		} else {
			System.out.print("Esse número não é primo!");
		}
	}

}
