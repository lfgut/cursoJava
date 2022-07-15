package patrones.builder.exterior.apoyo;

public class Persona {

	private String nombre;
	private String apellido;
	private String profesion;
	private int edad;
	private String ciudad;
	
	public static String salto = "\n\t";

	 
	Persona() {
		super();
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
		

	public String getApellido() {
		return apellido;
	}

	public String getProfesion() {
		return profesion;
	}

	public int getEdad() {
		return edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getNombre() {
		return nombre;
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

	public static Object builder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}