package AutopistaPanamericana;

public class Sube extends Electronico {

	private final static double DESCUENTO = 0.1;

	public Sube(int cantidadDiasDemora) {
		super(cantidadDiasDemora);
	}
	
	public double aplicarDescuento(double monto) {
		return monto -= monto*DESCUENTO;
	}
	
}
