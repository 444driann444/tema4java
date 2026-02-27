package ejerciciostema4parte2;

public class ejercicio9PDF {

	public static void main(String[] args) {
		String [] nombres = {"Luis", "Carlos", "Victor", "Maria", "Alberto", "Alejandra", "Lucia", "Silvia", "Dario", "Nerea" };
		
		imprimirArray(nombres);
		ordenarArrayMayorMenor(nombres);
		imprimirArray(nombres);
		
	}
	
	private static void imprimirArray(String [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}
	private static void ordenarArrayMayorMenor(String [] array) {
		for(int i = 0; i < array.length - 1; i++) {
			
			int mayor = i;
			
			for(int j = i; j < array.length; j++) {
				if(array[j].compareTo(array[mayor]) < 0) {
					mayor = j;
				}
			}
			
			String aux = array[i];
			array[i] = array[mayor];
			array[mayor] = aux;
		}
	}
}
