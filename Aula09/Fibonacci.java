public class Fibonacci {
	public static void main(String[] args) {
		// Declaração de variáveis
		
		long numero1 = 0;
		long numero2 = 1;
		long soma = 0;
		
		// Processamento
		while (true) {
			soma = (numero1 + numero2);
			System.out.println(soma);
			numero1 = numero2;
			numero2 = soma;
			try {Thread.sleep(200);} catch (Exception e) {}
		}
		
	}

}
