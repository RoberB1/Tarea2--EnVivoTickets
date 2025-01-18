package sistemaenvivotickets.Decorator;

import sistemaenvivotickets.Factory.Ticket;

public class decoratorTicket {
    protected Ticket ticket;

    public decoratorTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void agregarCaracteristica() {
        ticket.agregarCaracteristica();
    }
}
