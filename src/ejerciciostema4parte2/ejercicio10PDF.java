package ejerciciostema4parte2;

public class ejercicio10PDF {

	public static void main(String[] args) {
		String [] nombres = {" luis", "Carlos ", "Victor", "Maria", "alberto", "Alejandra", "Lucia", "  Silvia", "dario", "Nerea"};
		
		System.out.println("Lista normal");
		imprimirArray(nombres);
		
		System.out.println("Lista Homogenea");
		ConvertirArrayMayusculas(nombres);
		
		imprimirArray(nombres);
		
		System.out.println("Lista Ordenada");
		ordenarArrayMayorMenor(nombres);
		
		imprimirArray(nombres);
	}
	private static void imprimirArray(String [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] +" ");
		}
		System.out.println();
	}
	private static void ConvertirArrayMayusculas(String [] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] =  array[i].toUpperCase().strip();
		}
	}
	private static void ordenarArrayMayorMenor(String [] array) {
		for(int i = 0; i < array.length - 1; i++) {
			
			int mayor = i;
			
			for(int j = i; j < array.length; j++) {
				if(array[j].compareToIgnoreCase(array[mayor]) < 0) {
					mayor = j;
				}
			}
			
			String aux = array[i];
			array[i] = array[mayor];
			array[mayor] = aux;	
		}
	}
	

}
