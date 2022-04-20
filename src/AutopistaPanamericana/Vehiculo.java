package AutopistaPanamericana;

public class Vehiculo {

	
		private String patente;
		private double tarifa;
		private Categoria categoria;
	
		
		public Vehiculo(String patente, double tarifa, Categoria categoria) {
			super();
			this.patente = patente;
			this.tarifa = tarifa;
			this.categoria = categoria;
		}


		public String getPatente() {
			return patente;
		}


		public void setPatente(String patente) {
			this.patente = patente;
		}


		public double getTarifa() {
			return tarifa;
		}


		public void setTarifa(double tarifa) {
			this.tarifa = tarifa;
		}


		public Categoria getCategoria() {
			return categoria;
		}


		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}


		@Override
		public String toString() {
			return "Vehiculo [patente=" + patente + ", tarifa=" + tarifa + ", categoria=" + categoria + "]";
		}
	
		
		
		
		
		
	
	
}
