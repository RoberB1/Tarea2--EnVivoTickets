package sistemaenvivotickets.Decorator;
import sistemaenvivotickets.Decorator.decoratorTicket;
import sistemaenvivotickets.Factory.Ticket;

public class TicketConAlimento extends decoratorTicket{
    public TicketConAlimento(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Alimento agregado al ticket");
    }

}
