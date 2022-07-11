package carrerasdecoches.apoyo;

public class CocheConMaleteroRunnable extends CocheConMaletero implements Runnable {

	private int lentitud = 10;
	private String nombre;
	
	public CocheConMaleteroRunnable(String nombre, int lentitud) {
		super();
		this.setNombre(nombre);
		this.lentitud = lentitud;
	}

	@Override
	public void run() {
		
		// Esto se pued hacer
		//int a=0, b=2, c=3;
		
		for ( int i=0; i<=100 ; i++ ) {
			System.out.println( lentitud + " Soy " + this.getNombre()
				+ " y estoy en la vuelta " + i);
			
			
				Thread t = Thread.currentThread();
				t.yield();
				
				try {
					t.sleep(lentitud);
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
		// st.append( "\nI " + getId() ) ;
		//st.append( "\nS " + getState() );
		//st.append( "\nP " + getPriority() );
		//st.append( "\nG " + getThreadGroup() );
		//st.append( "\ns " + interrupted() );
		return  st.toString();
	}
	
	

	

}
