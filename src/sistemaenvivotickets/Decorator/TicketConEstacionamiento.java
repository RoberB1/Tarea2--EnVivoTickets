package Decorator;
import sistemaenvivotickets.Factory.Ticket;

public class TicketConEstacionamiento extends decoratorTicket{
    public TicketConEstacionamiento(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Estacionamiento agregado al ticket");
    }


}
