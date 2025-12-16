package modelo.personas;

import java.util.ArrayList;
import java.util.List;
import modelo.gestion.Turno;
import modelo.patrones.Observador;

public class Paciente extends Persona {
	private String obraSocial;
	private int contadorInasistencias = 0;
	private List<Turno> historialTurnos;
	
	private List<Observador> suscriptores = new ArrayList<>();
	private boolean changed = false;
	


	public Paciente(String dni, String nombre, String email, String obraSocial) {
		super(dni, nombre, email);
		this.obraSocial = obraSocial;
		this.historialTurnos = new ArrayList<>();
		
		
	}
	public void agregarObservador(Observador o) {
        this.suscriptores.add(o);
    }
	
	private void notificarAdministrativos(Object arg) {
		if(this.changed) {
			for (Observador o : suscriptores) {
				o.actualizar(this, arg);
			}
			this.changed = false;
			
		}
	}
	
	public void registrarInasistencia() {
		this.contadorInasistencias++;
		
		if(this.contadorInasistencias >= 3) {
			setChanged();
			notificarAdministrativos("ALERTA: Paciente con 3 faltas. Llamar urgente.");
		}
		
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public List<Turno> getHistorialTurnos() {
		return historialTurnos;
	}

	public boolean isChanged() {
		return changed;
	}
	public boolean setChanged() {
		return changed;
	}
	
}
