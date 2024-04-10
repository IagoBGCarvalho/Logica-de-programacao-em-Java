public class TrocaVariavel {
	public static void main(String[] args) {
		// Declaração de variáveis
		int a = 20;
		int b = 8;
		int temp = 0;
		
		// Impressão dos valores originais
		System.out.println("Valor de a " + a);
		System.out.println("Valor de b " + b);
		
		// Processamento
		temp = a;
		a = b;
		b = temp;
		
		// Impressão dos valores alterados
		System.out.println("Valor de a " + a);
		System.out.println("Valor de b " + b);
		
	}
}