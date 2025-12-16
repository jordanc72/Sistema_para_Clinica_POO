package modelo.personas;

import modelo.patrones.Observador;

public class Administrativo extends Persona implements Observador {
    
    public Administrativo(String dni, String nombre, String email) {
        super(dni, nombre, email);
    }

    @Override
    public void actualizar(Object observable, Object argumento) {
        // Casteamos para saber quién mandó la alerta
        Paciente p = (Paciente) observable;
        String mensaje = (String) argumento;
        
        System.out.println(">>> ADMINISTRATIVO NOTIFICADO <<<");
        System.out.println("Paciente: " + p.getNombre());
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Acción: Generando orden de llamado telefónico...");
    }
}