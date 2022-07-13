package funcional.apoyo;

import java.util.Comparator;

import libreta.Persona;

public class ComparadorDePersonasPorEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return Integer.compare( o1.getEdad(), o2.getEdad() );
		
		
		/*
		return Integer.valueOf( o1.getEdad() )
					.compareTo(
				Integer.valueOf( o2.getEdad() )
					);
		*/

		/*
		return new Integer( o1.getEdad() )
				.compareTo(
				new Integer( o2.getEdad() )
					);
		*/
		
		/*
		int resultado = 0;
		if ( o1.getEdad() > o2.getEdad()  ) {
			resultado = 1;
		} else if ( o1.getEdad() < o2.getEdad()  ) {
			resultado = -1;
		}
		return resultado;
		*/
	}

}
