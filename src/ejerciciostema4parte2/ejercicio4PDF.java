package ejerciciostema4parte2;

public class ejercicio4PDF {

	final static int LONGITUD_CADENA = 3;

	public static void main(String[] args) {
		String palabras[] = new String[500];

		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = generarPalabraAleatoria();
		}

		for (int i = 0; i < palabras.length; i++) {
			if (contarPalabra(palabras, palabras[i]) >= 2) {

				boolean imprime = true;

				for (int j = i - 1; j >= 0; j--) {
					if (palabras[j].equalsIgnoreCase(palabras[i])) {
						imprime = false;
					}
				}

				if (imprime == true) {
					System.out.println(palabras[i] + " : " + contarPalabra(palabras, palabras[i]));

				}

			}
		}
 }

	public static int contarPalabra(String[] array, String buscar) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase(buscar)) {
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
