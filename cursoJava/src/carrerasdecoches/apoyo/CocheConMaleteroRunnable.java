package carrerasdecoches.apoyo;

import java.util.Random;

public class CocheConMaleteroRunnable extends CocheConMaletero implements Runnable {

	private static Random random = new Random( System.currentTimeMillis() );
	private static final int LENTITUD_MIN = 10;
	private static final int LENTITUD_MAX = 30;

	private String nombre;
	
	public CocheConMaleteroRunnable(String nombre, Maleta maleta) {
		super();
		this.setNombre(nombre);
		this.setMaleta( maleta );
	}

	@Override
	public void run() {
		
		// Esto se pued hacer
		//int a=0, b=2, c=3;
		
		for ( int i=0; i<=100 ; i++ ) {
			
			int lentitud = dameLentidud();
			
			System.out.println( lentitud + " Soy " + this.getNombre()
				+ " y tengo en mi maleta " + getMaleta()
				+ " y estoy en la vuelta " + i);
			
				Thread t = Thread.currentThread();
				t.yield();
				
				try {
					t.sleep( lentitud );
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//	En alguna parte del bucle se pasa el control al otro hilo
		}
		
		// La i no es accesible fuera del bucle
		//System.out.println("Estoy fuera del bucle " + i);
	}


	public void pinta() {
		System.out.println( this );
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder st = new StringBuilder("\nN " + getNombre());
		st.append( "\nM " + getMaleta() ) ;
		//st.append( "\nS " + getState() );
		//st.append( "\nP " + getPriority() );
		//st.append( "\nG " + getThreadGroup() );
		//st.append( "\ns " + interrupted() );
		return  st.toString();
	}
	
	
	private static int dameLentidud() {
		return random.nextInt(LENTITUD_MAX-LENTITUD_MIN) + LENTITUD_MIN;
	}
	

}
