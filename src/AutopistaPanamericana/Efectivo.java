package AutopistaPanamericana;

public class Efectivo extends MedioDePago {

	private final static int DESCUENTO = 0;
	
	
	public double aplicarDescuento(double monto) {
		return monto -= monto*DESCUENTO;
	}

	
}
