import java.util.Scanner;
public class Viagem {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double distancia = 0;
		double tempo = 0;
		double litrosGasolina = 0;
		
		double velocidadeMedia = 0;
		double consumoMedio = 0;
		
		// Entrada de dados
		System.out.print("Qual a distância percorrida?");
		distancia = leitor.nextDouble();
		
		System.out.print("Por quanto tempo? ");
		tempo = leitor.nextDouble();
		
		System.out.print("Quantos litros de gasolina foram utilizados?");
		litrosGasolina = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		velocidadeMedia = (distancia / tempo);
		consumoMedio = (distancia / litrosGasolina);
		
		// Saída de dados
		System.out.println("Velocidade média de " + velocidadeMedia + "Km/h");
		System.out.println("Consumo médio de " + consumoMedio + "Km/l");
		
		
		
	}

}
