package Aula14.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascaraNumeroTelefone {
    public static void main(String[] args) {
        // Declaração de variáveis
        String telefone = "";

        // Entrada de dados
        
        telefone = lerNumeroTelefone();

        // Saída de dados

        System.out.println(telefone);
    }

    private static String lerNumeroTelefone() {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        String retorno = "";
        boolean tudoCerto = false;

        while (! tudoCerto) {
            try {
                System.out.println("Digite o número de telefone: ");
                retorno = leitor.readLine();

                // Teste do tamanho
                if (retorno.length() != 17) {
                    throw new Exception();
                }

                // Teste do começo com +

                if (! retorno.substring(0, 1).equals("+")) {
                    throw new Exception();
                }

                // Teste de número inteiro para as posições 1 e 2

                Integer.parseInt(retorno.substring(1, 3));

                // Teste da abertura do parêntese na posição 3

                if (! retorno.substring(3, 4).equals("(")) {
                    throw new Exception();
                }

                // Teste de número inteiro para as posições 4 e 5

                Integer.parseInt(retorno.substring(4, 6));

                // Teste de fechamento do parêntese na posição 6

                if (! retorno.substring(6, 7).equals(")")) {
                    throw new Exception();
                }

                // Teste de número inteiro para as posições de 7 a 11

                Integer.parseInt(retorno.substring(7, 12));

                // Teste de hífen na posição 12

                if (! retorno.substring(12, 13).equals("-")) {
                    throw new Exception();
                }

                // Teste de número inteiro para as posições 13 a 16

                Integer.parseInt(retorno.substring(13));

                tudoCerto = true;

            } catch (Exception erro) {
                System.out.println("Erro. Tente Novamente.");
            }

        }
        return retorno;
    }

}
