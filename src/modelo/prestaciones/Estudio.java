package modelo.prestaciones;

public class Estudio extends Prestacion{
	private String tipoEquipoRequerido;
	
	public Estudio(String tipoEquipo) {
		this.tipoEquipoRequerido = tipoEquipo;
		
	}

	public String getTipoEquipoRequerido() {
		return tipoEquipoRequerido;
	}

	public void setTipoEquipoRequerido(String tipoEquipoRequerido) {
		this.tipoEquipoRequerido = tipoEquipoRequerido;
	}
	
}
