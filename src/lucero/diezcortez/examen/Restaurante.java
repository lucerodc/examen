package lucero.diezcortez.examen;


public class Restaurante {

	private String nombre;
	
	//Carta cartasF;
	public static void main(String[] args) {
		
		//Clase Plato
		Plato plato1 = new Plato( "pure", 10.5, true);
		Plato plato2 = new Plato( "salsa", 20.5, true);
		Plato plato3 = new Plato( "fideos", 15, true);
		Plato plato4 = new Plato( "tacos", 8, true);
		Plato plato5 = new Plato( "hamburguesas", 11, false);
		
		//Clase Bebidas
		Bebida bebida1 = new Bebida("gaseosa",5);
		Bebida bebida2 = new Bebida("jugo",4);
			
		//1er carta : 3 platos
		Plato [] platosCarta1 = {plato1, plato2, plato3};
		//2da carta: 3 platos
		Plato [] platosCarta2 = {plato4, plato5};
		
		//Bebida1
		Bebida [] bebidaCarta1 = {bebida1};
		Bebida [] bebidaCarta2 = {bebida2};
				
		//Bebida2
		Carta carta1 = new Carta("Carta 1", platosCarta1, bebidaCarta1 );
		Carta carta2 = new Carta("Carta 2", platosCarta2, bebidaCarta2 );
		
		Carta [] cartas = {carta1, carta2};
		
		
		//. Llamada al Método que muestre el contenido de cada carta mostrando solo los platos disponibles
		carta1.mostrarCarta1(carta1,platosCarta1 );
		carta1.mostrarCarta1(carta2,platosCarta2 );
		
		
		//llamada al metodo importeCarta
		carta1.importeCarta(cartas, platosCarta1);
		
		
		
	}
	
}
