package libreta;

public class Aplicacion001 {

	public static void main(String[] args) {
		
		// declaramos
		String saludo;
		String saludo2;
		
		// inicializamos
		saludo = "Hora de clase";
		saludo2 = " ";
		
		
		//usamos
		/*
		pinta( saludo );
		pinta( saludo2 );
		
		pinta( saludo + " -> "+ saludo2 );
		
		pinta();
		*/
	
		
	};

	
	
	//	método (función / procedimiento)
	private static void pinta() {
		pinta("");
	}

	private static void pinta(int entero) {
		pinta(""+entero);
	}

	private static void pinta(String cosa){
		System.out.println(cosa);
	}
	
	
}



















