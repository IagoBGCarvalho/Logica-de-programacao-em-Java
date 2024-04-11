import java.util.Scanner;

public class Maioridade {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int idade = 0;
		
		// Entrada de dados
		
		System.out.print("Informe a sua idade: ");
		idade = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		
		if (idade >= 18) {
			System.out.println("Vamo tomar uma!");
		} else {
			System.out.println("Vai pra casa!");
		}
		
	}

}
