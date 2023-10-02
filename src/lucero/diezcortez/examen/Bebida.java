package lucero.diezcortez.examen;

public class Bebida {

	private String nombre;
	private double	precio;
	
	//creacion del constructor
	public Bebida(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//creacion de los getter y getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
	
	
	
}
