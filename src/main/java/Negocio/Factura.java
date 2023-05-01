package Negocio;

import java.util.ArrayList;
import Datos.Abonado;
import Datos.PersonaJuridica;


public class Factura implements Cloneable{
	private ArrayList<Contrato> contratos;
	private Abonado abonado;
	private double totalFinal,total,cambio;
	public Factura(Abonado abonado, ArrayList<Contrato> contrataciones) {
	       
		this.abonado = abonado;
		this.contratos = contrataciones;
	}

	public ArrayList<Contrato> getContratos() {
	
		return contratos;
	}

	public Abonado getAbonado() {
	
		return abonado;
	}

	public double getTotalFinal() {
	
		return totalFinal;
	}

	public double getTotal() {
	
		return total;
	}
	
	public void addContrato(Contrato contrato) {
	
		this.contratos.add(contrato);
	}
	
	public void removeContrato(Contrato contrato) {
		
		this.contratos.remove(contrato);
	}
	
	public void setTotal() {
		
		double suma=0;
		int i;
		Contrato contrato; 
		
		for(i=1;i<=this.contratos.size();i++) {
			contrato=contratos.get(i);
			if(contrato instanceof AlarmaComercio) {
				suma+=((AlarmaComercio)contrato).getCosto();
			}else if(contrato instanceof AlarmaVivienda){
				suma+=((AlarmaVivienda)contrato).getCosto();
			}
		}
		if((this.abonado instanceof PersonaJuridica) && (this.contratos.size()>=3)) {
			suma*=0.5;
		}
		this.total=suma;
	}
	
	public void setTotalFinal(double cambio) {
		
		this.cambio=cambio;
		setTotal();
		this.totalFinal=this.total*cambio;
	}
	
	public void muestraInfo() {
		
		setTotalFinal(this.cambio);
		System.out.println("Nombre Abonado: "+this.abonado.getNombre());
		System.out.println("DNI: "+this.abonado.getDni());
		System.out.println("Detalle de Contrataciones: ");
		for(Contrato contrato:contratos) {
			if(contrato instanceof AlarmaComercio) {
				System.out.println("Servicio Alarma Comercio");
				if(contrato instanceof Camaras) {
					System.out.println("Camaras  x"+((Camaras)contrato).getCant());
				}
				if(contrato instanceof BotonPanico) {
					System.out.println("Boton Antipanico  x"+((BotonPanico)contrato).getCant());
				}
				if(contrato instanceof Movil) {
					System.out.println("Movil");
				}
				System.out.println("Costo:  $"+((AlarmaComercio)contrato).getCosto());
			}else if(contrato instanceof AlarmaVivienda){
				System.out.println("Servicio Alarma Vivienda");
				if(contrato instanceof Camaras) {
					System.out.println("Camaras  x"+((Camaras)contrato).getCant());
				}
				if(contrato instanceof BotonPanico) {
					System.out.println("Boton Antipanico  x"+((BotonPanico)contrato).getCant());
				}
				if(contrato instanceof Movil) {
					System.out.println("Movil");
				}
				System.out.println("Costo:  $"+((AlarmaVivienda)contrato).getCosto());
			}
		}
		System.out.println("Costo: $"+this.total);
		System.out.println("Costo Final: $"+this.totalFinal);	
	}

}
