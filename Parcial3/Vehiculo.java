
package Parcial3;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    public Vehiculo(String marca, String modelo, int año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    
    public String getMarca() 
    { return marca; }
    public void setMarca(String marca)
    { this.marca = marca; }
    public String getModelo() 
    { return modelo; }
    public void setModelo(String modelo) 
    { this.modelo = modelo; }
    public int getAño() 
    { return año; }
    public void setAño(int año) 
    { this.año = año; }
    public int getKilometraje() 
    { return kilometraje; }
    public void setKilometraje(int kilometraje)
    { this.kilometraje = kilometraje; }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + año + ")";
    }
    
public class Automovil extends Vehiculo {
    public Automovil(String marca, String modelo, int año, int kilometraje) {
        super(marca, modelo, año, kilometraje);
    }
}

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, int año, int kilometraje) {
        super(marca, modelo, año, kilometraje);
    }
}

public class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo, int año, int kilometraje) {
        super(marca, modelo, año, kilometraje);
    }
}
}

