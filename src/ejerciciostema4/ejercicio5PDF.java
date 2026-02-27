package ejerciciostema4;

public class ejercicio5PDF {

	public static void main(String[] args) {

		int numeros[] = generarArrayAleatorio(10);
		imprimirArray(numeros);

		System.out.println("INVERTIDO: ");
		int[] invertido = generarArrayInvertidov1(numeros);
		imprimirArray(invertido);
		invertidoArray(numeros);
		imprimirArray(numeros);
	}

	public static int[] generarArrayAleatorio(int tamanno) {
		int numeros[] = new int[tamanno];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10) + 1;
		}

		return numeros;
	}

	public static void imprimirArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] generarArrayInvertidov1(int array[]) {

		int[] arrayInv = new int[array.length];
		int j = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			arrayInv[i] = array[j];
			j--;
		}

		return arrayInv;
	}

	public static void invertidoArray(int array[]) {

		int j = array.length - 1;
		for (int i = 0; i < j; i++) {
			int aux = array[i];
			array[i] = array[j];
			array[j] = aux;
			j--;
		}

	}

}
