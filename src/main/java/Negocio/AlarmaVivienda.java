package Negocio;

import java.util.Date;

import Datos.Domicilio;

public class AlarmaVivienda extends Contratacion {
	
	private double costo=8500;
	
    public AlarmaVivienda(int idContratacion, Date fechaInicio, Domicilio domicilio) {
		super(idContratacion, fechaInicio, domicilio);
	}

}