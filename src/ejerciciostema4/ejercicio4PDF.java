package ejerciciostema4;

import java.util.Scanner;

public class ejercicio4PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[10];
		leerNumerosDeTeclado(numeros, teclado);
		
		System.out.println("NUMEROS: ");
		imprimirNumeros(numeros);
		System.out.println("Los numeros estan ordenados: " + numerosOrdenados(numeros));

	}

	public static void leerNumerosDeTeclado(int num[], Scanner teclado) {
		System.out.println("Dime 10 numeros");
		for (int i = 0; i < num.length; i++) {
			num[i] = teclado.nextInt();
		}
		
	}
	
	public static void imprimirNumeros (int num [] ) {
		
		for ( int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	public static boolean numerosOrdenados (int num []) {
		for ( int i = 0; i < num.length - 1; i++) {
			if (num[i] > num[i+1]) {
				return false;
			}
			
		}
		return true;
	}
}
