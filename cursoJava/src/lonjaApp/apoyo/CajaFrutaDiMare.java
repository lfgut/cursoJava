package lonjaApp.apoyo;

import lonjaApp.especificaciones.ICajaRefrigerados;

public abstract class CajaFrutaDiMare implements ICajaRefrigerados {

	public CajaFrutaDiMare() {
		super();
		System.out.println("otra "
		+ getClass().getSimpleName());
	}

	
}
