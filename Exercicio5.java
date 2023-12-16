import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos elementos terá o array:");
        int quantidadeDeElementos = input.nextInt();

        if (quantidadeDeElementos > 0) {
            System.out.println("Insira os elementos do array:");
            int[] nums = new int[quantidadeDeElementos];

            for (int i = 0; i < quantidadeDeElementos; i++) {
                nums[i] = input.nextInt();
            }

            int indicePivo = encontrarIndicePivo(nums);
            System.out.println("Índice Pivô = " + indicePivo);

        } else {
            System.out.println("Quantidade inválida de elementos! Deve ser um número inteiro positivo.");
        }

        input.close();
    }

    public static int encontrarIndicePivo(int[] nums) {
        int somaTotal = 0;
        for (int num : nums) {
            somaTotal += num;
        }

        int somaEsquerda = 0;
        for (int i = 0; i < nums.length; i++) {
            int somaDireita = somaTotal - somaEsquerda - nums[i];
            if (somaEsquerda == somaDireita) {
                return i;
            }
            somaEsquerda += nums[i];
        }

        return -1;
    }
}
