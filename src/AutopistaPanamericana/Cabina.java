package AutopistaPanamericana;

public class Cabina {

	
	private String id;
	private MedioDePago medioDePago;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}

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
	
	public boolean aceptaMedioDePagoElectronico() {
		return getMedioDePago() instanceof Electronico;
	}
	
}
