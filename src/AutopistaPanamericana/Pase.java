package AutopistaPanamericana;

public class Pase extends Electronico {

	private final static double DESCUENTO_MAX = 0.12;
	private final static double DESCUENTO_MIN= 0.15;
	private final static int DIA_MIN = 5;

	
	public Pase(int cantidadDiasDemora) {
		super(cantidadDiasDemora);
	}
	
	
	public double aplicarDescuento(double monto) {
		int diasDemora = super.getCantidadDiasDemora();
		
		if(conDemora(diasDemora)) {
			monto -= monto*DESCUENTO_MIN;
		} else {
			monto -= monto*DESCUENTO_MAX;
		}
	
		return monto;
	}	
	
	private boolean conDemora(int dias) {
		boolean conDemora = false ;
		
		if(dias>=DIA_MIN) {
			conDemora=true;
		}
		
		return conDemora;
			
	}
	
	@Override
	public String toString() {
		return "Pase []";
	}

	
}
