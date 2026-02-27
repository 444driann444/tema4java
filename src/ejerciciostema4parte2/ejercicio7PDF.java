package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio7PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		System.out.println("Introduce una serie de caracteres");
		frase = teclado.nextLine();
		
		System.out.println(Contarnumeros(frase));

	}
	public static int Contarnumeros ( String palabra) {
		
		int suma = 0;
		
		char letrasfrase [] = palabra.toCharArray();
		
		for (int i = 0; i < letrasfrase.length; i++) {
			if (Character.isDigit(letrasfrase[i]) == true) {
				suma = suma + Character.getNumericValue(letrasfrase[i]);
				
			}
		}
		System.out.println("La suma de las cifras en la cadena es : " + suma);
		return suma;
		
	}
}
