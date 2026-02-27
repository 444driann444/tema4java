package ejerciciostema4parte2;

public class ejercicio2y3PDF {

	final static int LONGITUD_CADENA = 3;

	public static void main(String[] args) {
		String palabras[] = new String[1000];

		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = generarPalabraAleatoria();
		}

		for (int i = 0; i < palabras.length; i++) {
			if (contarPalabra(palabras, palabras[i]) >= 2) {
		}
	}
 }

	public static int contarPalabra(String[] array, String buscar) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(buscar)) {
				contador++;
			}
		}
		return contador;
	}

	public static void imprimirArray(String[] palabras) {
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}

	public static String generarPalabraAleatoria() {
		String palabra = "";

		for (int i = 0; i < LONGITUD_CADENA; i++) {
			char letraAleatoria = (char) ((Math.random() * 26) + 'A');
			if ((int) (Math.random() * 2) == 1) {
				letraAleatoria = Character.toLowerCase(letraAleatoria);
			}
			palabra = palabra + letraAleatoria;
		}

		return palabra;
	}
}
