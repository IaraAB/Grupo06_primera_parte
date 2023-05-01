package Negocio;

public class Camaras extends DecoAgregados{
	
	private double costo=3000;
    private int cant;
    
    public Camaras(int cantidad){
    
    	this.cant=cantidad;
    	this.getContratacion().costo=this.getContratacion().costo+this.cant*this.costo;
    }
	
    public void addCamara(int cantidad) {
    	
    	this.cant=this.cant+cantidad;
    	this.getContratacion().costo=this.getContratacion().costo+this.cant*this.costo;
    }
    
    public int getCant() {
    	
    	return this.cant;
    }
}
