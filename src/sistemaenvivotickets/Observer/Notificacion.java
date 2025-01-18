package sistemaenvivotickets.Observer;

public class Notificacion {
    private Subject evento; 
    private String nombreEvento;

    public Notificacion(String nombreEvento) {
        this.nombreEvento = nombreEvento; 
        this.evento = new Subject(nombreEvento); 
    }

    public void agregarObservador(Observer obs) {
        evento.agregarObservador(obs);
        System.out.println("Observador agregado al evento: " + nombreEvento);
    }

    public void eliminarObservador(Observer obs) {
        evento.eliminarObservador(obs);
        System.out.println("Observador eliminado del evento: " + nombreEvento);
    }

    public void cambiarProgramacion(String detalleCambio) {
        System.out.println("Cambio en el evento '" + nombreEvento + "': " + detalleCambio);
        evento.notificarCambios("Evento '" + nombreEvento + "' - " + detalleCambio);
    }
}

