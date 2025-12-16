package modelo.gestion;

import java.time.LocalDateTime;
import modelo.personas.*;
import modelo.infraestructura.LugarAtencion;
import modelo.prestaciones.Prestacion;

public class Turno {
	private LocalDateTime horaInicio;
	private LocalDateTime horaFin;
	private boolean asistencia;
	
	private Medico medicoAsignado;
	private Paciente paciente;
	private LugarAtencion lugar;
	private Prestacion prestacion;
	
	public Turno(LocalDateTime horaInicio, Medico medico, Paciente paciente ) {
		this.horaInicio = horaInicio;
		//Se asume que cada cita dura 30´
		this.horaFin = horaInicio.plusMinutes(30);
		this.medicoAsignado = medico;
		this.paciente= paciente;
	}
	
	//Metodo para evitar solapaciones
	public boolean seSuperponeCon(LocalDateTime otroInicio, LocalDateTime otroFin) {
		return this.horaInicio.isBefore(otroFin) && otroInicio.isBefore(this.horaFin);
	}
	
	public void registrarAsistencia(boolean vino) {
		this.asistencia = vino;
		if(!vino) {
			paciente.registrarInasistencia();
		}	
		
	}

	public Medico getMedicoAsignado() {
		return medicoAsignado;
	}

	public void setMedicoAsignado(Medico medicoAsignado) {
		this.medicoAsignado = medicoAsignado;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LugarAtencion getLugar() {
		return lugar;
	}

	public void setLugar(LugarAtencion lugar) {
		this.lugar = lugar;
	}

	public Prestacion getPrestacion() {
		return prestacion;
	}

	public void setPrestacion(Prestacion prestacion) {
		this.prestacion = prestacion;
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	public LocalDateTime getHoraFin() {
		return horaFin;
	}
	
}
