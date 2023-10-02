import es.curso.java.poo.ejercicios.caballos.Caballo;
import es.curso.java.poo.ejercicios.caballos.GranPremio;

public class TestCarreras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caballo caballo = new Caballo(01, "caballo1", 1, 20, 50, 400);
		
		GranPremio gp = new GranPremio();
		gp.iniciarGranPremio(caballo);
	}

}
