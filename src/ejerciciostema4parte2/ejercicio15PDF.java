package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio15PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = teclado.nextLine();
		System.out.println(CambiarAa(frase));


		
	}

	public static String CambiarAa(String palabra) {
		char corazon = 9825;
		String nuevaFrase = "";
		
		for (int i = 0; i < palabra.length(); i++) {	
			if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
				nuevaFrase = nuevaFrase + corazon;
			}	else {
				nuevaFrase = nuevaFrase + palabra.charAt(i);
			}
		}
		return nuevaFrase;
	}
}
