package AutopistaPanamericana;

public class Sube extends Electronico {

	private final static double DESCUENTO = 0.1;

	public double aplicarDescuento(double monto) {
		return monto -= monto*DESCUENTO;
	}
	
}
