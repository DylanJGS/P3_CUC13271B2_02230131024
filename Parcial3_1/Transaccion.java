

package Parcial3_1;

import java.util.Date;


public class Transaccion {
    private Activo activo;
    private int cantidad;
    private double precio;
    private String tipo; 
    private Date fecha;

    public Transaccion(Activo activo, int cantidad, double precio, String tipo) {
        this.activo = activo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
        this.fecha = new Date();
    }

    
    public Activo getActivo() 
    { return activo; }
    public void setActivo(Activo activo) 
    { this.activo = activo; }

    public int getCantidad() 
    { return cantidad; }
    public void setCantidad(int cantidad) 
    { this.cantidad = cantidad; }

    public double getPrecio() 
    { return precio; }
    public void setPrecio(double precio) 
    { this.precio = precio; }

    public String getTipo() 
    { return tipo; }
    public void setTipo(String tipo) 
    { this.tipo = tipo; }

    public Date getFecha() 
    { return fecha; }
    public void setFecha(Date fecha) 
    { this.fecha = fecha; }

    @Override
    public String toString() {
        return tipo + " de " + cantidad + " " + activo.getNombre() + " a $" + precio + " el " + fecha;
    }
}
