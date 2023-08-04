package Entity;

public abstract class Restaurantes {
	// Declaramos nuestras Variables
	String nombre;
	String Entidad;
	Number telefono;

	// Generamos nuestro constructor vacio
	public Restaurantes() {
		super();
	}

	// Generamos nuestro con atributos
	public Restaurantes(String nombre, String entidad, Number telefono) {
		super();
		this.nombre = nombre;
		Entidad = entidad;
		this.telefono = telefono;
	}
	// Aqui no generamos nuestro metodo autostring
	//Solo encapsulamos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEntidad() {
		return Entidad;
	}

	public void setEntidad(String entidad) {
		Entidad = entidad;
	}

	public Number getTelefono() {
		return telefono;
	}

	public void setTelefono(Number telefono) {
		this.telefono = telefono;
	}

}
