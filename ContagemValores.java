import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContagemValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de entradas: ");
        int numEntradas = scanner.nextInt();

        List<Integer> dados = new ArrayList<>();


        System.out.println("Digite " + numEntradas + " números inteiros:");
        for (int i = 0; i < numEntradas; i++) {
            dados.add(scanner.nextInt());
        }


        if (dados.isEmpty()) {
            System.out.println("Nenhum dado foi inserido.");
            return;
        }


        int primeiroDado = dados.get(0);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();


        int contagem = contarValores(dados, primeiroDado, N);

        System.out.println("Número de valores entre " + primeiroDado + " e " + N + ": " + contagem);

        scanner.close();
    }


    public static int contarValores(List<Integer> dados, int primeiroDado, int N) {
        int contagem = 0;

        for (int numero : dados) {
            if (numero >= primeiroDado && numero <= N) {
                contagem++;
            }
        }

        return contagem;
    }
}

