package ejerciciostema4;

public class ejercicio8PDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = generarArrayAleatorio(100);
		imprimirArray(numeros);
		generarlistaSinnumerosRepetidos(numeros);
	}

	public static int[] generarArrayAleatorio(int tamanno) {
		int numeros[] = new int[tamanno];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 50) + 1;
		}

		return numeros;
	}

	public static void imprimirArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static int[] generarlistaSinnumerosRepetidos(int numeros[]) {
		
		int [] sinduplicar = new int[numeros.length];
		int m = 0;
		for (int i = 0 ; i < 100; i++) {
			if (buscarNumArray(i, numeros) == true) {
				sinduplicar [m] = i;
				m++;
			}
		}
		imprimirArray(sinduplicar);
		return sinduplicar;
	}
public static boolean buscarNumArray (int num, int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;
	}
}
