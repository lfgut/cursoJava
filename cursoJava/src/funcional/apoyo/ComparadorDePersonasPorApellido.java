package funcional.apoyo;

import java.util.Comparator;

import libreta.Persona;

public class ComparadorDePersonasPorApellido implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) { 
		return o1.getApellido().compareToIgnoreCase( o2.getApellido() );
	}
}
