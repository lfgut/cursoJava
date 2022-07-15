package patrones.builder.enorden;

public class Persona {

	public static void main(String[] args) {
	
		// con una persona con su propio builder
		
		Persona pc = Persona.builder()
				.nombre("Ernesto")
				.apellido("Martinez")
				.profesion("Pescadero")
				.edad(42)
				.ciudad("Cadiz");
	
	
		System.out.println( pc );
	}

	private String nombre;
	private String apellido;
	private String profesion;
	private int edad;
	private String ciudad;
	
	public static String salto = "\n\t";

	Persona() { super(); }
	
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setApellido(String apellido) { this.apellido = apellido; }
	public void setEdad(int edad) { this.edad = edad; }
	public void setProfesion(String profesion) { this.profesion = profesion; }
	public void setCiudad(String ciudad) { this.ciudad = ciudad; }
		

	public String getApellido() { return apellido; }
	public String getProfesion() { return profesion; }
	public int getEdad() { return edad; }
	public String getCiudad() { return ciudad; }
	public String getNombre() { return nombre; }

	@Override
	public String toString() {
		return "Soy " + this.getClass().getSimpleName()
				+ salto+"Nombre   : " + getNombre()
				+ salto+"Apellido : " + getApellido()
				+ salto+"profesion: " + getProfesion()
				+ salto+"edad     : " + getEdad()
				+ salto+"ciudad   : " + getCiudad();
	}

	public static SetNombre builder() { return new Builder(); }

	public static class Builder
		implements SetNombre,SetApellido,
				SetProfesion,SetEdad,
				SetCiudad {

		private Persona persona;
		
		public Builder() { persona = new Persona(); }

		public SetApellido nombre(String nombre) {
			persona.nombre = nombre;
			return this;
		}

		public SetProfesion apellido(String apellido) {
			persona.apellido = apellido;
			return this;
		}

		public SetEdad profesion(String profesion) {
			persona.profesion = profesion;
			return this;
		}

		public SetCiudad edad(int edad) {
			persona.edad = edad;
			return this;
		}

		public Persona ciudad(String ciudad) {
			persona.ciudad = ciudad;
			return persona;
		}
		
	}
	
	
	// interface para poner nombre
	interface SetNombre { SetApellido nombre( String nombre ); }

	// interface para poner apellido
	interface SetApellido {	public SetProfesion apellido( String apellido ); }

	// interface para poner profesion
	interface SetProfesion { public SetEdad profesion( String profesion ); }

	// interface para poner edad
	interface SetEdad { SetCiudad edad( int edad ); }

	// interface para poner ciudad
	interface SetCiudad { Persona ciudad( String ciudad ); }

	// interface para contruir el objeto con todo
	//interface Build { Persona build(); }
	
}

