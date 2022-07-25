package taller.implementacion;

import taller.modelo.*;

public class TallerPruebas{

	
	// datos para ir cargando
	private static final int NUMERO_DE_VEHICULOS = 6;
	private static final Arreglable[] data = {
			new Coche("SEAT", "Leon", 1900, 3) ,
			new Moto("Kawasaki", "Ninja", 750, "4T"),
			new Coche("FORD", "Fiesta", 1200, 4) ,
			new Moto("Yamaha", "RD", 350, "2T"),
			new Coche("Renault", "Clio", 957, 5),
			new Moto("Honda", "CBR", 600, "4T")
		};
	
	
	public static void probar() {
		System.out.println("Empieza la prueba del taller");
		
		//	creamos un taller
		Taller taller = new Taller();
		
		// lo intentamos llenar
		for (int i = 0; i < NUMERO_DE_VEHICULOS; i++) {
			if (!taller.cargar(data[i])) System.out.println( "...nos hemos pasado" );
		}
	
		// mostramos información
		taller.pintar();
		
		// reparamos
		taller.arreglar();
		
		// mostramos
		taller.pintar();
		
		System.out.println("Termina la prueba del taller");

	}

}


	




