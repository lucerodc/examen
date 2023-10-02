package lucero.diezcortez.examen;

import java.util.Scanner;

import es.curso.java.poo.ejercicios.caballos.Caballo;
import es.curso.java.poo.ejercicios.caballos.Carrera;

public class Carta {

	
	private String nombre;
	private  Plato[] platos;
	private  Bebida[] bebidas;

	
	//creacion del constructor
	public Carta(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//creacion del constructor2
	public Carta(String nombre, Plato[] platos, Bebida[] bebidas) {
		super();
		this.nombre = nombre;
		this.platos = platos;
		this.bebidas = bebidas;
	}	
	
	//creacion de los getter y getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Plato[] getPlatos() {
		return platos;
	}


	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}


	public Bebida[] getBebidas() {
		return bebidas;
	}


	public void setBeebidas(Bebida[] bebidas) {
		this.bebidas = bebidas;
	}
	
	
	//==========================================PREGUNTA 4=================================
	/*. Método que muestre el contenido de cada carta mostrando solo los platos disponibles */
	
	
	void mostrarCarta1(Carta carta, Plato [] plato) {
		for (Plato plato2 : plato) {
			if(plato2.isDisponible()==true) {
				System.out.println("PLatos disponibles : "+plato2.getNombre());
		}
	  }
	}	
	
	//==========================================PREGUNTA 5 y 6=================================
		/*. Método que muestre el contenido de cada carta mostrando solo los platos disponibles */
		void importeCarta(Carta[] carta, Plato [] plato) {
			System.out.println("Ingrese el numero del Plato elegido :");
			Scanner scan = new Scanner(System.in);
			int opcion = scan.nextInt();
		
			double importe = 0;
	
	
			switch (opcion) {
				case 1: 
					System.out.println("Importe de Pago : ");  
					System.out.print(importe = 10.5); 
					break;
				case 2:		
					System.out.print("Importe de Pago : ");  
					System.out.println(importe = 20.5); 
					break;
				case 3:	
					System.out.print("Importe de Pago : ");  
					System.out.println(importe = 15); 
					break;
				case 4:		
					System.out.print("Importe de Pago: ");  
					System.out.println(importe = 8); 
					break;
				}
	
		}

}
