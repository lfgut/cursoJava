package carrerasdecoches;

import java.util.*;

import carrerasdecoches.apoyo.*;

public class CampeonatoCochesConMaleteroQueImplementsRunnable {


	
	public static void main(String[] args) {
		
		List<CocheConMaleteroRunnable> parrilla = new ArrayList<CocheConMaleteroRunnable>();
		List<Thread> listaHilos = new ArrayList<Thread>();
		
		
		System.out.println("Va a empezar la carrera");
	
		parrilla.add( new CocheConMaleteroRunnable("Alonso T"  , new Maleta("Pequeña") {
			public void hacerCalceta() {
				System.out.println("Estoy haciendo calceta ");
				}
			}));
		parrilla.add( new CocheConMaleteroRunnable("Sainz T"   , new Maleta("Mediana") {} ) );
		parrilla.add( new CocheConMaleteroRunnable("Hamilton T", new Maleta("Grande") {} ) );
		
		for (CocheConMaleteroRunnable c : parrilla) c.pinta();
		
		// Mala forma
		/*
		for (int i = 0; i < parrilla.size(); i++) {
			pintar( parrilla.get( i ));
		}
		*/
		
		System.out.println("\n Arranca la carrera");
		
		
		
		for (CocheConMaleteroRunnable c : parrilla) {
			listaHilos.add( new Thread( c, c.getNombre() ) );
		}
		

		long tInicial = System.currentTimeMillis();
		
		for (Thread t : listaHilos) {
			t.start();
		}

		for (CocheConMaleteroRunnable c : parrilla) c.pinta();
		
		

		//	comprobamos que aún hay alguien corriendo
		boolean laCarreraSigue;
		do {
			laCarreraSigue = false;
			for (Thread	t : listaHilos ) {
				{
					if (t.isAlive()) laCarreraSigue = true;
				}
			}
		} while (laCarreraSigue);
			
		
		long tFinal = System.currentTimeMillis();

		System.out.println("\n\nLa carrera ha terminado y ha durado " 
				+ (tFinal - tInicial) + " ms");

		for (CocheConMaleteroRunnable c : parrilla) c.pinta();

	}
	


	
	//	 No es la mejor manera
	/*
	private static void pintar( Thread hilo ) {
				System.out.println( "\nN " + hilo.getName()
				+ "\nI " + hilo.getId()
				+ "\nS " + hilo.getState()
				+ "\nP " + hilo.getPriority()
				+ "\nG " + hilo.getThreadGroup()
				+ "\ns " + hilo.interrupted()
				);
	}
	*/
	
	

}
