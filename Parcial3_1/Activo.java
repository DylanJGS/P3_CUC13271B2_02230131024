
package Parcial3_1;

public abstract class Activo {
    private String nombre;
    private double precioActual;
    private double[] historicoPrecios;
    private double volatilidad;

    public Activo(String nombre, double precioActual, double[] historicoPrecios, double volatilidad) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.historicoPrecios = historicoPrecios;
        this.volatilidad = volatilidad;
    }

    
    public String getNombre() 
    { return nombre; }
    public void setNombre(String nombre) 
    { this.nombre = nombre; }

    public double getPrecioActual() 
    { return precioActual; }
    public void setPrecioActual(double precioActual) 
    { this.precioActual = precioActual; }

    public double[] getHistoricoPrecios() 
    { return historicoPrecios; }
    public void setHistoricoPrecios(double[] historicoPrecios) 
    { this.historicoPrecios = historicoPrecios; }

    public double getVolatilidad() 
    { return volatilidad; }
    public void setVolatilidad(double volatilidad) 
    { this.volatilidad = volatilidad; }

   
    public abstract void actualizarPrecio();
}

