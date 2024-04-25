import java.util.Scanner;
public class LancamentoBalistico {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double angulo = 0;
		double velocidade = 0;
		double tempo = 0;
		double distancia = 0;
		
		// Entrada de dados
		System.out.print("Qual o ãngulo de lançamento? ");
		angulo = leitor.nextDouble();
		
		System.out.print("Qual a velocidade do lançamento? ");
		velocidade = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		angulo = ((Math.PI * angulo) / 180);
		tempo = ((2 * velocidade * Math.sin(angulo)) / 9.8);
		
		// Saída de dados
		for (int i = 0 ; i < tempo ; i++) {
			distancia = (velocidade * Math.cos(angulo) * i);
			System.out.println(i + "\t" + distancia);
		}
		
		distancia = ((Math.pow(velocidade, 2) * Math.sin(2 * angulo)) / 9.8);
		System.out.println("Tempo final: " + tempo);
		System.out.println("Distãncia final: " + distancia);
		
	}

}
