
package Parcial3_2;

import java.util.ArrayList;
import java.util.List;

public class SistemaCitas {
    private List<Medico> medicos;

    public SistemaCitas() {
        this.medicos = new ArrayList<>();
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void programarCita(Paciente paciente, Medico medico, Cita cita) {
        medico.agregarCitaDisponible(cita);
        paciente.agregarCita(cita);
    }

    public void cancelarCita(Paciente paciente, Medico medico, Cita cita) {
        medico.eliminarCitaDisponible(cita);
        paciente.cancelarCita(cita);
    }

   
}