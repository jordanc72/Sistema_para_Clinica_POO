package modelo.personas;

import java.util.ArrayList;
import java.util.List;
import modelo.gestion.Turno;
import modelo.patrones.Observador;

public class Paciente extends Persona {
	private String obraSocial;
	private int contadorInasistencias;
	private List<Turno> historialTurnos;
	
	private List<Observador> suscriptores = new ArrayList<>();

	public Paciente(String dni, String nombre, String email, String obraSocial) {
		super(dni, nombre, email);
		this.obraSocial = obraSocial;
		this.historialTurnos = new ArrayList<>();
		this.contadorInasistencias = 0;
		
	}
	
	public void registrarInasistencias() {
		this.contadorInasistencias++;
		if(this.contadorInasistencias>3) {
			notificarAdministrativos();
		}
		
	}
	private void notificarAdministrativos() {
		for (Observador o : suscriptores) {
			o.actualizar(registrarInasistencias());
		}
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public List<Turno> getHistorialTurnos() {
		return historialTurnos;
	}
	
	
}
