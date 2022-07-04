package lonjaApp;

import lonjaApp.*;
import lonjaApp.apoyo.*;

//import lonja.apoyo.Lonja;

public class TestearLonja {

	public static void main(String[] args) {
		
		//new TestearLonja();
		
	/*	Por si quieres instanciarlo
	}
	private TestearLonja() {
	*/
		//		crear lo necesario para trabajar
		Lonja l1 = new Lonja();
		l1.pintar();
		
		String vamos ="CLPVF";
		int momento = 0;
		char ahora;
		
		do {
			ahora = vamos.charAt(momento);
			//	switch es un if -> else para varios valores
			switch (ahora) {
			case 'C': {
		// LLegan los barcos con cajas de pescado
				l1.cargar();
				break;
			}
			case 'L': {
				l1.limpiar();
				break;
			}
			case 'P': {
				l1.pesar();
				break;
			}
			case 'V': {
				l1.valorar();
				break;
			}
			case 'F': {
				l1.vaciar();
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
