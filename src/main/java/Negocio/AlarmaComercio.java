package Negocio;

import java.util.Date;

import Datos.Domicilio;

public class AlarmaComercio extends Contratacion{
   
	private double costo=10000;
	
	public AlarmaComercio(int idContratacion, Date fechaInicio, Domicilio domicilio) {
		super(idContratacion, fechaInicio, domicilio);
	}
	
}
