package sobreAbstract;

public class ImplementoElCodigo
		extends SoyUnaClaseTotalAbstractaPorqueMeFaltaCodigo {

	@Override
	public boolean arreglar() {
		return false;
	}

	@Override
	public String toString() {
		return "ImplementoElCodigo [arreglar()=" + arreglar() + ", isRoto()=" + isRoto() + ", getColor()=" + getColor()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}
