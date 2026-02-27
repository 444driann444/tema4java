package ejerciciostema4;
import java.util.Random;

public class chatgpt {

    public static void main(String[] args) {

        Random random = new Random();

        // a) Array con 10 números aleatorios entre 1 y 10
        int[] arrayAleatorio = new int[10];

        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array aleatorio:");
        mostrarArray(arrayAleatorio);

        // c) Array del 1 al 10
        int[] arrayUnoAlDiez = new int[10];
        for (int i = 0; i < arrayUnoAlDiez.length; i++) {
            arrayUnoAlDiez[i] = i + 1;
        }

        // b) Poner a 0 los números que SÍ aparecen en el array aleatorio
        for (int i = 0; i < arrayUnoAlDiez.length; i++) {
            for (int j = 0; j < arrayAleatorio.length; j++) {
                if (arrayUnoAlDiez[i] == arrayAleatorio[j]) {
                    arrayUnoAlDiez[i] = 0;
                    break;
                }
            }
        }

        System.out.println("\nArray con los números que faltan (0 = no falta):");
        mostrarArray(arrayUnoAlDiez);

        // Array final solo con los números faltantes
        System.out.println("\nNúmeros que faltan:");
        for (int i = 0; i < arrayUnoAlDiez.length; i++) {
            if (arrayUnoAlDiez[i] != 0) {
                System.out.print(arrayUnoAlDiez[i] + " ");
            }
        }
    }

    // Método para mostrar arrays
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}