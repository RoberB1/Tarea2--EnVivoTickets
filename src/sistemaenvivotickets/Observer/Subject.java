package sistemaenvivotickets.Observer;

public interface Subject {
    public void agregarObservador(Observer obs);
    public void eliminarObservador(Observer obs);
    public void notificarCambios(String msg);
}
