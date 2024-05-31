
package Parcial3_2;

public class ResultadoExamen {
    private String tipo;
    private String resultado;

    public ResultadoExamen(String tipo, String resultado) {
        this.tipo = tipo;
        this.resultado = resultado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
