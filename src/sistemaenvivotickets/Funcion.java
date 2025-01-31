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
        this.mapaAsientos = new HashMap<>(mapaAsientos); // Copia para evitar modificaciones externas
    }

    // ✅ Encapsulación del acceso a los asientos
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
        } else {
            System.out.println("El asiento no está disponible.");
            return false;
        }
    }

    // ✅ Métodos encapsulados para manejar los asientos
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

    // ✅ Métodos para acceder a la información de los asientos sin exponer la estructura
    public Map<String, String> obtenerCopiaAsientos() {
        return new HashMap<>(mapaAsientos);
    }

    public String obtenerEstadoAsiento(String asiento) {
        return mapaAsientos.getOrDefault(asiento, "No existe");
    }

    // ✅ Encapsulación del acceso a la fecha y hora
    public LocalDateTime getFechaYHora() {
        return fechaHora;
    }

    public void setFechaYHora(LocalDateTime fecha) {
        this.fechaHora = fecha;
    }
}