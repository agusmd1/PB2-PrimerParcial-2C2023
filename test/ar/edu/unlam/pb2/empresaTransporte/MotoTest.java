package ar.edu.unlam.pb2.empresaTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotoTest {

	@Test
	public void cargarChoferYAcompananteEnMoto() {
		String nombreChofer = "Juan";
		String nombreAcompaniante1 = "Maria";

		Moto moto = new Moto(100, nombreChofer);

		assertTrue(moto.agregarAcompanante(nombreAcompaniante1));
		assertEquals(1, moto.getAcompanantes().size());
	}

	@Test
	public void cargarChoferY2AcompaniantesEnMoto() {
		String nombreChofer = "Juan";
		String nombreAcompaniante1 = "Maria";
		String nombreAcompaniante2 = "Agustin";

		Moto moto = new Moto(100, nombreChofer);

		assertTrue(moto.agregarAcompanante(nombreAcompaniante1));
		assertEquals(1, moto.getAcompanantes().size());
		assertFalse(moto.agregarAcompanante(nombreAcompaniante2));
	}

	@Test
	public void cambiarChoferSinAcompanianteEnMoto() {
		String nombreChofer = "Juan";
		Moto moto = new Moto(100, nombreChofer);
		String nuevoChofer = "Agustin";

		moto.cambiarChofer(nuevoChofer);

		assertEquals(nuevoChofer, moto.getChofer());
	}

	@Test
	public void queLaMotoHayaRecorridoMenosDe200Kilometros() {
		String nombreChofer = "Juan";
		Moto moto = new Moto(100, nombreChofer);

		moto.getKilometrosRecorridos();

		assertTrue(moto.getKilometrosRecorridos() < 200);

	}

	@Test
	public void noPermitirCambiarChoferConAcompaniante() {
		// Preparacion
		String nombreChofer = "Matias";
		String nombreAcompaniante1 = "Liliana";
		String nuevoChofer = "Agustin";
		Moto moto = new Moto(100, nombreChofer);
		// Ejecucion
		moto.agregarAcompanante(nombreAcompaniante1);
		moto.cambiarChofer(nuevoChofer);
		// validacion
		assertEquals(nombreChofer, moto.getChofer());
	}

}
