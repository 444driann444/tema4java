package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio17PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = teclado.nextLine();
		
		char corazon = 9825;
		
		String frasecora = frase.replace('a', corazon);
		System.out.println( "Esta es la frase con corazones: "  + frasecora);
	}

}
