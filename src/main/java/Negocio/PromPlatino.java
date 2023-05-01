package Negocio;

public class PromPlatino extends Promocion{
	
	@Override
	public void Descuento(Contrato contratacion){
		double valorFinal;
		
		if(contratacion instanceof AlarmaComercio) {
			valorFinal=((AlarmaComercio) contratacion).getCosto()*0.65;
			((AlarmaComercio) contratacion).setCosto(valorFinal);
	    } else if(contratacion instanceof AlarmaVivienda){
	        valorFinal=((AlarmaVivienda) contratacion).getCosto()*0.70;
	        ((AlarmaVivienda) contratacion).setCosto(valorFinal);
	    }
	}
}
