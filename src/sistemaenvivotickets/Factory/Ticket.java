/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaenvivotickets.Factory;

/**
 *
 * @author rb122
 */
public class Ticket {
    int idTicket;
    String estado;
    Double precio;
    String Seccion;
            
    public void reservar(){
        //codigo
    } 
    
    public void cancelarReserva(){
        //Codigo
    }

    public Ticket(int idTicket, String estado, Double precio, String Seccion) {
        this.idTicket = idTicket;
        this.estado = estado;
        this.precio = precio;
        this.Seccion = Seccion;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
    public void agregarCaracteristica(){
        System.out.println("caracteristicas agregadas");
    }
    
}
