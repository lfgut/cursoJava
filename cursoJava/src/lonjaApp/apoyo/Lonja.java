package lonjaApp.apoyo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lonjaApp.especificaciones.*;

public class Lonja implements ILonja {

	List<ICajaRefrigerados> cajas = new ArrayList<ICajaRefrigerados>();

//		Testeamos
	@Override
	public void cargar( ICajaRefrigerados caja) {
		System.out.println("Cargando...");

		//CajaFrutaDiMare fm = new CajaFrutaDiMare();
	}
	


	@Override
	public boolean estaLimpia() {
		// TODO Auto-generated method stub
		return false;
	}



	public void limpiar() {
		System.out.println("Limpiando...");
		pintar();
	}

	@Override
	public boolean estaPesada() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public float pesar() {
		System.out.println("Pesando...");
		pintar();
		return 0;
	}

	@Override
	public boolean estaValorada() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public float valorar() {
		System.out.println("Valorando...");
		pintar();
		return 0;
	}

	@Override
	public boolean estaLLena() {
		// TODO Auto-generated method stub
		return false;
	}


	public void vaciar() {
		System.out.println("Vaciando...");
		pintar();
	}

	public void pintar() {
		System.out.println(this);
	}



	@Override
	public String toString() {
		for (ICajaRefrigerados iCajaRefrigerados : cajas) {
			System.out.println(iCajaRefrigerados);
		}
		return "Soy una lonja";
	}

}
