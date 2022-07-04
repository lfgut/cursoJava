package libreta;
import java.util.*;

public class TestearAgenda {

	public static void main(String[] args) {
		
		final int MAXIMO = 10;
		
		System.out.println("Hola, vamos a crear una agenda");
		Agenda agenda = new Agenda();
		
		
		List<Persona> contactos = new ArrayList();
		
		contactos.add( new Amigo("Pepe"));
		contactos.add( new Amigo("Juan"));
		contactos.add( new Amigo("Alberto"));
		
		contactos.add( new Cliente("Roscados Rodriguez" ));
		
		//contactos.add( new Persona());
		
		//amigos.add("cadena de caracteres");

	
		
		for (Object amigo : contactos) {
			System.out.println(amigo);
		}
		
		Random random = new Random(77);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(100)+50);
		}

	
	}

}
