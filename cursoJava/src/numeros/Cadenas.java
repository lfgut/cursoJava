package numeros;


public class Cadenas {
	   public static void main(String[] arg) {
	      String texto = "Un codigo del programa de Java";
	      texto = texto.toLowerCase();
	      int posicion = texto.indexOf("Ja");
	      String otra = ((posicion > 0) ? texto.substring(posicion) : "");
	      otra += "Programa Java";
	      if (!otra.endsWith("Java")) {
	         otra += "Un codigo" + otra;
	      } else {
	         posicion += ((posicion < 1) ? 10 : 11);
	         otra = otra.substring(posicion);
	      }
	      System.out.println(otra);
	   }
	}