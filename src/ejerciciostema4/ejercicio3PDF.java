package ejerciciostema4;

public class ejercicio3PDF {

	public static void main(String[] args) {

		
		
		int[] numeros = new int[10];
		mostrarEnteros(numeros);
		ComprobarMásgrande(numeros);
		ComprobarMenosgrande(numeros);
		System.out.println("La suma de todos es " + ComprobarSumaDetodos(numeros) );
		System.out.println("La media de todos es " + ComprobarmediaNumeros(numeros));
		
		
	}

	
	public static void mostrarEnteros (int num []) {
		for (int i = 0; i < num.length; i++) {
		    num[i] = (int) (Math.random() * 100); 
		    System.out.print(num[i] + " ");
		}
	}
	public static void ComprobarMásgrande (int num  []) {
		int mayor = num[0];
		for (int i = 0; i < num.length; i++) {
		  if (mayor < num[i]) {
			  mayor = num[i];
			  
		  }
		}
		System.out.println();
		System.out.println("El numero mas grande es " + mayor);
	}
	public static void ComprobarMenosgrande (int num  []) {
		int minimo = num[0];
		for (int i = 0; i < num.length; i++) {
		  if (minimo > num[i]) {
			  minimo = num[i];
			  
		  }
		}
		System.out.println("El numero mas pequeño es " + minimo);
	}
	public static int ComprobarSumaDetodos (int num  []) {
		int suma = 0;
		for (int i = 0; i < num.length; i++) {
		  suma = suma + num[i];
		}
		return suma;
	}
	public static int ComprobarmediaNumeros(int num  []) {
		int media = ComprobarSumaDetodos(num) / 10;
		return media;
	}
	
	
	
}
