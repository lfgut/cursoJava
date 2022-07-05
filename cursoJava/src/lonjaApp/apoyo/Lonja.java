package lonjaApp.apoyo;

import java.util.List;



public class Lonja{

//		Testeamos
	public void cargar() {
		System.out.println("Cargando...");

		
		
		CajaFrutaDiMare fm = new CajaFrutaDiMare();
		
		
		cargar( new CajaMerluza() );
		cargar( new CajaGamba() );
		cargar( new CajaAlmeja() );
		cargar( new CajaDorada() );
		cargar( new CajaSardina() );
		cargar( new CajaBoqueron() );
		cargar( new CajaGamba() );
		cargar( new CajaPanga() );

	}
	
	private void cargar( ICajaRefrigerados ICajaRefrigerados) {
		System.out.println( ICajaRefrigerados.getClass().getSimpleName());
		
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
