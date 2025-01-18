package sistemaenvivotickets;

import java.util.List;

public class Soporte {
    private List<String> incidentes;
    private String equipoEscalado;

    public void registrarIncidente(String incidente) {
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
