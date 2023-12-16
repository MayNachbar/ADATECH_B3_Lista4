import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número de alunos:");
        int quantidadeDeAlunos = input.nextInt();

        System.out.println("Insira o número de notas por aluno:");
        int quantidadeDeNotas = input.nextInt();

        if (quantidadeDeAlunos > 0 && quantidadeDeNotas > 0) {
            int[][] turma = new int[quantidadeDeAlunos][quantidadeDeNotas];

            for (int i = 0; i < quantidadeDeAlunos; i++) {
                System.out.println("Insira as " + quantidadeDeNotas + " notas para o Aluno " + i + ":");
                for (int j = 0; j < quantidadeDeNotas; j++) {
                    turma[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < turma.length; i++) {
                double somaNotasAluno = 0;
                for (int j = 0; j < turma[i].length; j++) {
                    somaNotasAluno += turma[i][j];
                }
                double mediaAluno = somaNotasAluno / quantidadeDeNotas;
                if (i < turma.length - 1 ) {
                    System.out.printf("Aluno %d - Média %.2f,%n", i, mediaAluno);
                } else {
                    System.out.printf("Aluno %d - Média %.2f%n", i, mediaAluno);
                    System.out.println(" ");
                }
            }

            double somaNotasTurma = 0;
            for (int i = 0; i < turma.length; i++) {
                for (int j = 0; j < turma[i].length; j++) {
                    somaNotasTurma += turma[i][j];
                }
            }
            double mediaTurma = somaNotasTurma / (quantidadeDeAlunos * quantidadeDeNotas);
            System.out.printf("Média da Turma: %.2f", mediaTurma);

        } else {
            System.out.println("Quantidade inválida de alunos ou notas! Ambos devem ser números inteiros positivos.");
        }

        input.close();
    }
}
