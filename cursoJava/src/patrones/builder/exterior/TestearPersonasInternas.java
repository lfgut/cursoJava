package patrones.builder.exterior;

import patrones.builder.exterior.apoyo.*;

public class TestearPersonasInternas {

	public static void main(String[] args) {

		// con un builder
		Persona pc = new PersonaBuilder()
				.nombre("Ernesto")
				.apellido("Martinez")
				.profesion("Pescadero")
				.edad(42)
				.ciudad("Cadiz")
				.build();
		
		Persona ps = new PersonaBuilder()
				.apellido("Gomez")
				.build();
		
		System.out.println( ps );
	}

}
