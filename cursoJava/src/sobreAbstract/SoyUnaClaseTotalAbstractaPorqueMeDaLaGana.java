package sobreAbstract;

public abstract class SoyUnaClaseTotalAbstractaPorqueMeDaLaGana {

	private String color;
	private boolean roto = true;
	
	//	Si lo necesitamos, estamos obligados a crearlo
	public SoyUnaClaseTotalAbstractaPorqueMeDaLaGana() {
		super();
	}

	//	Crear un constructor hace desaparecer al constructor por defecto
	public SoyUnaClaseTotalAbstractaPorqueMeDaLaGana(String color) {
		super();
		this.color = color;
	}

	public boolean isRoto() {
		return roto;
	}

	public boolean arreglar() {
		return true;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SoyUnaClaseTotalAbstractaPorqueMeDaLaGana [color=" + color + ", roto=" + roto + "]";
	}






	

	
	
}
