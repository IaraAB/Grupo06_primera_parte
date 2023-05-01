package Datos;

import java.util.ArrayList;
import Negocio.Factura;

public class Datos {
	
	private ArrayList<Abonado> abonados;
	private ArrayList<Factura> facturas;
	private static Datos instancia=null;
	
	
	private Datos(){
		
		this.abonados=new ArrayList<Abonado>();
		this.facturas=new ArrayList<Factura>();
	}
    
	public static Datos getInstancia() {
		
		if(instancia==null) {
			instancia=new Datos();
		}
		return instancia;
		
	}
	
    public void addAbonados(Abonado abonado) {
        
    	abonados.add(abonado);
    }
    
    public void removeAbonados(Abonado abonado) {
    	
    	int i=1;
        
    	abonados.remove(abonado);
    	while(i<=this.facturas.size() && this.facturas.get(i).getAbonado()!=abonado) {
    		i++;
    	}
    	if(i<=this.facturas.size() && this.facturas.get(i).getAbonado()==abonado) {
    		removeFacturas(this.facturas.get(i));
    	}
    }
    
    public void addFacturas(Factura factura) {
        
    	facturas.add(factura);
    }
    
    public void removeFacturas(Factura factura) {
        
    	facturas.remove(factura);
    }
    
    public ArrayList<Abonado> getAbonados(){
    	
    	return this.abonados;
    }
    
    public ArrayList<Factura> getfacturas(){
    	
    	return this.facturas;
    }
    

}
