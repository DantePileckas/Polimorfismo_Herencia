package AutopistaPanamericana;

public abstract class Electronico extends MedioDePago{

	private int cantidadDiasDemora;
	

	public int getCantidadDiasDemora() {
		return cantidadDiasDemora;
	}

	public void setCantidadDiasDemora(int cantidadDiasDemora) {
		this.cantidadDiasDemora = cantidadDiasDemora;
	}
	
	abstract double aplicarDescuento(double monto);

	
	
	
}
