package sistemaenvivotickets.Decorator;

import sistemaenvivotickets.Factory.Ticket;
//Refused Bequest
public class decoratorTicket {
    private Ticket ticket;

    public decoratorTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void agregarCaracteristica() {
        ticket.agregarCaracteristica();
    }
}
