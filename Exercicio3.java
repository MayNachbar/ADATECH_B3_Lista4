import java.util.Scanner;

public class Exercicio3 {
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

            int[] output = somar(nums);
            imprimirArraySomaAcumulada(output);
        } else {
            System.out.println("Quantidade inválida de elementos! Deve ser um número inteiro positivo.");
        }

        input.close();
    }

    public static int[] somar(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] + nums[i];
        }
        return output;
    }

    public static void imprimirArraySomaAcumulada(int[] output) {
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