package Negocio;
/** actualiza objeto tipo contrato*/
public abstract class DecoAgregados implements Contrato{
	
	private Contratacion contratacion;

	public Contratacion getContratacion() {
		return contratacion;
	}

	public void setContratacion(Contratacion contratacion) {
		this.contratacion = contratacion;
	}
	
	
}
