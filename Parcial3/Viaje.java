
package Parcial3;

import java.util.Date;

public class Viaje {
    private Vehiculo vehiculo;
    private Conductor conductor;
    private Date fechaInicio;
    private Date fechaFin;
    private String destino;
    private int kilometraje;

    public Viaje(Vehiculo vehiculo, Conductor conductor, Date fechaInicio, Date fechaFin, String destino, int kilometraje) {
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.destino = destino;
        this.kilometraje = kilometraje;
    }

   
    public Vehiculo getVehiculo() 
    { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) 
    { this.vehiculo = vehiculo; }
    public Conductor getConductor() 
    { return conductor; }
    public void setConductor(Conductor conductor) 
    { this.conductor = conductor; }
    public Date getFechaInicio() 
    { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) 
    { this.fechaInicio = fechaInicio; }
    public Date getFechaFin() 
    { return fechaFin; }
    public void setFechaFin(Date fechaFin) 
    { this.fechaFin = fechaFin; }
    public String getDestino() 
    { return destino; }
    public void setDestino(String destino) 
    { this.destino = destino; }
    public int getKilometraje() 
    { return kilometraje; }
    public void setKilometraje(int kilometraje) 
    { this.kilometraje = kilometraje; }
}
