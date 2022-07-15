package lonjaApp.apoyo;

import java.util.*;

import lonjaApp.especificaciones.*;

public class Lonja implements ILonja, IEstarSucia, IPesable{

	
	private static Lonja lonja;
	
	List<ICajaRefrigerados> cajas =
			new ArrayList<ICajaRefrigerados>();
	
	private boolean estaSucia = true;
	private boolean estaPesada = false;
	private float pesoTotal = 0;
	private boolean estaValorada = false;
	private float valorTotal = 0;
	private boolean estaLlena = false;
	private final static int CAPACIDAD_MAX = 3;
	

	public static Lonja dameAccesoALaUnicaLonjaQueVamosATener() {
		return ( lonja == null  ? lonja = new Lonja() : lonja );
		/*
		if (lonja == null ) lonja = new Lonja();
		return lonja;
		*/
	}

	private Lonja() {
		super();
	}

	//		Testeamos
	@Override
	public void cargar( ICajaRefrigerados caja) {
		if (!estaLlena) {
			System.out.println("Cargando una caja más en la lonja");
			cajas.add(caja);
			if (cajas.size() == CAPACIDAD_MAX) estaLlena = true;
		}
	}
	
	@Override
	public boolean estaLimpia() {
		return !estaSucia;
	}

	public void limpiar() {
		if (!estaLlena) {
			System.out.println("No puedes limpiarla porque NO está llena");
		} else if (estaSucia) {
			System.out.println("Estamos limpiando la lonja");
			estaSucia = false;
			for (ICajaRefrigerados caja : cajas) 
				if (caja instanceof IEstarSucia) 
					//IEstarSucia es = (IEstarSucia)caja;
					//	hacemos casting -> cast: usar un objeto como algo más concreto que SI sabemos que es
					//  poneer un CAST es bajo la responsabilidad del desarrollador
					// objeto anónimo:
					((IEstarSucia) caja).limpiar();
					
					// la caja no se puede limpiar DIRECTAMENTE
					//caja.limpiar();
		}
		/*
		{
			if (caja instanceof CajaMerluza) {
				//	Casting
				CajaMerluza cm = (CajaMerluza) caja;
				cm.limpiar();
			} else if (caja instanceof CajaGamba) {
				((CajaGamba) caja).limpiar();
			}
		}
		*/
	}

	@Override
	public boolean estaPesada() {
		return estaPesada;
	}

	@Override
	public float pesar() {
		if (!estaLlena) {
			System.out.println("No puedes pesarla porque NO está llena");
		} else if (!estaPesada) {
			estaPesada = true;
			System.out.println("Estamos pesando la lonja ...");
			for (ICajaRefrigerados caja : cajas) {
				if (caja instanceof IPesable) {
					pesoTotal += ((IPesable) caja).pesar();
				}
			}
		}
		return pesoTotal;
	}

	@Override
	public boolean estaValorada() {
		return estaValorada ;
	}

	@Override
	public float valorar() {
		if (!estaLlena ) {
			System.out.println("No puedes valorarla porque NO está llena");
		} else if ((estaPesada) && (!estaValorada)) {
			estaValorada = true;
			System.out.println("Valorando...");
			for (ICajaRefrigerados caja : cajas) {
				if (caja instanceof IValorable) {
					valorTotal += ((IValorable) caja).valorar();
				}
			}
		}
		return valorTotal;
	}

	@Override
	public boolean estaLLena() {
		return estaLlena;
	}

	public void vaciar() {
		if (!estaLlena) {
			System.out.println("No puedes vaciar porque no está llena");
		} else {
			System.out.println("Vaciando...");
			cajas.clear();
			/*
			for (ICajaRefrigerados caja : cajas) {
				cajas.remove(caja);
			}
			*/
		}
	}

	public void pintar() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		for (ICajaRefrigerados caja  : cajas) {
			st.append( caja );
		}
		String plural = "";
		if (cajas.size() > 1 ) plural ="s";
		return "Soy una lonja con "
			+ cajas.size() + " caja" + plural + " "
			+ (estaLlena ? "está llena ":"")
			+ (estaSucia ? "está sucia " : "")
			+ (estaPesada ? "un peso de: " + pesoTotal + " ": "")
			+ (estaValorada ? "un valor de: " + valorTotal + " ": "")
			+ (st!=null?st:"");
	}

}
