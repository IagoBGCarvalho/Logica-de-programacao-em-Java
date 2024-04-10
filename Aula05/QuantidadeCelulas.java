import java.util.Scanner;
public class QuantidadeCelulas {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int valor = 0;
		
		int nota200 = 0;
		int nota100 = 0;
		int nota50 = 0;
		int nota20 = 0;
		int nota10 = 0;
		int nota5 = 0;
		int nota2 = 0;
		int moeda1 = 0;
		
		// Entrada de dados
		
		System.out.print("digite o valor do saque: ");
		valor = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		nota200 = (valor / 200);
		valor = (valor % 200);
		
		nota100 = (valor / 100);
		valor = (valor % 100);
		
		nota50 = (valor / 50);
		valor = (valor % 50);
		
		nota20 = (valor / 20);
		valor = (valor % 20);
		
		nota10 = (valor / 10);
		valor = (valor % 10);
		
		nota5 = (valor / 5);
		valor = (valor % 5);
		
		nota2 = (valor / 2);
		valor = (valor % 2);
		
		moeda1 = valor;
		
		// Saída de dados
		
		if (nota200 > 0)
			System.out.println(nota200 + " nota(s) de 200");
		if (nota100 > 0)
			System.out.println(nota100 + " nota(s) de 100");
		if (nota50 > 0)
			System.out.println(nota50 + " nota(s) de 50");
		if (nota20 > 0)
			System.out.println(nota20 + " nota(s) de 20");
		if (nota10 > 0)
			System.out.println(nota10 + " nota(s) de 10");
		if (nota5 > 0)
			System.out.println(nota5 + " nota(s) de 5");
		if (nota2 > 0)
			System.out.println(nota2 + " nota(s) de 2");
		if (moeda1 > 0)
			System.out.println(moeda1 + " moeda(s) de 1");
		
	}

}
