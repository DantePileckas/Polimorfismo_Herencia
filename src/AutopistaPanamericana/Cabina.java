package AutopistaPanamericana;

public class Cabina {

	
	private String id;
	private MedioDePago medioDePago;
	
	
	
	public double cobrar(Vehiculo vehiculo) {
		int horaActual = Peaje.dameHoraActual();
		double monto = vehiculo.getTarifa();
		
		if(esHoraPico(horaActual)) {
			monto = aplicarIncremento(monto);
		}
		
		return this.medioDePago.aplicarDescuento(monto);
	}
	
	private boolean esHoraPico(int horaActual) {
		boolean esHoraPico = false;
		
		if(horaActual>Peaje.MIN_MAN && horaActual<Peaje.MAX_MAN || horaActual>Peaje.MIN_TAR && horaActual<Peaje.MAX_TAR) {
			esHoraPico=true;
		}
		
		return esHoraPico;
		
	}
	
	private double aplicarIncremento(double monto) {
		return monto += monto*Peaje.INCREMENTO;
	}
	
	
	
}
