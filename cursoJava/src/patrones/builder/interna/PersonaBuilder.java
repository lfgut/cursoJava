package patrones.builder.interna;

public class PersonaBuilder {

	private Persona persona;
	
	public PersonaBuilder() {
		persona = new Persona();
	}

	public PersonaBuilder nombre(String nombre) {
		persona.nombre = nombre;
		return this;
	}

	public PersonaBuilder apellido(String apellido) {
		persona.apellido = apellido;
		return this;
	}

	public PersonaBuilder profesion(String profesion) {
		persona.profesion = profesion;
		return this;
	}

	public PersonaBuilder edad(int edad) {
		persona.edad = edad;
		return this;
	}

	public PersonaBuilder ciudad(String ciudad) {
		persona.ciudad = ciudad;
		return this;
	}

	

	public Persona build() {
		return persona;
	}



	public class Persona {
		
		private String nombre;
		private String apellido;
		private String profesion;
		private int edad;
		private String ciudad;
		
		private Persona() {
			super();
		}
		
		
		private static String salto = "\n\t";
		
		/*
		private void setNombre(String nombre) {this.nombre = nombre;}
		private void setApellido(String apellido) {this.apellido = apellido;}
		private void setEdad(int edad) {this.edad = edad;}
		private void setProfesion(String profesion) {this.profesion = profesion;}
		private void setCiudad(String ciudad) {this.ciudad = ciudad;}
		*/
		
		public String getApellido() {return apellido;}
		public String getProfesion() {return profesion;} 
		public int getEdad() {return edad;}
		public String getCiudad() {return ciudad;}
		public String getNombre() {return nombre;}

		@Override
		public String toString() {
			return "Soy " + this.getClass().getSimpleName()
					+ salto+"Nombre   : " + getNombre()
					+ salto+"Apellido : " + getApellido()
					+ salto+"profesion: " + getProfesion()
					+ salto+"edad     : " + getEdad()
					+ salto+"ciudad   : " + getCiudad();
		}
		
	}
}
