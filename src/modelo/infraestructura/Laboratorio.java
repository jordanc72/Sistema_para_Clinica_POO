package modelo.infraestructura;

public class Laboratorio extends LugarAtencion{
	
	public Laboratorio(int numeroSala) {
		super(numeroSala);
		this.tieneEquiposEspeciales = true;
	}
	@Override
	public boolean esAptoParaEstudios() {
		return true;
	}
	
}
