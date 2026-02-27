package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio13PDF {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la palabra");
		String palabra = teclado.nextLine();
		System.out.println("Introduce el numero de rotaciones");
		int num =  teclado.nextInt();
		System.out.println(palabraRotada(palabra, num)); 
		
		
		
		
		
	}
	public static String palabraRotada(String palabra, int rotaciones) {
		String parte1 = palabra.substring(rotaciones,palabra.length());
		String parte2 = palabra.substring(0,rotaciones);
		String palabraRotada = parte1 + parte2  ;
		
		 return palabraRotada;
	}

}
