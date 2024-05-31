
package Parcial3;

import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SistemaDeGestionDeFlota sistema = new SistemaDeGestionDeFlota();

        try {
            
            Vehiculo auto1 = new Automovil("Toyota", "Corolla", 2020, 15000);
            Vehiculo camion1 = new Camion("Volvo", "FH", 2019, 50000);
            Vehiculo moto1 = new Motocicleta("Yamaha", "YZF-R3", 2021, 8000);

            sistema.agregarVehiculo(auto1);
            sistema.agregarVehiculo(camion1);
            sistema.agregarVehiculo(moto1);

            
            Conductor conductor1 = new Conductor("Juan Perez", "ABC123", "2025-12-31");
            Conductor conductor2 = new Conductor("Maria Lopez", "XYZ789", "2023-06-30");

            sistema.agregarConductor(conductor1);
            sistema.agregarConductor(conductor2);

          
            Viaje viaje1 = new Viaje(auto1, conductor1, new Date(), new Date(), "Ciudad A", 300);
            Viaje viaje2 = new Viaje(camion1, conductor2, new Date(), new Date(), "Ciudad B", 800);

            sistema.registrarViaje(viaje1);
            sistema.registrarViaje(viaje2);

            
            Mantenimiento mant1 = new Mantenimiento(auto1, "Cambio de aceite", new Date(), 15000);
            Mantenimiento mant2 = new Mantenimiento(camion1, "Inspección", new Date(), 50000);

            sistema.registrarMantenimiento(mant1);
            sistema.registrarMantenimiento(mant2);

           
            sistema.generarInformeRendimiento();
            sistema.generarAlertas();

            
            Vehiculo buscado = sistema.buscarVehiculoPorModelo("Corolla");
            System.out.println("Vehículo buscado: " + buscado);

            Conductor conductorBuscado = sistema.buscarConductorPorNombre("Maria Lopez");
            System.out.println("Conductor buscado: " + conductorBuscado);

        } catch (ParseException e) {
            System.err.println("Error al parsear la fecha: " + e.getMessage());
        }
    }
}