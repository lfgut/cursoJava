package lonjaApp;

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
		Lonja l1 = Lonja.dameAccesoALaUnicaLonjaQueVamosATener();

		Lonja l2 = Lonja.dameAccesoALaUnicaLonjaQueVamosATener();
		
		System.out.println( "Son la misma lonja ? " + ( l1 == l2 ) );
		
		
		
		String vamos ="ggpLVFmL";
		int momento = 0;
		
		do {
			char ahora = vamos.charAt(momento);
			//	switch es un if -> else para varios valores
			switch (ahora) {
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
			// LLegan los barcos con cajas de pescado
			case 'm': {
				l1.cargar( new CajaMerluza() );
				break;
			}
			case 'g': {
				l1.cargar( new CajaGamba() );
				break;
			}
			case 'a': {
				l1.cargar( new CajaAlmeja() );
				break;
			}
			case 'd': {
				l1.cargar( new CajaDorada() );
				break;
			}			
			case 's': {
				l1.cargar( new CajaSardina() );
				break;
			}
			case 'b': {
				l1.cargar( new CajaBoqueron() );
				break;
			}
			case 'p': {
				l1.cargar( new CajaPanga() );
				break;
			}
			default:
				throw new IllegalArgumentException("No se que quieres hacer: " + ahora);
			}
			l1.pintar();
			momento++;
		} while ( momento < vamos.length() );

		System.out.println("Hemos terminado");
	}


}
