package Negocio;

import java.util.ArrayList;

import Datos.Abonado;

public abstract class Pago extends Factura {
	
	public Pago(Abonado abonado, ArrayList<Contrato> contrataciones) {
		super(abonado, contrataciones);
	}

	private Factura factura;
	private double cambiaCosto;

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
}
