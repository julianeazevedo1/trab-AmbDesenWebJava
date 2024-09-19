//import java.util.Scanner;
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o valor de N (N > 1): ");
//        int N = scanner.nextInt();
//
//        if (N <= 1) {
//            System.out.println("Por favor, insira um número maior que 1.");
//        } else {
//            System.out.println("Os primeiros " + N + " termos da sequência de Fibonacci são:");
//            imprimirFibonacci(N);
//        }
//
//        scanner.close();
//    }
//
//    public static void imprimirFibonacci(int N) {
//        int a = 0, b = 1;
//
//        System.out.print(a + ", " + b); // Imprime os dois primeiros termos
//
//        for (int i = 2; i < N; i++) {
//            int proximo = a + b; // Calcula o próximo termo
//            System.out.print(", " + proximo);
//            a = b; // Atualiza a para o próximo
//            b = proximo; // Atualiza b para o próximo
//        }
//        System.out.println(); // Nova linha após a impressão
//    }
//}
//
//