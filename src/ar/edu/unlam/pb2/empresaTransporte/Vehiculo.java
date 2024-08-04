package ar.edu.unlam.pb2.empresaTransporte;

public abstract class Vehiculo {
	private Integer kilometrosRecorridos;
	private String chofer;

	public Vehiculo(Integer kilometrosRecorridos, String chofer) {
		this.kilometrosRecorridos = kilometrosRecorridos;
		this.chofer = chofer;
	}

	public Integer getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public String getChofer() {
		return chofer;
	}

	public void cambiarChofer(String nuevoChofer) {
		this.chofer = nuevoChofer;
	}
}
