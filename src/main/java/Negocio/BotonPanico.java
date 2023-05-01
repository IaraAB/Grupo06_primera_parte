package Negocio;

public class BotonPanico extends DecoAgregados{
	
    private double costo=2000;
    private int cant;

    public BotonPanico(int cantidad){
    	
    	this.cant=cantidad;
    	this.getContratacion().costo=this.getContratacion().costo+this.cant*this.costo;
    }
    
    public void addBoton(int cantidad) {
    	
    	this.cant=this.cant+cantidad;
    	this.getContratacion().costo=this.getContratacion().costo+this.cant*this.costo;
    }
    
    public int getCant() {
    	
    	return this.cant;
    }
}
