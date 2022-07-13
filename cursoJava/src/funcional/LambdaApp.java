package funcional;

import java.util.*;
import funcional.apoyo.*;
import java.util.stream.Collectors;

import libreta.Persona;

public class LambdaApp {
	
	
	
	public void ordenar() {
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new PersonaConcreta("Rosa", "Perez", "Dentista",31,"Jerez") );
		
		//Persona pers = new Persona("Pedro","Martinez","Conductor",27,"Cordoba") {};

		//lista.add( pers );
		
		lista.add(new Persona("Pepe","Rodriguez","Gruista",28,"Huelva") {});
		//lista.add(new Persona("Pedro","Martinez","Conductor",27,"Cordoba") {} );
		lista.add(new Persona("Juan","Sanchez","Policia",35,"Sevilla") {} );
		lista.add(new Persona("Pedro","Martinez","Conductor",27,"Cordoba") {} );
		
		//lista.add( pers );
		
		
		lista.stream().forEach( p -> System.out.println( p ) );
		
		/*
		for (Persona persona : lista) {
			System.out.println( persona );
		}
		*/
		
		System.out.println("--");
		
		
		// Sumas con y sin variables de resultados intermedios
		int a=1, b=2, c=3, intermedio=4, e;	// declaramos/inicializamos varios enteros
		
		// con resultados intermedios
		intermedio = a + b;
		e =	intermedio + c;
		
		// sin resultados intermedios - del tirón
		e = a + b + c;
		
		
		
		
		//lista.sort();
		// primera aproximación, con una clase instanciada
		/*
		ComparadorDePersonasPorEdad cp = new ComparadorDePersonasPorEdad();
		Collections.sort( lista, cp );
		*/
		
		// segunda aproximación instanciamos la clase al vuelo
		//Collections.sort( lista, new ComparadorDePersonasPorEdad() );
		
		// tercera aproximacion: sin tener que crear una clase "Comparador de Personas"
		//	vamos a poner código al vuelo a una clase anónima
		
		//		Con un método de la clase Collections
		/*
		Collections.sort( lista, new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				int resultado = 0;
				if ( o1.getEdad() > o2.getEdad()  ) { resultado = 1;
				} else if ( o1.getEdad() < o2.getEdad()  ) { resultado = -1; }
				return resultado;
			}
		});
		*/
		
		//	Con un método de la propia lista
		/*
		lista.sort( new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				int resultado = 0;
				if ( o1.getEdad() > o2.getEdad()  ) { resultado = 1;
				} else if ( o1.getEdad() < o2.getEdad()  ) { resultado = -1; }
				return resultado;
			}
		});
		*/
		
		//	Para comprobar si dos Personas son iguales
		Persona ppp1 = new Persona("Pedro","Martinez","Conductor",27,"Cordoba") {};
		Persona ppp2 = new Persona("Pedro","Martinez","Conductor",27,"Cordoba") {};

		System.out.println("Las dos pesonas son " + ( ppp1.equals(ppp2) ? "iguales" : "diferentes") );
		
		
		// para poder ordenar por otro criterio
		//lista.sort( new ComparadorDePersonasPorNombre() );
		//lista.sort( new ComparadorDePersonasPorApellido() );
		//lista.sort( new ComparadorDePersonasPorEdad() );
		
		//		ahora con STREAMS
		// por nombre
		/*
		List<Persona> listaFinal = lista.stream()
				.sorted(
						new Comparator<Persona>() {
							@Override
							public int compare(Persona o1, Persona o2) {
								return o1.getNombre().compareToIgnoreCase( o2.getNombre() );
							}
						}
					)
				.parallel()
				.collect( Collectors.toList());
		*/
		
		// por edad
		/*
		List<Persona> listaFinal = lista.stream()
				.sorted(
						new Comparator<Persona>() {
							@Override
							public int compare(Persona o1, Persona o2) {
	
								return Integer.valueOf( o1.getEdad() )
										.compareTo(
									Integer.valueOf( o2.getEdad() )
										);
							}
						}
					)
				.parallel()
				.collect( Collectors.toList());
		*/
		
		//	Por NOMBRE
		/*
		List<Persona> listaFinal = lista.stream()
				.sorted( (o1, o2) -> o1.getNombre().compareToIgnoreCase( o2.getNombre() ) )
				.parallel()
				.collect( Collectors.toList());
		*/
		
		//	Por EDAD
		List<Persona> listaFinal = lista.stream()
				.sorted(
						(o1, o2) -> Integer.compare( o1.getEdad(), o2.getEdad() ) 
					)
				.parallel()
				.collect( Collectors.toList());
		
		
		//System.out.println( lista );
		
		/*
		for (Persona persona : listaFinal) {
			System.out.println( persona );
		}
		*/
		
		//listaFinal.stream().forEach( p -> System.out.println(p) );
		
		//listaFinal.stream().forEach( System.out::println );
		
		//listaFinal.forEach( p -> System.out.println(p) );
		
		listaFinal.forEach( System.out::println );
		
	}

	public static void main(String[] args) {
		System.out.println("Empezamos");
		
		new LambdaApp().ordenar();
		
		
	}

}
