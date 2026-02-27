package ejerciciostema4;

public class ejercicio6PDF {

	public static void main(String[] args) {

		int[] array = generarArray(10, 1, 10);
		imprimirArray(array);

		ordenarArrayMenorMayor(array);
		imprimirArray(array);
		
		ordenarArrayMayorMenor(array);
		imprimirArray(array);


	}
	
	private static void imprimirArray(int [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
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

	private static void ordenarArrayMayorMenor(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			
			int mayor = i;
			
			for(int j = i; j < array.length; j++) {
				if(array[j] > array[mayor]) {
					mayor = j;
				}
			}
			
			int aux = array[i];
			array[i] = array[mayor];
			array[mayor] = aux;
			
			System.out.print(i + " : ");
			imprimirArray(array);
		}
	}
	
	private static int[] ordenarArrayMayorMenorSinModificarArrayOriginal(int[] array) {

		
		return null;
	}

	public static int[] generarArray(int tamano, int min, int max) {

		int[] array = new int[tamano];
		for (int i = 0; i < array.length; i++) {
			// array[i] = (int) (Math.random() * 10 + 1);
			array[i] = (int) (Math.random() * (max - min)) + min;
		}
		return array;
	}

}


