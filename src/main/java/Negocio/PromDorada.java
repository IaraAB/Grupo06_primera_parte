package Negocio;

public class PromDorada extends Promocion{
	

	@Override
	public void Descuento(Contrato contratacion){
		double valorFinal;
		
		if(contratacion instanceof AlarmaComercio) {
			valorFinal=((AlarmaComercio) contratacion).getCosto()-2500;
			((AlarmaComercio) contratacion).setCosto(valorFinal);
	    } else if(contratacion instanceof AlarmaVivienda){
	        valorFinal=((AlarmaVivienda) contratacion).getCosto()-1500;
	        ((AlarmaVivienda) contratacion).setCosto(valorFinal);
	    }
	}
}
