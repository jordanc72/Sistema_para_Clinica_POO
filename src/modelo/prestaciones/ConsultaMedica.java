package modelo.prestaciones;

import java.util.List;

public class ConsultaMedica extends Prestacion{
	private List<String> medicamentosRecetados;
	
	public void agregarReceta(String medicamento) {
		this.medicamentosRecetados.add(medicamento);
	}
	
}
