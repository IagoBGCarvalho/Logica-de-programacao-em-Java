import java.util.Scanner;
public class DeterminanteMatriz {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [][] matriz = new int[3][3];
		
		int determinante = 0;
		
		// Entrada de dados
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Matriz[" + i + ", " + j + "] = ");
				matriz[i][j] = leitor.nextInt();
			}
		}
		
		leitor.close();
		
		// Processamento
		
		determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2] + 
						matriz[0][1] * matriz[1][2] * matriz[2][0] +
						matriz[0][2] * matriz[2][1] * matriz[1][0] -
						matriz[0][2] * matriz[1][1] * matriz[2][0] -
						matriz[0][0] * matriz[2][1] * matriz[1][2] -
						matriz[0][1] * matriz[1][0] * matriz[2][2]);
		
		// Saída de dados
		System.out.println("O determinante é = " + determinante);
		
		
	}

}
