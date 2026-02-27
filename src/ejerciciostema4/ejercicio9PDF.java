package ejerciciostema4;

public class ejercicio9PDF {

	public static void main(String[] args) {
		int array[] = generarArrayAleatorio(10);
		imprimirArray(array);
		
		do {
			array = generarArrayAleatorio(10);
		}while (sumarArray(array) != 0);
		imprimirArray(array);

	}

	public static int[] generarArrayAleatorio(int tamanno) {
		int numeros[] = new int[tamanno];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 21) - 10;

		}

		return numeros;
	}

	public static int sumarArray(int[] array) {

		int suma = 0;

		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}

		return suma;
	}

	public static void imprimirArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
