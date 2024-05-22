import java.util.Scanner;
public class Ordenacao {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);

        String [] vetor = new String[10];

        // Entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = ");
            vetor[i] = leitor.nextLine();
        }

        leitor.close();

        // Processamento
        for (int i = 0; i < (vetor.length - 1); i++) {
            for (int j = (i + 1); j < vetor.length; j++) {
                if (vetor[j].compareTo(vetor[i]) < 0) {
                    String temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }

        }

        // Saída de dados
        for (int i = 0; i < (vetor.length - 1); i++) {
            System.out.println(vetor[i]);
        }
    }

}
