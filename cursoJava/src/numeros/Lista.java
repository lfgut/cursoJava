package numeros;

import java.util.*;

public class Lista {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add( 10 );
		lista.add( 14 );
		
		for(int x: lista) {
			System.out.println(x + ",");
			break;
		}
		

	}

}
