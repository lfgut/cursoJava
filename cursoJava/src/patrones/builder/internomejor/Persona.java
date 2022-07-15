package patrones.builder.internomejor;

public class Persona {

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

	public static Builder build() { return new Builder(); }

	public static class Builder {

		private Persona persona;
		
		public Builder() { persona = new Persona(); }

		public Builder nombre(String nombre) {
			persona.nombre = nombre;
			return this;
		}

		public Builder apellido(String apellido) {
			persona.apellido = apellido;
			return this;
		}

		public Builder profesion(String profesion) {
			persona.profesion = profesion;
			return this;
		}

		public Builder edad(int edad) {
			persona.edad = edad;
			return this;
		}

		public Builder ciudad(String ciudad) {
			persona.ciudad = ciudad;
			return this;
		}

		public Persona build() {
			return persona;
		}
		
	}
}