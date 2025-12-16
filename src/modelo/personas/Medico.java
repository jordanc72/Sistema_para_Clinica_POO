package modelo.personas;

public class Medico extends Persona{
	private String especialidad;
	
	private boolean esCoordinador;

	public Medico(String dni, String nombre, String email, String especialidad) {
		super(dni, nombre, email);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public boolean isEsCoordinador() {
		return esCoordinador;
	}

	public void setEsCoordinador(boolean esCoordinador) {
		this.esCoordinador = esCoordinador;
	} 
	
	
}
