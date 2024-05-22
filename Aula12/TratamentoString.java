import java.util.Scanner;

public class TratamentoString {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);

        String texto = "";
        String remocao = "";
        String procura = "";
        int contagem = 0;

        // Entrada de dados
        System.out.print("Digite um texto: ");
        texto = leitor.nextLine();

        System.out.print("Digite um conteúdo para remover: ");
        remocao = leitor.nextLine();

        System.out.print("Digite um conteúdo para procurar: ");
        procura = leitor.nextLine();

        leitor.close();
        
        // Processamento
        System.out.println("Primeira letra: " + texto.charAt(0));
        System.out.println("Última letra: " + texto.charAt(texto.length() - 1));
        System.out.println("Tamanho: " + texto.length());
        System.out.println("Tudo maiúsculo: " + texto.toUpperCase());
        System.out.println("Tudo minúsculo: " + texto.toLowerCase());
        System.out.println("Texto após a remoção: " + texto.replaceAll(remocao, ""));

        int indice = 0;
        do {
            indice = texto.indexOf(procura, indice);
            if (indice != -1) {
                contagem++;
                indice++;
            }
        } while (indice != -1);
        System.out.println("Foram encontrados: " + contagem + " ocorrências!");
    }

}
