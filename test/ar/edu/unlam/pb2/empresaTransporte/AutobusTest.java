package ar.edu.unlam.pb2.empresaTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutobusTest {

	@Test
	public void queSePuedaCambiarDeChoferSiNoHayPasajerosABordo() {
		String nombreChofer = "Agustin";
		Autobus bondi = new Autobus(100, nombreChofer);
		String nuevoChofer = "Agustin";

		bondi.cambiarChofer(nuevoChofer);

		assertEquals(nuevoChofer, bondi.getChofer());
	}

	@Test
	public void queNoSePuedaCambiarDeChoferSiHayPasajerosABordo() {
		// preparacion
		String nombreChofer = "Agustin";
		String nombrePasajero1 = "Napoleon";
		Autobus bondi = new Autobus(100, nombreChofer);
		String nuevoChofer = "Agustin";
		// ejecucion

		bondi.agregarPasajero(nombrePasajero1);
		bondi.cambiarChofer(nuevoChofer);
		// validacion

		assertEquals(nombreChofer, bondi.getChofer());
	}

	@Test
	public void queNoSePuedanSubirMasDe20PersonasEnAutobus() {
		// preparacion
		String nombreChofer = "Agustin";
		Autobus bondi = new Autobus(100, nombreChofer);
		String nombrePasajero = "Matias";
		Boolean seSubieron;

		// ejecucion
		Integer i = 0;
		while (i < 20) {
			bondi.agregarPasajero(nombrePasajero);
			i++;
		}
		seSubieron = bondi.agregarPasajero(nombrePasajero);
		// validacion
		assertEquals(false, seSubieron);

	}

}
