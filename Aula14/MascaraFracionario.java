package Aula14.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascaraFracionario {

    private static double digitarNumeroFracionario() {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        double retorno = 0;
        Boolean tudoCerto = false;

        while (! tudoCerto) {
            try {

                System.out.println("Digite um número real: ");
                retorno = Double.parseDouble(leitor.readLine());
                tudoCerto = true;

            } catch (Exception erro) {
                System.out.println("Erro! Tente de novo.");
            }
        
        }

        return retorno;
    }

    public static void main(String[] args) {
        // Declaração de variáveis
        double numero = 0;

        // Entrada de dados
        numero = digitarNumeroFracionario();

        // Saída de dados
        System.out.println(numero);
    }

}
