
package Parcial3_2;

import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<Diagnostico> diagnosticos;
    private List<Prescripcion> prescripciones;
    private List<ResultadoExamen> resultadosExamenes;

    public HistorialMedico() {
        this.diagnosticos = new ArrayList<>();
        this.prescripciones = new ArrayList<>();
        this.resultadosExamenes = new ArrayList<>();
    }

    public List<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(List<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public List<Prescripcion> getPrescripciones() {
        return prescripciones;
    }

    public void setPrescripciones(List<Prescripcion> prescripciones) {
        this.prescripciones = prescripciones;
    }

    public List<ResultadoExamen> getResultadosExamenes() {
        return resultadosExamenes;
    }

    public void setResultadosExamenes(List<ResultadoExamen> resultadosExamenes) {
        this.resultadosExamenes = resultadosExamenes;
    }

    public void agregarDiagnostico(Diagnostico diagnostico) {
        diagnosticos.add(diagnostico);
    }

    public void agregarPrescripcion(Prescripcion prescripcion) {
        prescripciones.add(prescripcion);
    }

    public void agregarResultadoExamen(ResultadoExamen resultadoExamen) {
        resultadosExamenes.add(resultadoExamen);
    }

    
}
