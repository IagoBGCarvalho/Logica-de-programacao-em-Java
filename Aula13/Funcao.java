package Aula13.src;
import java.util.Scanner;

public class Funcao {
    
    static int somar(int a, int b) {
        int retorno = a + b;
        return retorno;
    }

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        numero1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = leitor.nextInt();

        leitor.close();

        // Saída de dados
        System.out.println("A soma é: " + somar(numero1, numero2));

    }

}
