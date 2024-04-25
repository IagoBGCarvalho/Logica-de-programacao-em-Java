public class NumeroPerfeito {
	public static void main(String[] args) {
		// Declaração de variáveis
		
		int candidato = 0;
		int somaDivisores = 0;
		
		// Processamento
		candidato = 2;
		while (true) {
			for (int divisor = 1; divisor <= (candidato / 2) ; divisor++) {
				if ((candidato % divisor) == 0) {
					somaDivisores += divisor;
				}
			}
			
			if (candidato == somaDivisores) {
				System.out.println("Achei!" + candidato);
			}			

			candidato++;
			somaDivisores = 0;
		}
	}

}
