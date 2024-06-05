package Aula13.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TorreDeHanoi {
    public static void main(String[] args) {
        // Declaração de variáveis
        int qtdDiscos = 0;

        // Entrada de dados
        qtdDiscos = lerNumeroDoTeclado();

        // Processamento

        movimentarDisco(qtdDiscos, "Origem", "Meio", "Destino");
    }

    // Função para dar as instruções de movimentação
    static void movimentarDisco(int qtdDiscos, String Origem, String Meio, String Destino) {
        if (qtdDiscos <= 0) {
            return;
        }
        movimentarDisco(qtdDiscos - 1, Origem, Destino, Meio);
        System.out.println("Movimente o disco " + qtdDiscos + " de " + Origem + " para " + Destino);
        movimentarDisco(qtdDiscos - 1, Meio, Origem, Destino);
    }

    // Função para ler os números e informar os erros
    static int lerNumeroDoTeclado() {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            try {
                numero = Integer.parseInt(leitor.readLine());
                if (numero <= 0) {
                    throw new Exception();
                }
            } catch (Exception erro) {
                System.out.println("Tente novamente (um número inteiro e positivo)");
                numero = -1;
            }

        } while (numero < 0);

        return numero;
    }

}
