package lonjaApp.apoyo;

import java.util.*;

import lonjaApp.especificaciones.*;

public class CajaMerluza extends CajaFrutaDiMare
	implements IEstarSucia, IValorable {

	//	Se valora por unidades
	//  en cada caja vienen entre 8 y 12
	private boolean tieneAlgas = true;
	private int unidades = new Random().nextInt(4)+8;
	
	private boolean estaValorada = false;
	private float valor = 0;
	
	public CajaMerluza() {
		super();
	}

	@Override
	public boolean estaValorada() {
		return estaValorada;
	}

	@Override
	public float valorar() {
		if (!estaValorada()) {
			estaValorada = true;
			//	calculamos precio por unidad 6 - <11
			valor = unidades * (new Random()).nextFloat(5)+6;
		}
		return valor;
	}

	@Override
	public boolean estaLimpia() {
		return !tieneAlgas;
	}

	@Override
	public void limpiar() {
		/*
		if (tieneAlgas == true) {
			tieneAlgas = false;
		}

		if (tieneAlgas) { tieneAlgas = false; }
		if (tieneAlgas) tieneAlgas = false;
		*/
		tieneAlgas = tieneAlgas?false:tieneAlgas;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nCaja de merluza");
		sb.append("\n\t" + (tieneAlgas?"Sí":"No") + " tiene algas");
		sb.append("\n\tUnidades: " + unidades );
		if (estaValorada) sb.append("Valorada en: " + valor);
		return sb.toString();	
	}

}
