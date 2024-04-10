import java.util.Scanner;
public class Aniversario {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		int diaSemana = 0;
		
		// Entrada de dados
		
		System.out.println("Em qual dia vocẽ nasceu? ");
		dia = leitor.nextInt();
		
		System.out.println("Em qual mês? ");
		mes = leitor.nextInt();
		
		System.out.println("Em qual ano? ");
		ano = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		diaSemana = (((dia) + (2 * mes) + ((3 * (mes + 1)) / 5) + ((ano) + (ano / 4)) - (ano /100) + (ano / 400) + 2) % 7);
		
		// Saída de dados
		
		if (diaSemana == 1) {
			System.out.println("Você nasceu no domingo!");
		} else if (diaSemana == 2) {
			System.out.println("Você nasceu na segunda!");
		} else if (diaSemana == 3) {
			System.out.println("Você nasceu na terça!");
		} else if (diaSemana == 4) {
			System.out.println("Você nasceu na quarta!");
		} else if (diaSemana == 5) {
			System.out.println("Você nasceu na quinta!");
		} else if (diaSemana == 6) {
			System.out.println("Vocẽ nasceu na sexta!");
		} else if (diaSemana == 0) {
			System.out.println("Você nasceu no sábado!");
		}
		
		
	}

}
