package ejerciciostema4parte2;

public class ejercicio1pdf {

	public static void main(String[] args) {
		String [] mensajes = {"Pato", "Cielo", "Montaña", "Rio", "Sol", "Playa", "Pato", "Familia", "Amistad", "Pato"};
		int contadorPatos = buscarPlabra(mensajes, "Pato");
		System.out.println(contadorPatos);
	}
	public static int buscarPlabra (String[] mensajes, String palabra) {
		int conteopalbras = 0;
		
		for(int i = 0; i < mensajes.length; i++) {
			if (mensajes[i].equals(palabra)) {
				conteopalbras++;
			}			
		}
		return conteopalbras;

	}
}
