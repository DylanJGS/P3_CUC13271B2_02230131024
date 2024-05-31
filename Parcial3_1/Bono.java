
package Parcial3_1;

public class Bono extends Activo {
    public Bono(String nombre, double precioActual, double[] historicoPrecios, double volatilidad) {
        super(nombre, precioActual, historicoPrecios, volatilidad);
    }

    @Override
    public void actualizarPrecio() {
        
        double nuevoPrecio = getPrecioActual() * (1 + (Math.random() - 0.5) * getVolatilidad());
        setPrecioActual(nuevoPrecio);
    }
}