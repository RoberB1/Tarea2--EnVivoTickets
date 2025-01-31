package sistemaenvivotickets;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rb122
 */
public class Funcion {
    private LocalDateTime fechaHora;
    private Map<String, String> mapaAsientos;

    public Funcion(LocalDateTime fecha, Map<String, String> mapaAsientos) {
        this.fechaHora = fecha;
        this.mapaAsientos = new HashMap<>(mapaAsientos); 
    }

    public boolean estaDisponible(String asiento) {
        return mapaAsientos.containsKey(asiento) && mapaAsientos.get(asiento).equals("disponible");
    }

    public void mostrarDisponibilidad() {
        mapaAsientos.forEach((asiento, estado) -> System.out.println(asiento + ": " + estado));
    }

    public boolean reservarAsiento(String asiento) {
        if (estaDisponible(asiento)) {
            mapaAsientos.put(asiento, "reservado");
            System.out.println(asiento + " ha sido reservado.");
            return true;
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
            return false;
        }
    }

    public void liberarAsiento(String asiento) {
        if (mapaAsientos.containsKey(asiento)) {
            mapaAsientos.put(asiento, "disponible");
            System.out.println(asiento + " ha sido liberado.");
        } else {
            System.out.println("El asiento no existe.");
        }
    }

    public void cancelarReserva(String asiento) {
        if (mapaAsientos.containsKey(asiento) && mapaAsientos.get(asiento).equals("reservado")) {
            mapaAsientos.put(asiento, "disponible");
            System.out.println("La reserva del asiento " + asiento + " ha sido cancelada.");
        } else {
            System.out.println("No se puede cancelar la reserva del asiento.");
        }
    }

    public Map<String, String> obtenerCopiaAsientos() {
        return new HashMap<>(mapaAsientos);
    }

    public String obtenerEstadoAsiento(String asiento) {
        return mapaAsientos.getOrDefault(asiento, "No existe");
    }

    public LocalDateTime getFechaYHora() {
        return fechaHora;
    }

    public void setFechaYHora(LocalDateTime fecha) {
        this.fechaHora = fecha;
    }
}