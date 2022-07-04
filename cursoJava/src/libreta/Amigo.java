package libreta;

//							Clase es el molde - estructura de datos
public class Amigo extends Persona {

	//	atributos - para cada instancia de la clase -> Una instancia en un objeto -> es cada cosa concreta de una clase
	//  parte declarativa
	//  los atributos no deberían poder accederse desde fuera. Eso nos hace perder el control
	//  Debemos acceder a través de métodos para dotarles de conportamiento.
	//  get / set
	
	//	Bean en Java es una clase:
	//		cuyos atributos son privados, y tenemos getters y setters
	//		y tenemos un constructor sin parámetros
	
	/*
	public String nombre;
	public String apellido;
	public String profesion;
	public int edad;
	public String ciudad;
	*/
	
	
	
	
	//  Todos los métodos para modificar las variables deben estar dentro de la clase -> comportamiento
	
	
	
	// contructores -> Es un método aue se llaman igual a la clase y mplieza por mayúsculas
	// No define qué devuelve
	// Podemos tener tanto como queramos
	// Pueden ser public, private ...
	// Crea la zona de memoria para albergar los datos
	// Si no escribimos ninguno el sistema usa el contructor vacío
	public Amigo() {
		super();
	}

	public Amigo(String nombre, String apellido, String profesion, int edad, String ciudad) {
		super( nombre,  apellido,  profesion,  edad,  ciudad);
	}

	
	public Amigo(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	// comportamiento


	
// - - - - - - - - - - - - - - - - - - - - -	
	//	parte de ejecucion
	
	
	/*
	public Amigo(String nombre, String apellido, String profesion, int edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.profesion = profesion;
		this.edad = edad;
		this.ciudad = ciudad;
	}



	public void pinta() {
			
		pinta("Amigo 1 \n\tNombre: " + nombre 
			+ "\n\tApellido: " + apellido 
			+ "\n\tprofesión: " + profesion 
			+ "\n\tedad: " + edad
			+ "\n\tciudad: " + ciudad);
	}

	private void pinta(String string) {
		System.out.println(string);
		
	}
	
	*/
}
