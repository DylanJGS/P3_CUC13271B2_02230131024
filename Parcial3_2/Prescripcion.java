
package Parcial3_2;

public class Prescripcion {
    private String medicamento;
    private String dosis;

    public Prescripcion(String medicamento, String dosis) {
        this.medicamento = medicamento;
        this.dosis = dosis;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
}