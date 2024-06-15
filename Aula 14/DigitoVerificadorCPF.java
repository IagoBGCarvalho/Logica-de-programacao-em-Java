package Aula14.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitoVerificadorCPF {

    public static void main(String[] args) {
        // Declaração de variáveis

        String cpf = "";

        cpf = lerCPFdoTeclado();

        validarCPF(cpf);
    }

    private static String lerCPFdoTeclado() {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        String retorno = "";

        try {

            System.out.println("Digite o CPF:");
            retorno = leitor.readLine();

        } catch (Exception erro) {}
        
        return retorno;
    }

    private static void validarCPF(String cpf) {

        try{

        if (cpf.length() != 11) {
            throw new Exception();
        }

        int dv1 = 0;

        for (int i = 0; i < 9; i++) {
            dv1 += ((10 - i) * Integer.parseInt(cpf.substring(i, i + 1)));
        }

        dv1 = (dv1 % 11);
        dv1 = (11 - dv1);

        if (dv1 >= 10) {
            dv1 = 0;
        }

        int dv2 = 0;

        for (int i = 0; i < 10; i++) {
            dv2 += ((11 - i) * Integer.parseInt(cpf.substring(i, i + 1)));
        }

        dv2 = (dv2 % 11);
        dv2 = (11 - dv2);

        if (dv2 >= 10) {
            dv2 = 0;
        }

        if ((dv1 != Integer.parseInt(cpf.substring(9, 10))) || (dv2 != Integer.parseInt(cpf.substring(10)))) {
            throw new Exception();
        }

        System.out.println("CPF Válido!");

        } catch (Exception erro) {
        System.out.println("CPF inválido!");
        }
    }

}
