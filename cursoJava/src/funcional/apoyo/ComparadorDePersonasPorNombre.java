package funcional.apoyo;

import java.util.Comparator;

import libreta.Persona;

public class ComparadorDePersonasPorNombre implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) { 
		return o1.getNombre().compareToIgnoreCase( o2.getNombre() );
	}

}
