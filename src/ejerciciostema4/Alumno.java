package ejerciciostema4;

import java.util.Arrays;

public class Alumno {

	private float notas [] = new float [5];
	private String nombre;
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		generarArrayAleatorio();
	}
	

	public float[] getNotas() {
		return notas;
	}


	public void setNotas(float[] notas) {
		this.notas = notas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void generarArrayAleatorio() {
		for(int i = 0; i < notas.length; i++) {
			notas[i] = (float) (Math.random() * 10);
		}
	}
	
	public float calcularMedia() {
		
		float suma = 0;
		for(int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		
		float media = suma / notas.length;
		return media;
	}


	@Override
	public String toString() {
		return "\n\tAlumno [" + nombre + ", notas=" + Arrays.toString(notas) + ", nota media: " + calcularMedia() +"]";
	}
}
