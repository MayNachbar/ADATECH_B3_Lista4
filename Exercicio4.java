import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos começar a eleição, insira o nome dos 3 candidatos participantes:");

        String[] candidatos = new String[3];
        for (int i = 0; i < 3; i++) {
            candidatos[i] = input.nextLine();
        }

        Map<String, Integer> votos = new HashMap<>();

        System.out.println("Vamos começar a votação: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("O seu voto vai para qual candidato?");
            String nomeVoto = input.nextLine();

            boolean candidatoValido = false;
            for (String candidato : candidatos) {
                if (candidato.equals(nomeVoto)) {
                    candidatoValido = true;
                    break;
                }
            }

            if (candidatoValido) {
                votos.put(nomeVoto, votos.getOrDefault(nomeVoto, 0) + 1);
            } else {
                System.out.println("Voto nulo.");
            }
        }

        String vencedor = null;
        int maxVotos = 0;
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maxVotos) {
                vencedor = entry.getKey();
                maxVotos = entry.getValue();
            }
        }
        double porcentagemVencedor = (double) maxVotos / 10 * 100;
        System.out.println("Vencedor: Candidato " + vencedor + " com " + maxVotos + " votos, sendo " + porcentagemVencedor + "% da quantidade total de votos!");

        input.close();
    }
}
