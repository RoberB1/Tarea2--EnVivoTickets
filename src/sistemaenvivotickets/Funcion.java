/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaenvivotickets;

import java.util.Date;
import java.util.Map;

/**
 *
 * @author rb122
 */
public class Funcion {
    Date fecha;
    int hora; // Primitive Obsession
    Map<String,String> mapaAsientos; // Inappropriate Intimacy
    
    
    public void mostrarDisponibilidad() {
        for (Map.Entry<String, String> entry : mapaAsientos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    //Long Method: Duplicación de Cadenas Literales 
    public void reservarAsiento(String asiento) {
        if (mapaAsientos.containsKey(asiento)) {
            String asiento1 = mapaAsientos.get(asiento);
            if(asiento1.equals("disponible")){
                mapaAsientos.put(asiento,  "reservado");
                System.out.println(asiento + " ha sido reservado.");
            }
        } else {
            System.out.println("El asiento no está disponible.");
        }
    }

    public Funcion(Date fecha, int hora, Map<String, String> mapaAsientos) {
        this.fecha = fecha;
        this.hora = hora;
        this.mapaAsientos = mapaAsientos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Map<String, String> getMapaAsientos() {
        return mapaAsientos;
    }

    public void setMapaAsientos(Map<String, String> mapaAsientos) {
        this.mapaAsientos = mapaAsientos;
    }
    
    
}
