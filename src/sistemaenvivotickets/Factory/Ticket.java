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
    private String estado;
    private static final String DISPONIBLE = "disponible";
    private static final String RESERVADO = "reservado";

    public boolean estaDisponible() {
        return estado.equals(DISPONIBLE);
    }

    public void reservar() {
        if (estaDisponible()) {
            estado = RESERVADO;
        } else {
            throw new IllegalStateException("El ticket no está disponible para reserva.");
        }
    }
}

