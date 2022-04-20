package AutopistaPanamericana;

public abstract class Electronico extends MedioDePago{

	private int cantidadDiasDemora;
	
	public Electronico(int cantidadDiasDemora) {
		super();
		this.cantidadDiasDemora = cantidadDiasDemora;
	}

	public int getCantidadDiasDemora() {
		return cantidadDiasDemora;
	}

	public void setCantidadDiasDemora(int cantidadDiasDemora) {
		this.cantidadDiasDemora = cantidadDiasDemora;
	}
	
	abstract double aplicarDescuento(double monto);

	@Override
	public String toString() {
		return "Electronico [cantidadDiasDemora=" + cantidadDiasDemora + "]";
	}

	
	
	
}
