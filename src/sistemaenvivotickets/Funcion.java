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
    int hora;
    Map<String,String> mapaAsientos;
    
    
    public void verDisponibilidad(){
        //Codigo
    }
    
    public void reservarAsientos(String asiento){
        //Codigo
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

    public String mostrarDisponibilidad() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
