package Negocio;

public class Movil extends DecoAgregados{
    private double costo=7500;

    public Movil(){
    	this.getContratacion().costo=this.getContratacion().costo+this.costo;
    }
}