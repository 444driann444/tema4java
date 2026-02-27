package ejerciciostema4;

public class ejercicio10PDF {

	
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
		imprimirArray(array2);
		System.out.println("Array juntos");
		imprimirArray(sumaArray(array1, array2));
		System.out.println("Ordenar Array juntos");
		ordenarArrayMenorMayor(sumaArray(array1, array2));
		
	
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
	public static int[] sumaArray (int array1 [], int array2 []) {
		
		int arraySuma [] = new int [array1.length + array2.length];
		int empiezaSegundoArray = array1.length;
		for (int i = 0; i < array1.length; i++) {
			     arraySuma[i] =  array1[i];
		}
		
		for (int j = 0; j < array2.length; j++) {
			arraySuma[j + empiezaSegundoArray] = array2[j];
		}
		
		
		return arraySuma;
		
	}
}
