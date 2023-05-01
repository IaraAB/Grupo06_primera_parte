package Negocio;

public abstract class Pago implements Contrato {
	
	private Factura factura;
	private double cambiaCosto;

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
}
