import java.util.Scanner;

public class Poligono {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int qtdArestas = 0;
		double tamanhoAresta = 0;
		
		double perimetro = 0;
		double area = 0;
		
		// Entrada de dados
		System.out.print("Informe a quantidade de arestas: ");
		qtdArestas = leitor.nextInt();
		
		System.out.print("Informe o tamanho da aresta: ");
		tamanhoAresta = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		switch (qtdArestas) {
			case 3:
				perimetro = (3 * tamanhoAresta);
				area = (Math.pow(tamanhoAresta, 2) * Math.sqrt(3) / 4);
				break;
			case 4: 
				perimetro = (4 * tamanhoAresta);
				area = (Math.pow(tamanhoAresta, 2));
				break;
			case 5: 
				perimetro = (5 * tamanhoAresta);
				area = ((5 * Math.pow(tamanhoAresta, 2)) / (4 * Math.tan(36)));
				break;
			case 6:
				perimetro = (6 * tamanhoAresta);
				area = ((3 * Math.pow(tamanhoAresta, 2) * Math.sqrt(3)) / 2);
				break;
			case 7:
				perimetro = (7 * tamanhoAresta);
				area = ((7 / 4) * Math.pow(tamanhoAresta, 2) / Math.tan(51.4285714));
				break;
				
		}
		
		// Saída de dados
		System.out.println("O perímetro é: " + perimetro);
		System.out.println("A área é: " + area);
	}

}
