package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio6PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra;
		System.out.println("Dime una frase");
		palabra = teclado.nextLine();
		
		System.out.println(buscarLetras(palabra, 'A'));
			
		}
	public static int buscarLetras ( String palabra , char letra) {
		
		int conteoletras = 0;
		
		char letrasfrase [] = palabra.toCharArray();
		
		for (int i = 0; i < letrasfrase.length; i++) {
			if (Character.toLowerCase(letrasfrase[i]) == Character.toLowerCase(letra)) {
				conteoletras++;
				
			}
		}
		System.out.println("La frase contiene " + conteoletras + " letra(s) 'A'");
		return conteoletras;
		
	}
}
