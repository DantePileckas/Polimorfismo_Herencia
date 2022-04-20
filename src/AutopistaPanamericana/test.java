package AutopistaPanamericana;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancia de Peaje
		Peaje peaje = new Peaje("p1");
		
	;		
		MedioDePago efectivo = new Efectivo();
		
		//Testeando el método agregar cabina
		peaje.addC("c1", efectivo);
		peaje.addC("c2", new Sube(3));
		peaje.addC("c3", new Pase(4));
		peaje.addC("c4", new Pase(2));
		peaje.addC("c5", efectivo);
		peaje.addC("c6", new Sube(2));
		peaje.addC("c7", new Pase(7));
		
		//Mostrando
		System.out.println(peaje.getCabinas());
		
		System.out.println();
		
		//Dame hora actual
		System.out.println("La hora actual es de: " + peaje.dameHoraActual());

		System.out.println();
		
		//Validando cabinas con Efectivo
		System.out.println(peaje.cabinaConEfectivo());

		System.out.println();
		
		//Prom
		System.out.println(peaje.promedioDemora());
		
		System.out.println();
		
		System.out.println(peaje.getCabinas().get(0).cobrar(new Vehiculo("p1",200.00,Categoria.AUTO)));
		System.out.println(peaje.getCabinas().get(1).cobrar(new Vehiculo("p2",250.00,Categoria.CAMION)));
		System.out.println(peaje.getCabinas().get(2).cobrar(new Vehiculo("p3",300.00,Categoria.AUTO)));
		System.out.println(peaje.getCabinas().get(3).cobrar(new Vehiculo("p4",1000.00,Categoria.AUTO)));
		System.out.println(peaje.getCabinas().get(4).cobrar(new Vehiculo("p5",200.50,Categoria.MOTO)));
		System.out.println(peaje.getCabinas().get(5).cobrar(new Vehiculo("p6",100.00,Categoria.CAMION)));
		System.out.println(peaje.getCabinas().get(6).cobrar(new Vehiculo("p7",100.00,Categoria.MOTO)));


	}

}
