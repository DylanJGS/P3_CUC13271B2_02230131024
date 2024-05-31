
package Parcial3_2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
      
        Medico medico1 = new Medico("Dr. Pérez", "Pediatría");
        Medico medico2 = new Medico("Dr. Gómez", "Cardiología");

        
        SistemaCitas sistemaCitas = new SistemaCitas();
        sistemaCitas.agregarMedico(medico1);
        sistemaCitas.agregarMedico(medico2);

        
        Paciente paciente1 = new Paciente("Juan", 25, "Calle A, Ciudad B", "12345");

        
        Cita cita1 = new Cita(paciente1, medico1, new Date(), "Consulta de rutina");
        sistemaCitas.programarCita(paciente1, medico1, cita1);

       
        Prescripcion prescripcion1 = new Prescripcion("Paracetamol", "500mg cada 8 horas");
        paciente1.getHistorialMedico().agregarPrescripcion(prescripcion1);

       
        SistemaAlertas sistemaAlertas = new SistemaAlertas();
        sistemaAlertas.recordatorioCita(cita1);
        sistemaAlertas.recordatorioMedicamento(paciente1, prescripcion1);
    }
}