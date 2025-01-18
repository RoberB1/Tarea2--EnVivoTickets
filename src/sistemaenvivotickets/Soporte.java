package sistemaenvivotickets;

import java.util.List;

public class Soporte {
    private List<String> incidentes;
    private String equipoEscalado;

    public void registrarIncidente(String incidentes){
        // cade logic as para registrar el incidente y agregarlo a la lista
    }

    public void escalarIncidente(String incidente){
        // cade logic as para escalar el incidente y asignar el equipo
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
