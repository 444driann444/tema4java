package ejerciciostema4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicios2PDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int[] array = new int[10];

		System.out.println("Dime 10 numeros enteros");
		for (int i = 0; i < 10; i++) {
			array[i] = teclado.nextInt();
		}

		imprimirEnteros(array);
		System.out.println(binayseaarch(array));
		System.out.println(sinBinatysearch(array));

	}

	public static void imprimirEnteros(int num[]) {

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

	public static boolean sinBinatysearch(int num[]) {
		int numero = 5;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == numero) {
				return true;
			}

		}
		return false;

	}

	public static boolean binayseaarch(int num[]) {
		Arrays.sort(num);
		int resul = Arrays.binarySearch(num, 5);
		System.out.println(resul);
		if (resul >= 0) {
			return true;
		} else {
			return false;
		}

	}
	/*
	 * public static boolean binarysearch.(int num []) {
	 * 
	 * return false; }
	 */
}
