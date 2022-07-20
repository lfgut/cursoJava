package funcional;

import java.util.*;
import java.util.stream.*;


public class ConListas {

	public static void main(String[] args) {
		

		 List<String> cad = Arrays.asList("a","n","t","b")
				 .stream()
				 .collect( Collectors.toList() );
	
		 System.out.println( cad );
		 
		 
		 int rdo = Arrays.asList(2,3,4)
				 .stream()
				 .reduce(0, (a, b) -> a + b);
		 
		 System.out.println(rdo);
		 
	}

}
