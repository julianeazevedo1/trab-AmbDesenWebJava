import java.util.Arrays;

//public class Ordenacao {
//    public static void main(String[] args) {
//        int[] array = {10, 7, 8, 9, 1, 5};
//
//        System.out.println("Array original: " + Arrays.toString(array));
//
//        quickSort(array, 0, array.length - 1);
//
//        System.out.println("Array ordenado: " + Arrays.toString(array));
//    }
//
//    // Método principal do Quicksort
//    public static void quickSort(int[] array, int baixo, int alto) {
//        if (baixo < alto) {
//            // Particiona o array e obtém o índice do pivô
//            int pivôIndex = particionar(array, baixo, alto);
//
//            // Chama recursivamente o quicksort para as duas metades
//            quickSort(array, baixo, pivôIndex - 1);
//            quickSort(array, pivôIndex + 1, alto);
//        }
//    }
//
//
//    public static int particionar(int[] array, int baixo, int alto) {
//        // Escolhe o último elemento como pivô
//        int pivô = array[alto];
//        int i = (baixo - 1); // Índice do menor elemento
//
//        for (int j = baixo; j < alto; j++) {
//            // Se o elemento atual for menor ou igual ao pivô
//            if (array[j] <= pivô) {
//                i++;
//                // Troca array[i] e array[j]
//                trocar(array, i, j);
//            }
//        }
//
//        trocar(array, i + 1, alto);
//        return i + 1; // Retorna o índice do pivô
//    }
//
//
//    public static void trocar(int[] array, int i, int j) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
//}
//