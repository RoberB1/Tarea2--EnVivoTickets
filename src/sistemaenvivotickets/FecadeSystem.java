package sistemaenvivotickets;
import java.util.List;
public class FecadeSystem {
   

    private List<Evento> eventos;
    private List<Usuario> usuarios;

   

    // Método para ver la disponibilidad de asientos para un evento y función específica
    public void verDisponibilidad(Evento evento, Funcion funcion) {
        System.out.println("Disponibilidad para el evento: " + evento.getNombre());
        funcion.mostrarDisponibilidad();
    }

    // Método para reservar un ticket
    public void reservarTicket(Ticket ticket) {
        if (ticket.getEstado().equals("disponible")) {
            ticket.setEstado("reservado");
            System.out.println("El ticket ha sido reservado: " + ticket);
        } else {
            System.out.println("El ticket no está disponible para reserva.");
        }
    }

    // Método para realizar un pago
    public void realizarPago(double monto) {
        System.out.println("Pago realizado exitosamente por el monto de: $" + monto);
        // Aquí se puede integrar la lógica de procesamiento de pagos
    }

    // Getters y Setters
    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
}