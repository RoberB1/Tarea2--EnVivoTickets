package sistemaenvivotickets.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observer {
    private List<Observer> observadores = new ArrayList<>(); 
    private String nombre; 

    public Subject(String nombre) {
        this.nombre = nombre;
    }

    public void agregarObservador(Observer obs) {
        observadores.add(obs);
    }

    public void eliminarObservador(Observer obs) {
        observadores.remove(obs);
    }

    public void notificarCambios(String msg) {
        for (Observer obs : observadores) {
            obs.recibirNotificación(msg);
        }
    }

    @Override
    public void recibirNotificación(String msg) {
        System.out.println("Subject '" + nombre + "' recibió notificación: " + msg);
        notificarCambios(msg); 
    }
}

