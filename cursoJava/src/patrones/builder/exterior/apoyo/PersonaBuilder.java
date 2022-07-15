package patrones.builder.exterior.apoyo;

public class PersonaBuilder {

	private Persona persona;
	
	
	public PersonaBuilder() { this.persona = new Persona(); }

	public PersonaBuilder nombre(String nombre) {
		this.persona.setNombre(nombre);
		return this;
	}

	public PersonaBuilder apellido(String apellido) {
		this.persona.setApellido(apellido);
		return this;
	}

	public PersonaBuilder profesion(String profesion) {
		this.persona.setProfesion(profesion);
		return this;
	}

	public PersonaBuilder edad(int edad) {
		this.persona.setEdad(edad);
		return this;
	}

	public PersonaBuilder ciudad(String ciudad) {
		this.persona.setCiudad(ciudad);
		return this;
	}

	public Persona build() {
		return persona;
	}

}
