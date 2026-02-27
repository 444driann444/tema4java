package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio11PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa la primera palabra");
		String palabra1 = teclado.nextLine();
		
		System.out.println("Ingresa la segunda palabra");
		String palabra2 = teclado.nextLine();
		
		
		String palabras1 = Convertiraminusculas(palabra1.toCharArray());
		String palabras2 = Convertiraminusculas(palabra2.toCharArray());
		
		String palabra1Ordenada = ordenarArrayMayorMenor(palabra1.toLowerCase().toCharArray());
		String palabra2Ordenada = ordenarArrayMayorMenor(palabra2.toLowerCase().toCharArray());
		
		if (palabra1Ordenada.equals(palabra2Ordenada)) {
			System.out.println("Son anagramas");
		}else {
			System.out.println("No son anagramas");
		}
		
		
	}

	private static void imprimirArray(String [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] +" ");
		}
		System.out.println();
	}
	private static String Convertiraminusculas(char [] palabra) {
		
		for (int i = 0; i < palabra.length; i++) {
			palabra[i] = Character.toLowerCase(palabra[i]) ;
		}
		return new String(palabra) ;
	}
	private static String ordenarArrayMayorMenor(char [] array) {
		for(int i = 0; i < array.length - 1; i++) {
			
			int mayor = i;
			
			for(int j = i; j < array.length; j++) {
				if(Character.toLowerCase(array[j]) < Character.toLowerCase(array[mayor])) {
					mayor = j;
				}
			}
			
			char aux = array[i];
			array[i] = array[mayor];
			array[mayor] = aux;	
		}
		
		return new String(array);
	}
}


