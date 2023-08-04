package Entity;

public class Sucursalemexico extends Restaurantes {
	// Nuevamente declaramos nuestros atributos
	String calle;
	String colonia;
	String munCiu;

	// Generemos nuestro constructor vacio
	public Sucursalemexico() {
		super();
	}

	// Generamos nuestro constructor con todas la vaiables
	public Sucursalemexico(String nombre, String entidad, Number telefono, String calle, String colonia,
			String munCiu) {
		super(nombre, entidad, telefono);
		this.calle = calle;
		this.colonia = colonia;
		this.munCiu = munCiu;
	}

	// Generamos nuestro autoString
	@Override
	public String toString() {
		return "Sucursalemexico [nombre=" + nombre + ", Entidad=" + Entidad + ", telefono=" + telefono + ", calle="
				+ calle + ", colonia=" + colonia + ", munCiu=" + munCiu + "]";
	}

	// Encapsulamos
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunCiu() {
		return munCiu;
	}

	public void setMunCiu(String munCiu) {
		this.munCiu = munCiu;
	}

}
