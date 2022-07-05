package sobreAbstract;

public abstract class SoyUnaClaseTotalAbstractaPorqueMeFaltaCodigo {

	private String color;
	private boolean roto = true;
	
	//	Si lo necesitamos, estamos obligados a crearlo
	public SoyUnaClaseTotalAbstractaPorqueMeFaltaCodigo() {
		super();
	}

	//	Crear un constructor hace desaparecer al constructor por defecto
	public SoyUnaClaseTotalAbstractaPorqueMeFaltaCodigo(String color) {
		super();
		this.color = color;
	}

	public boolean isRoto() {
		return roto;
	}

	public abstract boolean arreglar();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SoyUnaClaseTotalAbstractaPorqueMeFaltaCodigo [color=" + color + ", roto=" + roto + "]";
	}





	

	
	
}
