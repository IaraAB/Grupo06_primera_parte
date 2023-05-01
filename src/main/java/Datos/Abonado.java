package Datos;

import java.util.ArrayList;

import Negocio.Contrato;

public abstract class Abonado {
	
	private String nombre;
    private int dni;
    private ArrayList<Domicilio> domicilios; //lista de domicilios si el abonado tiene varios domicilios
    private ArrayList<Contrato> contrataciones;//un contrato por cada domicilio

    public Abonado(String nombre, int dni) {
        
    	this.nombre=nombre;
        this.dni=dni;
        domicilios = new ArrayList<Domicilio>();
        contrataciones = new ArrayList<Contrato>();
    }

    public ArrayList<Domicilio> getDomicilios() {
       
    	return domicilios;
    }

    public void addDomicilio(Domicilio domicilio) {
       
    	domicilios.add(domicilio);
    }

    public void removeDomicilio(Domicilio domicilio) {
       
    	domicilios.remove(domicilio);
    }

    public ArrayList<Contrato> getContrataciones() {
       
    	return contrataciones;
    }

    public void addContratacion(Contrato contratacion) {
        
    	contrataciones.add(contratacion);
    }

    public void removeContratacion(Contrato contratacion) {
       
    	contrataciones.remove(contratacion);
    }

	public String getNombre() {
		
		return nombre;
	}

	public int getDni() {
		
		return dni;
	}

}
