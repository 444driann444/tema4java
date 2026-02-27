package ejerciciostema4;

public class ejercicio16PDF {

	public static void main(String[] args) {

		int matriz[][] = generarmatriz(3, 3, 1, 9);
		imprimirMatriz(matriz);
		System.out.println(imprimirSies5(matriz));

	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna] + " ");

			}
			System.out.println();
		}

	}

	public static int[][] generarmatriz(int tamano, int tamano2, int min, int max) {
		int matriz[][] = new int[tamano][tamano2];
		;

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				int numAleat = (int) (Math.random() * (max - min)) + min;
				matriz[fila][columna] = numAleat;

			}
		}
		return matriz;
	}

	public static boolean imprimirSies5 (int [] [] matriz){
	  for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna< matriz[fila].length; columna++) {
					if (matriz [fila] [columna] == 5) {
							return true;
						}
					
					}
			}
	  return false;
	  
	  
	}
}
