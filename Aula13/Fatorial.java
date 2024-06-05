package Aula13.src;

import java.util.Scanner;

public class Fatorial {

    static double fatorial (double numero) {
        if (numero <= 1) {
            return 1;
        }

        return numero * fatorial(numero - 1);
    }

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        double a = 0;

        // Entrada de dados
        System.out.print("Digite um número: ");
        a = leitor.nextInt();

        leitor.close();

        // Saída de dados
        System.out.println("O fatorial desse número é: " + fatorial(a));
    }

}
