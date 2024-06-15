package Aula14.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascaraTamanhoFixo {

    private static String lerTamanhoFixo(int tamanho) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        String retorno = "";

        while (retorno.length() != tamanho) {
            try {
                System.out.println("Digite um texto: ");
                retorno = leitor.readLine();
            } catch (Exception erro) {}

        }

        return retorno;
    }

    public static void main(String[] args) {
        // Declaração de variáveis
        String texto = "";

        // Entrada de dados
        texto = lerTamanhoFixo(6);

        // Saída de dados
        System.out.println(texto);
    }

}
