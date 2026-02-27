package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio12PDF {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra");
		String palabra = teclado.nextLine();
		int num = 3;
		
		char [] palabras = palabra.toCharArray();
		String palabraCifrada = cifradoCesar(palabras, num);
		System.out.println(palabraCifrada);
		char [] palabraDesci = palabraCifrada.toCharArray();
		System.out.println("Descifrado");
		String palabraDescifrada = descifradoCesar(palabraDesci);
		System.out.println(palabraDescifrada);
	}

	private static String cifradoCesar( char [] array, int desfase) {
		
		String palabraCifrada = "";
		for (int i = 0; i < array.length; i++) {
			array[i] = Character.toLowerCase(array[i]);
			char letraCifrada = (char) (array[i] + desfase) ;
			if (letraCifrada > 'z') {
				letraCifrada = (char) ('a' + letraCifrada - 'z' - 1 );
			}
			
			palabraCifrada = palabraCifrada + letraCifrada;
		}
		return palabraCifrada;
	}
	private static String descifradoCesar( char [] array) {
		
		String palabraCifrada = "";
		for (int i = 0; i < array.length; i++) {
			array[i] = Character.toLowerCase(array[i]);
			char letraCifrada = (char) (array[i] - 3) ;
			if (letraCifrada < 'a') {
				letraCifrada = (char) ('z' + letraCifrada - 'a' + 1 );
			}
			
			palabraCifrada = palabraCifrada + letraCifrada;
		}
		return palabraCifrada;
	}
	
}
