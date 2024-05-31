
package Parcial3_2;

import java.util.Date;

public class SistemaAlertas {
    public void recordatorioCita(Cita cita) {
        System.out.println("Recordatorio: Tienes una cita con el médico " + cita.getMedico().getNombre() +
                " el " + cita.getFecha() + ". Motivo: " + cita.getMotivo());
    }

    public void recordatorioMedicamento(Paciente paciente, Prescripcion prescripcion) {
        System.out.println("Recordatorio: Recuerda tomar tu medicamento " + prescripcion.getMedicamento() +
                ". Dosis: " + prescripcion.getDosis() + ". Paciente: " + paciente.getNombre());
    }

  
}
