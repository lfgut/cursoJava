package algunArray;

import java.util.*;

public class Caja {
	
	public List<Caja> caja = null;

	public Caja() {
		super();
	}

	public Caja(List<Caja> caja) {
		super();
		this.caja = caja;
	}

	public List<Caja> getCaja() {
		return caja;
	}

	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}
}