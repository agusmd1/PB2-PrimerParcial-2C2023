package ar.edu.unlam.pb2.empresaTransporte;

import java.util.ArrayList;

public class Auto extends Vehiculo {
	private ArrayList<String> pasajeros = new ArrayList<>();

	public Auto(Integer kilometrosRecorridos, String chofer) {
		super(kilometrosRecorridos, chofer);
	}

	public ArrayList<String> getPasajeros() {
		return pasajeros;
	}

	public Boolean agregarPasajero(String nuevoPasajero) {
		if (pasajeros.size() < 3) {
			pasajeros.add(nuevoPasajero);
			return true;
		} else {
			return false;
		}
	}

	public void quitarAcompanante(String pasajero) {
		pasajeros.remove(pasajero);
	}

	@Override
	public void cambiarChofer(String nuevoChofer) {
		if (pasajeros.isEmpty()) {
			super.cambiarChofer(nuevoChofer);
		}
	}
}
