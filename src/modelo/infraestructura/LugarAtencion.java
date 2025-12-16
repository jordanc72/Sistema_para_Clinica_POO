package modelo.infraestructura;

public abstract class LugarAtencion {
	protected int numeroSala;
	protected boolean tieneEquiposEspeciales;
	
	public LugarAtencion(int numeroSala) {
	this.numeroSala= numeroSala;
	}	
	
	public abstract boolean esAptoParaEstudios();
	
	
}
