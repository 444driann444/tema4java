package ejerciciostema4;

public class ejercicio13PDF {

	public static void main(String[] args) {
		int array2[] = { 2, 3, 2, 3, 1 };
		int array[] = generarArrayAleatorio(5);
		do {
			array = generarArrayAleatorio(5);
		} while (compararArray(array, array2) != true);
		
		imprimirArray(array);

	}

	public static int[] generarArrayAleatorio(int tamanio) {
		int numeros[] = new int[tamanio];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 5) + 1;
		}
		return numeros;
	}

	public static void imprimirArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static boolean compararArray(int array1[], int array[]) {
		// int tamaño es distinto return false

		if (array.length != array1.length) {
			return false;
		} else {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array[i]) {
					return false;
				} 
			}
		}
		
		return true;

	}
}
