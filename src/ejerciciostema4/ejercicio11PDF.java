package ejerciciostema4;

public class ejercicio11PDF {

	public static void main(String[] args) {
		int array1[] = generarArrayAleatorio(10);
		int array2[] = generarArrayAleatorio(10);
		System.out.println("Array 1: ");
		imprimirArray(array1);
		System.out.println("Array 2: ");
		imprimirArray(array2);
		System.out.println("Array 1 ordenado: ");
		ordenarArrayMenorMayor(array1);
		imprimirArray(array1);
		System.out.println("Array 2 ordenado: ");
		ordenarArrayMenorMayor(array2);
		System.out.println("Array multiplicados");
		imprimirArray(multiplicaArray(array1, array2));
	
	}
	public static int[] generarArrayAleatorio(int tamanno) {
		int numeros[] = new int[tamanno];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10) + 1;

		}

		return numeros;
	}
	public static void imprimirArray (int array[]) {
		
		for (int i = 0 ; i < array.length;i++) {
			System.out.print( array[i] + " ");
		}
		System.out.println();
	}
	private static void ordenarArrayMenorMayor(int[] array) {

		for(int i = 0; i < array.length - 1; i++) {
			
			int menor = i;
			
			for(int j = i; j < array.length; j++) {
				if(array[j] < array[menor]) {
					menor = j;
				}
			}
			
			int aux = array[i];
			array[i] = array[menor];
			array[menor] = aux;
			
			System.out.print(i + " : ");
			imprimirArray(array);
		}

	}
public static int[] multiplicaArray (int array1 [], int array2 []) {
		
		int arraySuma [] = new int [10];
		for (int i = 0; i < arraySuma.length; i++) {
			     arraySuma[i] =  array1[i] * array2[i];
		}
		return arraySuma;
	}
}


