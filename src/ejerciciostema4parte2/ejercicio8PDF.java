package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio8PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		
		System.out.println("Ingrese una frase");
		frase = teclado.nextLine();
		
		System.out.println("La frase invertida se ve asi:");
		fraseInvertida(frase);
		

	}
	public static void fraseInvertida (String Frase) {
		char[] normal = Frase.toCharArray();
		String rellenar = " ";
		
		for (int i = 0; i < normal.length; i++) {
			rellenar = normal[i] + rellenar;
		}
		System.out.println(rellenar);
	}

}
