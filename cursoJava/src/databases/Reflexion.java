package databases;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.lang.reflect.*;

/*
	podemos preguntar a una clase por sus cosas:
		metodos
		campos
			etc
	reflection -> introspección sobre como es la clase
*/

public class Reflexion {
	public static void main(String[] args) {
		Method[] metodos = null;
		try {
			Class ca = Class.forName("lonjaApp.apoyo.CajaMerluza");
			metodos = ca.getMethods();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ha ido bien");
		System.out.println(metodos.length);
		
		/*
		for (int i = 0; i < metodos.length; i++) {
			System.out.println("Metodo: " + metodos[i]);		
		}
		*/
		
		Arrays.stream( metodos ).forEach(System.out::println);

	}
}
