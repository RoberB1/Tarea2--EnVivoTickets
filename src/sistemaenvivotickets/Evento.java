/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaenvivotickets;

import java.util.List;
import sistemaenvivotickets.Observer.Observer;

/**
 *
 * @author rb122
 */
public class Evento {
    int idEvento;
    String nombre;
    String tipo;
    String descripcion;
    List<String> elenco;
    List<Observer> observers;
    
     public void agregarObservador(Observer obs) {
        observers.add(obs);
    }

    public void eliminarObservador(Observer obs) {
        observers.remove(obs);
    }

    public void notificarCambios(String msg) {
        for (Observer obs : observers) {
            obs.recibirNotificación(msg);
        }
    }
    
    public void actualizarEvento(String msg){
        //Codigo
    }

    public Evento(int idEvento, String tipo, String descripcion, List<String> elenco, List<Observer> observers) {
        this.idEvento = idEvento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.elenco = elenco;
        this.observers = observers;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    
}
