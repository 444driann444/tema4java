package ejerciciostema4parte2;

import java.util.Scanner;

public class ejercicio14PDF {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero con como flotante");
		float numero = teclado.nextFloat();
		
		System.out.println("El numero con coma flotante es " + numero);
		
		
		String posicion = String.valueOf(numero);
		String parteEntera = "";
		String parteDecimal = "";
		for (int i = 0; i < posicion.length();i++) {
			if(posicion.charAt(i) == '.') {
				parteEntera = posicion.substring(0, i);
				parteDecimal = posicion.substring(i, posicion.length());
			}	
		}
		String parteEntera2 = Formatearentera(parteEntera);
		System.out.println(parteEntera2 + parteDecimal);	
	}
	public static String Formatearentera(String entera) {
		
		String resultado = "";
		int contador = 0;
		for (int i = entera.length()-1; i >= 0; i--) {
            resultado = entera.charAt(i) + resultado;
            contador++;

            if (contador == 3 && i > 0) {
                resultado = "," + resultado;  // separador de miles
                contador = 0;
            }
        }
		return resultado;
		
	}

}
