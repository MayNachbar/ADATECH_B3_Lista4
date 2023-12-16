import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira quantos números quer utilizar no array:");
        int quantidadeDeNumeros = input.nextInt();
        if (quantidadeDeNumeros > 0) {
            int[] A = new int[quantidadeDeNumeros];
            int[] B = new int[quantidadeDeNumeros];

            for (int i = 0; i < quantidadeDeNumeros; i++){
                System.out.printf("Insira o número %d do array A:\n", i+1);
                A[i] = input.nextInt();
            }
            for (int i = 0; i < quantidadeDeNumeros; i++){
                System.out.printf("Insira o número %d do array B:\n", i+1);
                B[i] = input.nextInt();
            }

            int[] resultado = concatenarAlternado(A, B);
            imprimirArray(resultado);
        } else {
            System.out.println("Quantidade inválida de números!");
        }

        input.close();
    }

    public static int[] concatenarAlternado(int[] A, int[] B) {
        int tamanho = A.length * 2;
        int[] resultado = new int[tamanho];

        int indiceResultado = 0;
        for (int i = 0; i < A.length; i++) {
            resultado[indiceResultado++] = A[i];
            resultado[indiceResultado++] = B[i];
        }
        return resultado;
    }

    public static void imprimirArray(int[] output) {
        System.out.print("Output: [");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
