package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio16PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un frase");
		String frase = teclado.nextLine();
		System.out.println("Numero total de vocales: " + Contadorvocales(frase));
		
		
	}
	public static int Contadorvocales(String frase) {
		
		int contador = 0;
		for (int i = 0 ; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'i' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U' || frase.charAt(i) == 'I'  ) {
				contador++;
			}
		}
		return contador;
	}
}
