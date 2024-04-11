import java.util.Scanner;
public class MediaTurma {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double nota = 0;
		double somatorioNota = 0;
		double quantidadeAlunos = 0;
		double mediaTurma = 0;
		String opcao = "";
		
		// Entrada de dados
		do {
			do {
				System.out.print("Digite a nota do aluno: ");
				nota = leitor.nextDouble();
			} while ((nota < 0) || (nota > 10));
			
			quantidadeAlunos++;
			somatorioNota += nota;
			
			do {
				System.out.print("Digite <S> para mais alunos ou <N> se a turma acabou: ");
				opcao = leitor.next();
			} while ((! opcao.equalsIgnoreCase("S")) && (! opcao.equalsIgnoreCase("N"))); 
			
		} while (opcao.equalsIgnoreCase("S"));
		
		leitor.close();
		
		// Processamento
		
		mediaTurma = (somatorioNota / quantidadeAlunos);
		
		// Saída de dados
		System.out.println("A média da turma é: " + mediaTurma);
		
		if (mediaTurma >= 6) {
			System.out.println("Até que tá boa!");
		} else {
			System.out.println("Precisa melhorar!");
		}
	}

}
