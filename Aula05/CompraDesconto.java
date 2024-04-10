import java.util.Scanner;
public class CompraDesconto {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double valorProduto = 0;
		double quantidade = 0;
		
		double desconto = 0;
		
		// Entrada de dados
		
		System.out.print("Qual o valor do produto? ");
		valorProduto = leitor.nextDouble();
		
		System.out.print("Qual a quantidade? ");
		quantidade = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		if (quantidade >= 100) {
			valorProduto = (valorProduto * 0.5);
		} else if (quantidade >= 50) {
			valorProduto = (valorProduto * 0.7);
		} else if (quantidade >= 20) {
			valorProduto = (valorProduto * 0.9);
		} else if (quantidade >= 10) {
			valorProduto = (valorProduto * 0.95);
		}
		
		desconto = (valorProduto * quantidade);
		
		// Saída de dados
		System.out.println("O valor total da compra é: " + desconto);
		
	}

}
