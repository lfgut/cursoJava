package lonjaApp.especificaciones;

public interface ILonja extends IEstarSucia, IPesable, IValorable {
	
	public void cargar( ICajaRefrigerados caja);
	
	public boolean estaLLena();
	public void vaciar();

	public void pintar();

	
}
