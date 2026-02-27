package ejerciciostema4;

public class ejercicio7PDF {

	public static void main(String[] args) {
		
		int numeros[] = generarArrayAleatorio(10);
		imprimirArray(numeros);
		
		System.out.println(buscarNumArray(6, numeros));
		rellenarNumerosFaltan(numeros);
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
	public static boolean buscarNumArray (int num, int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;
	}
	public static void rellenarNumerosFaltan (int array[]) {	
		int arrayComp [] = new int [array.length ];	
		for (int i = 1; i <= 10; i++) {
			if (buscarNumArray(i, array) == false) {
					arrayComp[i - 1] = i;
			}
		
		}
		imprimirArray(arrayComp);
		
	}
}
