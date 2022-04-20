package AutopistaPanamericana;

public abstract class MedioDePago {

	private String descripcion;
	
	
	abstract double aplicarDescuento(double monto);


	@Override
	public String toString() {
		return "MedioDePago [descripcion=" + descripcion + "]";
	}
	
	
	
	
}
