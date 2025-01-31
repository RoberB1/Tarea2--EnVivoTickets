package sistemaenvivotickets.Decorator;

import sistemaenvivotickets.Factory.Ticket;
public class decoratorTicket {
    private Ticket ticket;

    public decoratorTicket(Ticket ticket) {
        this.ticket = ticket;
    }

}

