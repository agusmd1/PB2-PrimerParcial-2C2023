package ar.edu.unlam.pb2.empresaTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutoTest {

	@Test
	public void cargarChoferY3PasajerosEnAuto() {
		// Preparacion
		String nombreChofer = "Agustin";

		String nombrePasajero1 = "Jorge";
		String nombrePasajero2 = "Alberto";
		String nombrePasajero3 = "Cesar";

		Auto auto = new Auto(100, nombreChofer);
		// Ejecucion
		assertTrue(auto.agregarPasajero(nombrePasajero1));
		assertTrue(auto.agregarPasajero(nombrePasajero2));
		assertTrue(auto.agregarPasajero(nombrePasajero3));

		// validacion
		assertEquals(3, auto.getPasajeros().size());
	}

	@Test
	public void cargarChoferY4PasajerosEnAuto() {
		// Preparacion
		String nombreChofer = "Agustin";

		String nombrePasajero1 = "Jorge";
		String nombrePasajero2 = "Alberto";
		String nombrePasajero3 = "Cesar";
		String nombrePasajero4 = "Napoleon";

		Auto auto = new Auto(100, nombreChofer);
		// Ejecucion y validacion
		assertTrue(auto.agregarPasajero(nombrePasajero1));
		assertTrue(auto.agregarPasajero(nombrePasajero2));
		assertTrue(auto.agregarPasajero(nombrePasajero3));
		assertFalse(auto.agregarPasajero(nombrePasajero4));

	}

	@Test
	public void cambiarChoferSinPasajerosEnAuto() {
		String nombreChofer = "Agustin";
		Auto auto = new Auto(100, nombreChofer);
		String nuevoChofer = "Agustin";

		auto.cambiarChofer(nuevoChofer);

		assertEquals(nuevoChofer, auto.getChofer());
	}

	@Test
	public void noPermitirCambiarDeChoferConPasajerosABordo() {
		// Preparacion
		String nombreChofer = "Agustin";

		String nombrePasajero1 = "Jorge";
		String nombrePasajero2 = "Alberto";
		String nombrePasajero3 = "Cesar";

		Auto auto = new Auto(100, nombreChofer);
		String nuevoChofer = "Diogenes";
		// Ejecucion y validacion
		auto.agregarPasajero(nombrePasajero1);
		auto.agregarPasajero(nombrePasajero2);
		auto.agregarPasajero(nombrePasajero3);

		auto.cambiarChofer(nuevoChofer);

		// Validacion
		assertEquals(nombreChofer, auto.getChofer());

	}

	@Test
	public void queElAutoHayaRecorridoMasDe1000Kilometros() {
		String nombreChofer = "Agustin";
		Auto auto = new Auto(1100, nombreChofer);
		auto.getKilometrosRecorridos();

		assertTrue(auto.getKilometrosRecorridos() > 1000);
	}

}
