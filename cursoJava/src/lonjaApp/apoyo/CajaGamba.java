package lonjaApp.apoyo;

import java.util.Random;

import lonjaApp.especificaciones.IEstarSucia;
import lonjaApp.especificaciones.IPesable;
import lonjaApp.especificaciones.IValorable;

public class CajaGamba extends CajaFrutaDiMare
	implements IEstarSucia, IPesable, IValorable {
	
	final static float PESO_MIN = 14;
	final static float PESO_MAX = 16;
	
	final static float PRECIO_MIN = 6;
	final static float PRECIO_MAX = 11;
	
	
	
	private boolean tieneAlgas = true;
	private boolean tieneArena = true;
	
	private boolean estaPesada = false;
	private float peso = 0;
	
	private boolean estaValorada = false;
	private float valor = 0;
	private float precioKilo = 0;

	@Override
	public boolean estaPesada() {
		return estaPesada;
	}

	@Override
	public float pesar() {
		if (!estaPesada) peso = (new Random())
				.nextFloat(PESO_MAX-PESO_MIN)+PESO_MIN;
		return peso;
	}

	@Override
	public boolean estaLimpia() {
		return !(tieneAlgas || tieneArena);
	}

	@Override
	public void limpiar() {
		if (tieneAlgas) tieneAlgas=false;
		if (tieneArena) tieneArena=false;
	}

	
	@Override
	public float valorar() {
		if (estaPesada && !estaValorada) {
			estaValorada = true;
			//	calculamos precio por peso
			precioKilo = (new Random())
					.nextFloat(PRECIO_MAX-PESO_MIN)+PESO_MIN;
			valor = peso * precioKilo;
		}
		return valor;
	}

	@Override
	public boolean estaValorada() {
		return estaValorada;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nCaja de gambas");
		sb.append("\n\t" + (tieneAlgas?"Sí":"No") + " tiene algas");
		sb.append("\n\t" + (tieneArena?"Sí":"No") + " tiene arena");
		if (estaPesada) sb.append("\n\tpesa: " + peso );
		if (estaValorada) sb.append("Valorada en: " + valor
									 + " con " + precioKilo
									 + " precio Kilo");
		return sb.toString();	
	}
	
}
