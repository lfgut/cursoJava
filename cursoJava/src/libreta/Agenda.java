package libreta;

public class Agenda {

	public static void main(String[] args) {

		Persona a1;	//	declaracion
		
		a1 = new Amigo();	// inicializacion -> llama al contructor
		a1.setNombre("Pedro");
		a1.setApellido("Van den Brulle");
		a1.setProfesion("pintor");
		a1.setEdad(28);
		a1.setCiudad("Roma");
		
		Persona a2 = new Amigo("Ana", "Rodriguez", "directora", 31, "Paris");
		
		System.out.println(a1);
		System.out.println(a2);
		
		Persona.salto = "\t";
		
		System.out.println(a1);
		System.out.println(a2);
		
		// imprime todos tus amigos
				
		
		
		//a2.pinta();

		
		/*
		a1.nombre = "Pedro";
		a1.apellido = "Van Den Brulle";
		
		System.out.println(a1.nombre);
		System.out.println(a1.apellido);
		
		a1.nombre = "Peter";
		
		System.out.println(a1.nombre);
		System.out.println(a1.apellido);
		
		
		Amigo a2 = a1;
		
		System.out.println(a2.nombre);
		System.out.println(a1.nombre);
		
		
		Amigo a3 = a1;
		
		System.out.println(a3.nombre);
		
		a2 = null;
		
		System.out.println("FIN");
		
		
		/*
		a1 = new Amigo("Juan", "Gonzalez", "pintor", 29, "Islantilla");	//	instancia
		
		a1.pinta();
		
		
		Amigo a2;
		a2 = new Amigo("Inés", "Gomez", "directora",31,"Coria");
		
		a2.pinta();
		*/
	}
	
}
