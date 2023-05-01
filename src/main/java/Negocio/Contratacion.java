package Negocio;

import java.util.Date;
import Datos.Domicilio;

public abstract class Contratacion implements Contrato {
	
	private int idContratacion;
    private Date fechaInicio;
    private Domicilio domicilio;
    protected double costo;

    public Contratacion(int idContratacion, Date fechaInicio, Domicilio domicilio) {
        this.idContratacion = idContratacion;
        this.fechaInicio = fechaInicio;
        this.domicilio = domicilio;
    }
    
    public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public int getIdContratacion() {
		return idContratacion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public double getCosto() {
		return this.costo;
	}
	
	public void setCosto(double costo){
		this.costo=costo;
	}
}


