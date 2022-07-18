package patrones.builder.bb.interna;

public class TestearPersonas {

	public static void main(String[] args) {
		
		
		// con un builder
		PersonaBuilder.Persona pc = new PersonaBuilder()
				.nombre("Ernesto")
				.apellido("Martinez")
				.profesion("Pesacdero")
				.edad(42)
				.ciudad("Cadiz")
				.build();
		
		
		System.out.println( pc );
	}

}
