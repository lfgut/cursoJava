package lonjaApp;

import lonjaApp.*;
import lonjaApp.apoyo.*;

//import lonja.apoyo.Lonja;

public class TestearLonja {

	public static void main(String[] args) {
		new TestearLonja();
	}
	
	private TestearLonja() {
		Lonja l1 = new Lonja();
		l1.pintar();
		
		String vamos ="CLPVF";
		int momento = 0;
		char ahora;
		
		do {
			ahora = vamos.charAt(momento);
			switch (ahora) {
			case 'C': {
		// LLegan los barcos con cajas de pescado
				l1.cargar();
				l1.pintar();
				break;
			}
			case 'L': {
				l1.limpiar();
				l1.pintar();
				break;
			}
			case 'P': {
				l1.pesar();
				l1.pintar();
				break;
			}
			case 'V': {
				l1.valorar();
				l1.pintar();
				break;
			}
			case 'F': {
				l1.vaciar();
				l1.pintar();
				break;
			}
			default:
				throw new IllegalArgumentException("No se que quieres hacer: " + ahora);
			}
			momento++;
		} while ( (ahora != 'F') && (momento < vamos.length()) );

		System.out.println("Hemos terminado");
	}


}
