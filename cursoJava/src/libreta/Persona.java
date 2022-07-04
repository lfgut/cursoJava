package libreta;

//	Por favor, por favor, desarrollador, nunca instancies directamente Persona porque no tiene sentido.
//  Hazlo a través de una subclase
public abstract class Persona extends Object {

	protected String nombre;
	protected String apellido;
	protected String profesion;
	protected int edad;
	protected String ciudad;
	
	public static String salto = "\n\t";

	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, String profesion, int edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.profesion = profesion;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

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