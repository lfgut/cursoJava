package carrerasdecoches;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Random;

import carrerasdecoches.apoyo.*;

public class CampeonatoCochesExtiendenDeThread {

	private static Random random = new Random();
	private static final int LENTITUD_MIN = 15;
	private static final int LENTITUD_MAX = 20;
	
	public static void main(String[] args) {
		System.out.println("Va a empezar la carrera");
	
		Thread t1 = new CocheThread("Alonso T", dameLentidud() );
		Thread t2 = new CocheThread("Sainz T", dameLentidud());
		
		pintar(t1);
		pintar(t2);
		
		System.out.println("\n Arranca la carrera");
		
		long tInicial = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		
		pintar(t1);
		pintar(t2);

		
		while (t1.isAlive() || t2.isAlive() ) {}
		
		
		long tFinal = System.currentTimeMillis();

		System.out.println("\n\nLa carrera ha terminado y ha durado " 
				+ (tFinal - tInicial) + " ms");
		
		pintar(t1);
		pintar(t2);
	}
	
	private static int dameLentidud() {
		return random.nextInt(LENTITUD_MAX-LENTITUD_MIN) + LENTITUD_MIN;
	}

	private static void pintar( Thread hilo ) {
				System.out.println( "\nN " + hilo.getName()
				+ "\nI " + hilo.getId()
				+ "\nS " + hilo.getState()
				+ "\nP " + hilo.getPriority()
				+ "\nG " + hilo.getThreadGroup()
				+ "\ns " + hilo.interrupted()
				);
	}
	
	
	

}
