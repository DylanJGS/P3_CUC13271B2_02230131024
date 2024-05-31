
package Parcial3_1;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeMercado {
    private List<Activo> activos;
    private List<Usuario> usuarios;

    public SistemaDeMercado() {
        activos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

   
    public void agregarActivo(Activo activo) {
        activos.add(activo);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    
    public List<Activo> getActivos() {
        return activos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    
    public void actualizarPrecios() {
        for (Activo activo : activos) {
            activo.actualizarPrecio();
        }
    }

    
    public void generarInformeRendimiento() {
        System.out.println("---- Informe de Rendimiento del Mercado ----");
        for (Activo activo : activos) {
            System.out.println("Activo: " + activo.getNombre() + ", Precio Actual: $" + activo.getPrecioActual());
            // Agregar más análisis según necesidad
        }
    }

    
    public void generarAlertas() {
        System.out.println("---- Alertas del Mercado ----");
        for (Activo activo : activos) {
            if (activo.getVolatilidad() > 0.05) { // Por ejemplo, alerta si la volatilidad es mayor a 5%
                System.out.println("Alta volatilidad en: " + activo.getNombre());
            }
        }
    }
}