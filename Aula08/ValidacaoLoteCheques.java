import java.util.Scanner;
public class ValidacaoLoteCheques {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double lote = 0;
		double qtdchequelote = 0;
		double qtdcheque = 0;
		double valorcheque = 0;
		
		// Entrada de dados
		System.out.print("Qual o valor total do lote?");
		lote = leitor.nextDouble();
		
		System.out.println("Quantos cheques?");
		qtdchequelote = leitor.nextDouble();
		
		do {
			System.out.println("Qual o valor do cheque?");
			valorcheque += leitor.nextDouble();
			qtdcheque++;
			
			System.out.println("Digite <S> para mais cheques: ");
		} while (leitor.next().equalsIgnoreCase("S"));
		
		// Saída de dados
		
		if ((valorcheque) == (lote) && (qtdcheque) == (qtdchequelote)) {
			System.out.println("O lote é válido!");
		} else {
			System.out.println("O lote não é válido!");
		}
		
		leitor.close();
		
		
		
	}

}
