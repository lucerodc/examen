package lucero.diezcortez.examen;

public class Plato {
	
	private String nombre;
	private double	precio;
	private boolean disponible;
	
	
	//creacion del constructor
	public Plato(String nombre, double precio, boolean disponible) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
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


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	
	
	
	
	
	

}
