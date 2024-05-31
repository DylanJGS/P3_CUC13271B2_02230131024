
package Parcial3_2;

import java.util.Date;

public class Cita {
    private Paciente paciente;
    private Medico medico;
    private Date fecha;
    private String motivo;

    public Cita(Paciente paciente, Medico medico, Date fecha, String motivo) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}