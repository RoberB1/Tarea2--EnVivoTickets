package sistemaenvivotickets;

import java.util.ArrayList;
import java.util.List;

public class Soporte {
    private String equipoEscalado;
    //Null Pointer Risk
    private List<String> incidentes = new ArrayList<>();

public void registrarIncidente(String incidente) {
    if (incidente == null || incidente.trim().isEmpty()) {
        throw new IllegalArgumentException("El incidente no puede ser nulo o vacío.");
    }
    incidentes.add(incidente);
    System.out.println("Incidente registrado: " + incidente);
}

    public void escalarIncidente(String incidente) {
        System.out.println("El incidente '" + incidente + "' ha sido escalado al equipo correspondiente.");
    }
    
    public String getEquipoEscalado() {
        return equipoEscalado;
    }
    public void setEquipoEscalado(String equipoEscalado) {
        this.equipoEscalado = equipoEscalado;
    }
    public List<String> getIncidentes() {
        return incidentes;
    }
    public void setIncidentes(List<String> incidentes) {
        this.incidentes = incidentes;
    }
    
    

}
