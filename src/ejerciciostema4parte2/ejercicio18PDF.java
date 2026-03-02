package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio18PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una frase");
		String frase = teclado.nextLine();
		String fraseformateada = frase.toLowerCase().replace(" ", "");
		System.out.println(InvertirFrase(frase));
		System.out.println(fraseformateada);
		if (InvertirFrase(frase).equals(fraseformateada)) {
			System.out.println("La frase es palindromo");
		}else {
			System.out.println("La frase no es palindromo");
		}
	

	}

	public static String InvertirFrase(String frase) {
		String fraseformateada = frase.toLowerCase().replace(" ", "");
		char [] normal = fraseformateada.toCharArray();
		String fraseinvertida = "";
		for (int i = 0; i < normal.length; i++) {
			fraseinvertida =  normal[i] + fraseinvertida;
		}
		return fraseinvertida;
	}

}
