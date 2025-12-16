package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import modelo.gestion.Turno;
import modelo.personas.Medico;
import modelo.personas.Paciente;

public class Clinica {
	
	private List<Turno> listaDeTurnos;
	
	public Clinica() {
		this.listaDeTurnos = new ArrayList<>();
	}
	
	public void agendarTurno(Medico medico, Paciente paciente, LocalDateTime fecha) throws Exception {
	    
	    // 1. Crear el candidato
	    Turno nuevoTurno = new Turno(fecha, medico, paciente);

	    
		// 2. VALIDAR SUPERPOSICIÓN (Recorrer lista de turnos del sistema)
	    for (Turno t : this.listaDeTurnos) {
	        // Solo verificamos si es el mismo médico (y quizás el mismo consultorio)
	        if (t.getMedicoAsignado().equals(medico)) {
	            
	            if (nuevoTurno.seSuperponeCon(t.getHoraInicio(), t.getHoraFin())) {
	                throw new Exception("Error: El médico ya tiene un turno en ese horario.");
	            }
	        }
	    }

	    // 3. Si pasó el bucle, guardamos
	    listaDeTurnos.add(nuevoTurno);
	    System.out.println("Turno agendado con éxito para el paciente " + paciente.getNombre());
	}

}
