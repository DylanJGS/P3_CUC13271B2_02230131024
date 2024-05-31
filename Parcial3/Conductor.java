
package Parcial3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conductor {
    private String nombre;
    private String licencia;
    private Date fechaVencimientoLicencia;

    public Conductor(String nombre, String licencia, String fechaVencimientoLicencia) throws ParseException {
        this.nombre = nombre;
        this.licencia = licencia;
        this.fechaVencimientoLicencia = new SimpleDateFormat("yyyy-MM-dd").parse(fechaVencimientoLicencia);
    }

    
    public String getNombre() 
    { return nombre; }
    public void setNombre(String nombre) 
    { this.nombre = nombre; }
    public String getLicencia() 
    { return licencia; }
    public void setLicencia(String licencia) 
    { this.licencia = licencia; }
    public Date getFechaVencimientoLicencia() 
    { return fechaVencimientoLicencia; }
    
    public void setFechaVencimientoLicencia(String fechaVencimientoLicencia) throws ParseException {
        this.fechaVencimientoLicencia = new SimpleDateFormat("yyyy-MM-dd").parse(fechaVencimientoLicencia);
    }

    @Override
    public String toString() {
        return nombre + " (Licencia: " + licencia + ")";
    }
}