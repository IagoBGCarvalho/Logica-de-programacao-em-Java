import java.util.Scanner;

public class ConversaoBinarioDecimal {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);

        String binario = "";
        int decimal = 0;

        // Entrada de dados
        System.out.println("Digite o número binário: ");
        binario = leitor.next();

        leitor.close();

        // Processamento
        for (int i = 0; i < binario.length(); i++) {
            decimal += (Integer.parseInt("" + binario.charAt(i)) * Math.pow(2, binario.length() - 1 - i));
        }

        // Saída de dados
        System.out.println("O valor em decimal é: " + decimal);
    }

}
