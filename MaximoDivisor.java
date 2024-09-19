//import java.util.Scanner;
//
//public class MDC {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro número (a): ");
//        int a = scanner.nextInt();
//
//        System.out.print("Digite o segundo número (b): ");
//        int b = scanner.nextInt();
//
//        int resultado = calcularMDC(a, b);
//        System.out.println("O Máximo Divisor Comum de " + a + " e " + b + " é: " + resultado);
//
//        scanner.close();
//    }
//
//    // Método para calcular o MDC usando o algoritmo de Euclides
//    public static int calcularMDC(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b; // O resto da divisão de a por b
//            a = temp;  // Atualiza a para o valor de b
//        }
//        return a; // Quando b for 0, a contém o MDC
//    }
//}

