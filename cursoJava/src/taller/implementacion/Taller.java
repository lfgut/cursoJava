package taller.implementacion;

import java.util.*;
import java.util.stream.*;

import taller.modelo.*;

public class Taller implements Arreglable{

	private List<Arreglable> taller;
	public static final int CAPACIDAD = 5;

	public Taller() { taller = new ArrayList<Arreglable>(); }

	public boolean cargar( Arreglable arreglable ) {
		boolean cargado = false;
		if (taller.size() < CAPACIDAD ) {
			taller.add( arreglable );
			cargado = true;
			System.out.println("Cargado un nuevo arreglable");
		} else {
			System.out.println("Ya no caben más");
		}
		return cargado;
	}
	
	public boolean arreglar() {
		boolean arreglado = false;
		
		if ( estaRoto() ) {
			// solo arreglar los que estén rotos
			taller.stream()
				.parallel()
				.filter( Arreglable::estaRoto )
				.forEach( Arreglable::arreglar );
			
			//taller.forEach( Arreglable::arreglar );
			arreglado = true;
		} 
		
		/*
		if ( !this.arreglado) {
			for (Arreglable arreglable : taller) {
				arreglable.arreglar();
			}
			arreglado = true;
		}
		*/
		return arreglado;
	}
	
	@Override
	public boolean estaRoto() { 
		// está roto en el momento en el que hay ALGUNO roto
		return taller.stream().anyMatch( Arreglable::estaRoto );
		//return !estaArreglado();
	}

	@Override
	public boolean estaArreglado() {
		//	está arreglado SOLO si TODOS están arreglados
		return taller.stream().allMatch( Arreglable::estaArreglado );
		//return arreglado;
		};

	public void pintar() {
		System.out.println( toString() );
	}
	
	@Override
	public String toString() {
		String separador = "\n\t\t";
		return "Soy un taller y contengo:" + separador +
				taller.stream()
				.map( Arreglable::toString )
				.collect( Collectors.joining( separador ) );
	}

	
	
	
}
