package Negocio;

import java.util.ArrayList;

import Datos.Abonado;

public class PEfectivo extends Pago{
    
    public PEfectivo(Abonado abonado, ArrayList<Contrato> contrataciones){
    	
    	super(abonado,contrataciones);
    	this.getFactura().setTotalFinal(0.8);
    }
}
