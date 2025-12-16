package modelo.prestaciones;

public abstract class Prestacion {
	protected String diagnostico;
	protected boolean realizada;
	
	public Prestacion() {
		this.realizada = false;
	}
	
	public void registrarDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
		this.realizada = true;
	}
	
}
