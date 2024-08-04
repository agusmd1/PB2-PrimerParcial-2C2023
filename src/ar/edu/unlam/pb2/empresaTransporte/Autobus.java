package ar.edu.unlam.pb2.empresaTransporte;

import java.util.ArrayList;

public class Autobus extends Vehiculo {
	private ArrayList<String> pasajeros = new ArrayList<>();

	public Autobus(Integer kilometrosRecorridos, String chofer) {
		super(kilometrosRecorridos, chofer);

	}

	public Boolean agregarPasajero(String nuevoPasajero) {
		if (pasajeros.size() < 20) {
			pasajeros.add(nuevoPasajero);
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<String> getPasajeros() {
		return pasajeros;
	}

	public void quitarPasajero(String pasajero) {
		pasajeros.remove(pasajero);
	}

	@Override
	public void cambiarChofer(String nuevoChofer) {
		if (pasajeros.isEmpty()) {
			super.cambiarChofer(nuevoChofer);
		}
	}
}
