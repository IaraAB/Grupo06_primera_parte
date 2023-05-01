package Negocio;

import java.util.ArrayList;

import Datos.Abonado;

public class PTarjeta extends Pago{
    
    public PTarjeta(Abonado abonado, ArrayList<Contrato> contrataciones){
    
    	super(abonado,contrataciones);
    	this.getFactura().setTotalFinal(1.05);
    }
}
