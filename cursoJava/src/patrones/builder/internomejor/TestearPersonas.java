package patrones.builder.internomejor;

public class TestearPersonas {

	public static void main(String[] args) {

		// con una persona con su propio builder
		Persona pc = new Persona.Builder()
				.nombre("Ernesto")
				.apellido("Martinez")
				.profesion("Pescadero")
				.edad(42)
				.ciudad("Cadiz")
				.build();
		

		System.out.println( pc );
	}

}
