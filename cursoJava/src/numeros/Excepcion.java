package numeros;

public class Excepcion {
	public static void main(String [] args) {
		try {
			badMethod();
            System.out.print("A");
        }
        catch (Exception ex) {
        	System.out.print("B");
        }
      	finally {
      		System.out.print("C");
      	}
		System.out.print("D");
    }
	
	// Es un comportamiento especial por ser Error()
	public static void badMethod() {
	       throw new Error();
	}
	
	// Así tendría que ser con cualquier Exception
	public static void badMethod2() throws Exception {
       throw new Exception();
    }
}