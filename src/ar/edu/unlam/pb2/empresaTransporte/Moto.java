package ar.edu.unlam.pb2.empresaTransporte;

import java.util.ArrayList;

public class Moto extends Vehiculo {
	private ArrayList<String> acompanantes = new ArrayList<>();

	public Moto(Integer kilometrosRecorridos, String chofer) {
		super(kilometrosRecorridos, chofer);
	}

	public ArrayList<String> getAcompanantes() {
		return acompanantes;
	}

	public Boolean agregarAcompanante(String nuevoAcompanante) {
		if (acompanantes.size() < 1) {
			acompanantes.add(nuevoAcompanante);
			return true;
		} else {
			return false;
		}
	}

	public void quitarAcompanante(String acompanante) {
		acompanantes.remove(acompanante);
	}

	@Override
	public void cambiarChofer(String nuevoChofer) {
		if (acompanantes.isEmpty()) {
			super.cambiarChofer(nuevoChofer);
		}
	}

}
