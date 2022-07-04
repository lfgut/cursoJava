package lonjaApp.apoyo;

import java.util.List;

/*
import lonjaApp.Almeja;
import lonjaApp.Boqueron;
import lonjaApp.Dorada;
import lonjaApp.Gamba;
import lonjaApp.Merluza;
import lonjaApp.Sardina;
*/
public class Lonja{

//		Testeamos
	public void cargar() {
		System.out.println("Cargando...");

		cargar( new Merluza() );
		cargar( new Gamba() );
/*
		cargar( new Almeja() );
		cargar( new Dorada() );
		cargar( new Sardina() );
		cargar( new Boqueron() );
		cargar( new Gamba() );
		cargar( new Panga() );
		*/
	}
	
	private void cargar( FrutaDiMare frutaDiMare) {
		System.out.println( frutaDiMare.getClass().getSimpleName());
		
	}

	public void pintar() {
		System.out.println(this);
	}

	public void limpiar() {
		System.out.println("Limpiando...");
		pintar();
	}

	public void pesar() {
		System.out.println("Pesando...");
		pintar();
	}

	public void valorar() {
		System.out.println("Valorando...");
		pintar();
		
	}

	public void vaciar() {
		System.out.println("Vaciando...");
		pintar();
	}

	@Override
	public String toString() {
		return "Soy una lonja";
	}

}
