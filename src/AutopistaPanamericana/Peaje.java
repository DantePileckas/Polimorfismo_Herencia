package AutopistaPanamericana;

import java.util.ArrayList;
import java.util.Calendar;

public class Peaje {

	//attributes
	private String id;
	private String descripcion;
	private ArrayList<Cabina> cabinas;
	
	//constants
	final static double INCREMENTO = 0.08;
	final static int MIN_MAN = 6;
	final static int MAX_MAN = 6;
	final static int MIN_TAR = 6;
	final static int MAX_TAR = 6;
	

	
	
	public static int dameHoraActual() {
		int hora = Calendar.HOUR_OF_DAY;
		
		return hora;
	}
	
	public ArrayList<Cabina> cabinaConEfectivo(){
		ArrayList<Cabina> cabinasResultado = new ArrayList<Cabina>();
		MedioDePago medioDePago;
		
		for(Cabina c : cabinas) {
			if(c.getMedioDePago() instanceof Efectivo) {
				cabinasResultado.add(c);
			}			
		}
		return cabinasResultado;
	}
	
	public double promedioDemora() {
		double prom = 0;
		int i = 0;
		Electronico mdpe;
		
		for(Cabina c : cabinas) {
			if(c.getMedioDePago() instanceof Electronico) {
				mdpe = (Electronico) c.getMedioDePago();
				i++;
				prom += mdpe.getCantidadDiasDemora();
		}
		
		}
		
		return prom/i;
		
	}
	
}
