package entidad;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
	private List<Nota> notas;
	private String nombre;
	private int credito;
	
	public Asignatura(String nombre, int credito) {
		if(nombre.trim().equals("") || nombre == null) {
			throw new IllegalArgumentException("Nombre vacio");
		}
		if(credito <= 0) {
			throw new IllegalArgumentException("Credito debe ser mayor a 0");
		}
		this.nombre = nombre;
		this.credito = credito;
		this.notas = new ArrayList<Nota>();
	}
	
	public List<Nota> getNotas() {
		return notas;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCredito() {
		return credito;
	}
	
	public double promedio() {
		double suma = 0;
		double ponderacionAcum = 0;
		for(Nota nota : notas) {
			suma = suma + ((Nota) nota).getValor()*nota.getPonderacion();
			ponderacionAcum = ponderacionAcum + nota.getPonderacion();
		}
		return suma/ponderacionAcum;
	}
	public double avance() {
		double ponderacionAcum = 0;
		for(Nota nota : notas) {
			ponderacionAcum += nota.getPonderacion();
		}
		return ponderacionAcum;
	}
}
