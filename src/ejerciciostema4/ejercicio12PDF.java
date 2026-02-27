package ejerciciostema4;

import java.util.Scanner;

public class ejercicio12PDF {

	public static void main(String[] args) {
		int array[] = generarArrayAleatorio (10);
		Scanner teclado = new Scanner(System.in);
		int posicionA ;
		do {
			System.out.println("Array 1;");
			imprimirArray(array);
			System.out.println("Indique el elemento del array que quiere eliminar");
			posicionA = teclado.nextInt();
			if (posicionA >= 0 && posicionA <= 9) {
				array = eliminarElementosLista(array, posicionA);
				System.out.println("El array quedaria de esta manera: ");
				imprimirArray(array);
			}else {
				System.out.println("Finaliza programa");
			}
			
		}while (posicionA >= 0 && posicionA <= 9);
		

	}

	public static int [] generarArrayAleatorio (int tamanio) {
		int numeros [] = new int [tamanio];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()* 10) + 1;
		}
		return numeros;
	}
	public static void imprimirArray (int array[]) {
		
		for (int i = 0 ; i < array.length;i++) {
			System.out.print( array[i] + " ");
		}
		System.out.println();
	}
	public static int [] eliminarElementosLista(int [] array, int posicion ) {
		
		int arrayCopia[] = new int [array.length - 1] ;
		int k = 0;
		for (int i = 0; i < array.length; i ++) {
				if (posicion != i) { 
					arrayCopia[k] = array[i]; 
					k++;
				}
				
		}
		return arrayCopia;
	}
}
