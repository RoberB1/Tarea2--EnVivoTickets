package Decorator;
import sistemaenvivotickets.Factory.Ticket;


public class TicketConBebida extends decoratorTicket{
    public TicketConBebida(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Bebida agregada al ticket");
    }

}
