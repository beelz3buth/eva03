package entidad;

public class Estudiante {
	private Asignatura[] asignaturas;
	private int cantidadAsig;
	private String nombre;
	
	public Estudiante(String nombre) {
		if(nombre.trim().equals("") || nombre == null) {
			throw new IllegalArgumentException("Nombre vacio");
		}
		this.nombre = nombre;
		asignaturas = new Asignatura[10];
		cantidadAsig = 0;
	}
	
	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void addAsignatura(Asignatura a) {
		asignaturas[cantidadAsig] = a;
		cantidadAsig++;
	}
	public double promedio() {
		double sumaPromedio = 0;
		double sumaCredito = 0;
		for (int i = 0; i < cantidadAsig; i++) {
			sumaPromedio += asignaturas[i].promedio()*asignaturas[i].getCredito();
			sumaCredito += asignaturas[i].getCredito();
		}
		return sumaPromedio/sumaCredito;
	}
}
