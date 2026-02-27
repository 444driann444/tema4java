package ejerciciostema4;

public class ejercicio1PDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numeros [] = {9,2,4,5,10,30,8,4,7,9};
		imprimirNumeros(numeros);
		System.out.println("Cantidad total de pares : " + contarPares(numeros));
		
		
	}

	public static void imprimirNumeros (int num [] ) {
		
		for ( int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	public static int contarPares (int num []) {
		int contadorpares = 0;
		for ( int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				contadorpares ++;
			}
		}
		
		return contadorpares; 
		
	}
	
}
