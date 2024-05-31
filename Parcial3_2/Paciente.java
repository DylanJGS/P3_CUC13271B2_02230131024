
package Parcial3_2;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private int edad;
    private String direccion;
    private String numeroSeguroSocial;
    private List<Cita> citas;
    private HistorialMedico historialMedico;

    public Paciente(String nombre, int edad, String direccion, String numeroSeguroSocial) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.citas = new ArrayList<>();
        this.historialMedico = new HistorialMedico();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void cancelarCita(Cita cita) {
        citas.remove(cita);
    }

}