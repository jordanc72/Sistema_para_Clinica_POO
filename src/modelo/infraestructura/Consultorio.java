package modelo.infraestructura;

public class Consultorio extends LugarAtencion {
	
	public Consultorio(int numeroSala) {
		super(numeroSala);
		this.tieneEquiposEspeciales = false;
	}
	
	@Override
	public boolean esAptoParaEstudios() {
		return false;
	}

}
