
package Parcial3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaDeGestionDeFlota {
    private List<Vehiculo> vehiculos;
    private List<Conductor> conductores;
    private List<Viaje> viajes;
    private List<Mantenimiento> mantenimientos;

    public SistemaDeGestionDeFlota() {
        vehiculos = new ArrayList<>();
        conductores = new ArrayList<>();
        viajes = new ArrayList<>();
        mantenimientos = new ArrayList<>();
    }

    
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public void registrarViaje(Viaje viaje) {
        viajes.add(viaje);
    }

    public void registrarMantenimiento(Mantenimiento mantenimiento) {
        mantenimientos.add(mantenimiento);
    }

   
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public List<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }

   
    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public void eliminarConductor(Conductor conductor) {
        conductores.remove(conductor);
    }

    public void eliminarViaje(Viaje viaje) {
        viajes.remove(viaje);
    }

    public void eliminarMantenimiento(Mantenimiento mantenimiento) {
        mantenimientos.remove(mantenimiento);
    }

    
    public void generarInformeRendimiento() {
        System.out.println("---- Informe de Rendimiento de la Flota ----");
        for (Vehiculo vehiculo : vehiculos) {
            List<Viaje> viajesVehiculo = viajes.stream()
                    .filter(v -> v.getVehiculo().equals(vehiculo))
                    .collect(Collectors.toList());
            double totalKilometraje = viajesVehiculo.stream().mapToDouble(Viaje::getKilometraje).sum();
            System.out.println("Vehículo: " + vehiculo);
            System.out.println("Total de Kilometraje: " + totalKilometraje + " km");
           
        }
    }

   
    public void generarAlertas() {
        System.out.println("---- Alertas de la Flota ----");
        Date now = new Date();
        for (Conductor conductor : conductores) {
            if (now.after(conductor.getFechaVencimientoLicencia())) {
                System.out.println("Licencia vencida para el conductor: " + conductor.getNombre());
            }
        }
       
    }

   
    public Vehiculo buscarVehiculoPorModelo(String modelo) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getModelo().equalsIgnoreCase(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }

    public Conductor buscarConductorPorNombre(String nombre) {
        for (Conductor conductor : conductores) {
            if (conductor.getNombre().equalsIgnoreCase(nombre)) {
                return conductor;
            }
        }
        return null;
    }

    public List<Viaje> buscarViajesPorDestino(String destino) {
        return viajes.stream()
                .filter(v -> v.getDestino().equalsIgnoreCase(destino))
                .collect(Collectors.toList());
    }

    public List<Mantenimiento> buscarMantenimientosPorTipo(String tipo) {
        return mantenimientos.stream()
                .filter(m -> m.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }
}