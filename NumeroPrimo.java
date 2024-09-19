//import java.util.Scanner;
//
//import java.util.Scanner;
//
//public class NumeroPrimo {
//
//    public static boolean primo(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        if (n <= 3) {
//            return true;
//        }
//        if (n % 2 == 0 || n % 3 == 0) {
//            return false;
//        }
//
//        for (int i = 5; i * i <= n; i += 6) {
//            if (n % i == 0 || n % (i + 2) == 0) {
//                return false;
//            }
//        }
//
//        return true; // Retornar true se o número for primo
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um número: ");
//        int number = scanner.nextInt();
//
//        if (primo(number)) {
//            System.out.println(number + " é um número primo.");
//        } else {
//            System.out.println(number + " não é um número primo.");
//        }
//    }
//}
//
//
//
//
//