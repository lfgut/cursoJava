package lonjaApp.apoyo;

import lonjaApp.especificaciones.ICajaRefrigerados;

public class CajaFrutaDiMare implements ICajaRefrigerados {

	public CajaFrutaDiMare() {
		super();
		System.out.println("otra caja de "
		+ getClass().getSimpleName()
		+ " --->");
	}

	
}
