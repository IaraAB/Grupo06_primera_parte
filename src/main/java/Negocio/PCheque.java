package Negocio;

import java.util.ArrayList;

import Datos.Abonado;

public class PCheque extends Pago {
    
    public PCheque(Abonado abonado, ArrayList<Contrato> contrataciones){
    	
    	super(abonado,contrataciones);
    	this.getFactura().setTotalFinal(1.10);
    }
}

