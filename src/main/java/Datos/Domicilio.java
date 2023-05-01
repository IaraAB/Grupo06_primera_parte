package Datos;


public class Domicilio {
    private String calle;
    private int numero;
    private String ciudad;
    private Abonado dueño;

    public Domicilio(String calle, int numero, String ciudad, Abonado dueño) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.dueño = dueño;
    }

	public String getCalle() {
		return calle;
	}

	public int getNumero() {
		return numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public Abonado getDueño() {
		return dueño;
	}

}
