package AutopistaPanamericana;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
	

	public Peaje(String id) {
		super();
		this.id = id;
		this.cabinas = new ArrayList<Cabina>();
	}

	public ArrayList<Cabina> getCabinas() {
		return cabinas;
	}

	public void setCabinas(ArrayList<Cabina> cabinas) {
		this.cabinas = cabinas;
	}



	public void addC(String id, MedioDePago mdp) {
		cabinas.add(new Cabina(id,mdp));
	}
	
	public static int dameHoraActual() {
		Calendar calendario = new GregorianCalendar();
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		
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

	@Override
	public String toString() {
		return "Peaje [id=" + id + ", descripcion=" + descripcion + ", cabinas=" + cabinas + "]";
	}
	
}
