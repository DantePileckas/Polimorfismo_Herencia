package AutopistaPanamericana;

public abstract class MedioDePago {

	private String descripcion;
	
	
	abstract double aplicarDescuento(double monto);
	
}
