package Presentacion;

import java.util.ArrayList;
import java.util.Date;

import Datos.Abonado;
import Datos.Datos;
import Datos.Domicilio;
import Datos.PersonaFisica;
import Datos.PersonaJuridica;
import Negocio.AlarmaComercio;
import Negocio.AlarmaVivienda;
import Negocio.Camaras;
import Negocio.Contrato;
import Negocio.Factura;
import Negocio.Movil;
import Negocio.PCheque;
import Negocio.PEfectivo;
import Negocio.PTarjeta;
import Negocio.PromDorada;
import Negocio.PromPlatino;
import Negocio.Promocion;

public class Sistema {
	
	private Datos datos;
	private Abonado abonado;
	private Factura factura;
	private Contrato contratacion;
	private Domicilio domicilio;
	private Promocion promo;
	private static Sistema instancia=null;
	
	
	private Sistema(){
		
		this.datos.getInstancia();
	
	}
    
	public static Sistema getInstancia() {
		
		if(instancia==null) {
			instancia=new Sistema();
		}
		return instancia;
		
	}
	
	public void main() {
		
		
		System.out.println("---PERSONA 1---");
		//ejemplo persona1: Persona Juridica con 3 contrataciones , Pago efectivo
		abonado=new PersonaJuridica("carlitos",3456789);
		datos.addAbonados(abonado);
		domicilio=new Domicilio("sarmiento",333,"mdp",abonado);
		abonado.addDomicilio(domicilio);
		contratacion=new AlarmaComercio(1,new Date(),domicilio);
		factura=new PEfectivo(abonado,abonado.getContrataciones());
		datos.addFacturas(factura);
		factura.addContrato(contratacion);
		contratacion=new Movil();
		domicilio=new Domicilio("matheu",543,"mdp",abonado);
		abonado.addDomicilio(domicilio);
		contratacion=new AlarmaVivienda(2,new Date(),domicilio);
		factura.addContrato(contratacion);
		contratacion=new Camaras(3);
		domicilio=new Domicilio("roca",883,"mdp",abonado);
		abonado.addDomicilio(domicilio);
		contratacion=new AlarmaVivienda(3,new Date(),domicilio);
		factura.addContrato(contratacion);
		factura.muestraInfo();
		promo=new PromDorada();// promocion dorada sobre alarma vivienda
		promo.Descuento(contratacion);
		factura.muestraInfo();
		
		
		System.out.println("---PERSONA 2---");
		//ejemplo persona2 Pago tarjeta
		abonado=new PersonaFisica("roberto",4567839);
		datos.addAbonados(abonado);
		domicilio=new Domicilio("peña",999,"mdp",abonado);
		abonado.addDomicilio(domicilio);
		contratacion=new AlarmaComercio(1,new Date(),domicilio);
		factura=new PTarjeta(abonado,abonado.getContrataciones());
		datos.addFacturas(factura);
		factura.muestraInfo();
		promo=new PromDorada();// promocion dorada sobre alarma comercio
		promo.Descuento(contratacion);
		factura.muestraInfo();
		promo=new PromPlatino();// promocion platino sobre alarma comercio
		promo.Descuento(contratacion);
		factura.muestraInfo();
		
		
		System.out.println("---PERSONA 3---");
		//ejemplo persona3 Pago cheque
		abonado=new PersonaFisica("julio",4567839);
		datos.addAbonados(abonado);
		domicilio=new Domicilio("mitre",879,"mdp",abonado);
		abonado.addDomicilio(domicilio);
		contratacion=new AlarmaVivienda(1,new Date(),domicilio);
		factura=new PCheque(abonado,abonado.getContrataciones());
		datos.addFacturas(factura);
		factura.muestraInfo();
		promo=new PromPlatino();// promocion platino sobre alarma vivienda
		promo.Descuento(contratacion);
		factura.muestraInfo();
	}
	


}
