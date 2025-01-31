/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaenvivotickets;

import java.util.Date;
import java.util.Map;
import java.time.*;

/**
 *
 * @author rb122
 */
public class Funcion {
    LocalDateTime fechaHora;
    Map<String,String> mapaAsientos;
    
    
    public void mostrarDisponibilidad() {
        for (Map.Entry<String, String> entry : mapaAsientos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void reservarAsiento(String asiento) {
        if (mapaAsientos.containsKey(asiento) && mapaAsientos.get(asiento).equals("disponible")) {
            mapaAsientos.put(asiento, "reservado");
            System.out.println(asiento + " ha sido reservado.");
        } else {
            System.out.println("El asiento no está disponible.");
        }
    }

    public Funcion(LocalDateTime Fecha, Map<String, String> mapaAsientos) {
        this.fechaHora = Fecha;
        this.mapaAsientos = mapaAsientos;
    }


    public LocalDateTime getFechaYHora() {
        return fechaHora;
    }

    public void setFechaYHora(LocalDateTime fecha) {
        this.fechaHora = fecha;
    }

    public Map<String, String> getMapaAsientos() {
        return mapaAsientos;
    }

    public void setMapaAsientos(Map<String, String> mapaAsientos) {
        this.mapaAsientos = mapaAsientos;
    }
    
    
}
