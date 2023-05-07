package entidad;

public class Nota {
	private double valor;
	private double ponderacion;
	
	public Nota(double valor, double ponderacion) {
		if(valor <= 0) {
			throw new IllegalArgumentException("Valor debe ser mayor a 0");
		}
		if(ponderacion <= 0) {
			throw new IllegalArgumentException("Ponderacion debe ser mayor a 0");
		}
		this.valor = valor;
		this.ponderacion = ponderacion;
	}
	
	public double getValor() {
		return valor;
	}
	public double getPonderacion() {
		return ponderacion;
	}
}
