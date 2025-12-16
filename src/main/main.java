package main;

import java.time.LocalDateTime;

import modelo.personas.Medico;
import modelo.personas.Paciente;

public class main {
	public static void main(String[] args) {
	    Clinica clinica = new Clinica();
	    Medico medicoA = new Medico("31548951","jose","medico@gmail.com","oftalmologo");
	    Paciente paciente1 = new Paciente("41543251","martin","paciente1@gmail.com","UOCRA");
	    Paciente paciente2 = new Paciente("21343283","marta","paciente2@gmail.com","PAMI");
	    // ... crear medicos y pacientes ...
	    
	    try {
	        // Turno 1: Lunes 10:00hs (Debería funcionar)
	        clinica.agendarTurno(medicoA, paciente1, LocalDateTime.of(2023, 10, 20, 10, 0));
	        
	        // Turno 2: Lunes 10:15hs (Debería FALLAR porque el Turno 1 termina 10:30)
	        clinica.agendarTurno(medicoA, paciente2, LocalDateTime.of(2023, 10, 20, 10, 30));
	        
	    } catch (Exception e) {
	        System.out.println("¡Validación exitosa! Saltó el error: " + e.getMessage());
	    }
	}
}
