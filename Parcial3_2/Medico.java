
package Parcial3_2;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nombre;
    private String especialidad;
    private List<Cita> citasDisponibles;

    public Medico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.citasDisponibles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Cita> getCitasDisponibles() {
        return citasDisponibles;
    }

    public void setCitasDisponibles(List<Cita> citasDisponibles) {
        this.citasDisponibles = citasDisponibles;
    }

    public void agregarCitaDisponible(Cita cita) {
        citasDisponibles.add(cita);
    }

    public void eliminarCitaDisponible(Cita cita) {
        citasDisponibles.remove(cita);
    }

    //
}
