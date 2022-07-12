package carrerasdecoches;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import carrerasdecoches.apoyo.*;

public class CampeonatoCochesConMaleteroQueImplementsRunnable {


	
	public static void main(String[] args) {
		
		List<CocheConMaleteroRunnable> parrilla;
		List<Thread> listaHilos;
		
		
		System.out.println("Va a empezar la carrera");
		
		parrilla = cargar();
		pintar( parrilla );
		
		// Mala forma
		/*
		for (int i = 0; i < parrilla.size(); i++) {
			pintar( parrilla.get( i ));
		}
		*/
		
		System.out.println("\n Arranca la carrera");
		
		
		listaHilos = dameLosHilosDeLaCarrera( parrilla );
		
		System.out.println ( "Tengo " + parrilla.stream().count() + " coches en la parilla" );

		long tInicial = System.currentTimeMillis();
		
		arrancar( listaHilos );
		
		parrilla.stream().filter( new Predicate<CocheConMaleteroRunnable>() {
			public boolean test(CocheConMaleteroRunnable c) {
				return false;
				
			};
		}).count();
		
		
		pintar(parrilla);
		
		while ( aunHayAlguienCorriendo( listaHilos ) ) {}
			
		
		long tFinal = System.currentTimeMillis();

		System.out.println("\n\nLa carrera ha terminado y ha durado " 
				+ (tFinal - tInicial) + " ms");

		pintar(parrilla);

	}

	
	
	
	private static boolean aunHayAlguienCorriendo( List<Thread> listaHilos ) {
		//	comprobamos que aún hay alguien corriendo
		boolean laCarreraSigue = false;

		for (Thread	t : listaHilos )
			if (t.isAlive())
				laCarreraSigue = true;

		
		// Forma más clásica - antes era obligado hacerlo así
		// Iterator -> nos devuelve un conjunto que podemos recorrer UNA SOLA VEZ y SOLO hacia delante
		// hasNext() -> es true si aún existe un elemento más
		// & -> es un AND (Y) lógico que compruba AMBAS condicones siempre
		// && -> es un AND (Y) lógico que si la primera condición es falsa ya NO necesita comprobar la segunda
		// Mismo planteamiento para | y || o lógicos (OR)
		/*
		for ( Iterator<Thread> it = listaHilos.iterator(); !laCarreraSigue && it.hasNext() ; )
			if ( it.next().isAlive() )
				laCarreraSigue = true;
		*/
		
		return laCarreraSigue;
	}


	private static void arrancar(List<Thread> listaHilos) {
		for (Thread t : listaHilos) t.start();
	}
	

	private static void pintar(List<CocheConMaleteroRunnable> parrilla) {
		for (CocheConMaleteroRunnable c : parrilla) c.pinta();
	}

	private static List<CocheConMaleteroRunnable> cargar() {
		
		List<CocheConMaleteroRunnable> parrilla = new ArrayList<CocheConMaleteroRunnable>();
		
		parrilla.add( new CocheConMaleteroRunnable("Alonso T"  , new Maleta("Pequeña") {
			public void hacerCalceta() {
				System.out.println("Estoy haciendo calceta ");
				}
			}));
		parrilla.add( new CocheConMaleteroRunnable("Sainz T"   , new Maleta("Mediana") {} ) );
		parrilla.add( new CocheConMaleteroRunnable("Hamilton T", new Maleta("Grande") {} ) );
		
		return parrilla;
	}
	

	private static List<Thread> dameLosHilosDeLaCarrera( List<CocheConMaleteroRunnable> parrilla ){
		List<Thread> lt = new ArrayList<Thread>();
		
		for (CocheConMaleteroRunnable c : parrilla) {
			lt.add( new Thread( c, c.getNombre() ) );
		}
		
		return lt;
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
