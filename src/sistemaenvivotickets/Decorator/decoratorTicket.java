package sistemaenvivotickets.Decorator;

import sistemaenvivotickets.Factory.Ticket;

public class decoratorTicket extends Ticket {
    protected Ticket ticket;

    public decoratorTicket(Ticket ticket) {
        super();
        this.ticket = ticket;
    }

    public void agregarCaracteristica() {
        ticket.agregarCaracteristica();
    }
}
