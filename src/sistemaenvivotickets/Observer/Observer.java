package sistemaenvivotickets.Observer;

public interface Observer {
    public void recibirNotificación(String msg);
    public void eliminarObservador(Observer obs);
    public void notificarCambios(String msg);
}