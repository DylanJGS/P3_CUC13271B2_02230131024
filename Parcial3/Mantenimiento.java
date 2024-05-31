
package Parcial3;

import java.util.Date;

public class Mantenimiento {
    private Vehiculo vehiculo;
    private String tipo;
    private Date fecha;
    private int kilometraje;

    public Mantenimiento(Vehiculo vehiculo, String tipo, Date fecha, int kilometraje) {
        this.vehiculo = vehiculo;
        this.tipo = tipo;
        this.fecha = fecha;
        this.kilometraje = kilometraje;
    }

    // Getters y Setters
    public Vehiculo getVehiculo() 
    { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) 
    { this.vehiculo = vehiculo; }
    public String getTipo() 
    { return tipo; }
    public void setTipo(String tipo)
    { this.tipo = tipo; }
    public Date getFecha() 
    { return fecha; }
    public void setFecha(Date fecha) 
    { this.fecha = fecha; }
    public int getKilometraje() 
    { return kilometraje; }
    public void setKilometraje(int kilometraje) 
    { this.kilometraje = kilometraje; }
}